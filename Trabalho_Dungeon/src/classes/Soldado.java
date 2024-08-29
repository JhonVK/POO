package classes;

public class Soldado extends Personagem implements IntefaceHab {

private double danoHab;

public Soldado(int ataque, int defesa, int saude, String nome){
    super(ataque, defesa, saude, nome);
    this.danoHab=0.5;
}


public void getHab() {
    this.ataque=this.ataque*this.ataque;
}
public String getNomeclass(){
    return "Soldado";
}
public void setHab(){
    this.saude=this.saude*this.saude;
}

public String getImagem() {
    return "lib\\soldado.png";
}
    
}
