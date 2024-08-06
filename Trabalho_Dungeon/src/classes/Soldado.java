package classes;

public class Soldado extends Personagem implements IntefaceHab {

private double danoHab;

public Soldado(int ataque, int defesa, int saude, String nome){
    super(ataque, defesa, saude, nome);
    this.danoHab=0.5;
}


public double getHab() {
    return this.danoHab;
}
public String getNomeclass(){
    return "Soldado";
}
public String getImagem() {
    return "lib\\soldado.png";
}
    
}
