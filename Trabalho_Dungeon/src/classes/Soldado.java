package classes;

public class Soldado extends Personagem implements IntefaceHab {

private int danoHab;

public Soldado(int ataque, int defesa, int saude, String nome){
    super(ataque, defesa, saude, nome);
    this.danoHab=2;
}


public String getHab() {
    return "Habilidade Ataque +100%";
}

public String getNomeclass(){
    return "Soldado";
}
public void setHab(){
    this.saude=this.saude*this.danoHab;
}

public String getImagem() {
    return "lib\\soldado.png";
}
    
}
