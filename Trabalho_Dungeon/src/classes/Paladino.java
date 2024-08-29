package classes;

public class Paladino extends Personagem implements IntefaceHab {

private double defesaHab;

public Paladino(int ataque, int defesa, int saude, String nome){
    super(ataque, defesa, saude, nome);
    this.defesaHab=0.5;
}

public void getHab() {
    this.saude=this.saude*this.saude;
}
public String getNomeclass(){
    return "Paladino";
}
public void setHab(){
    this.saude=this.saude*this.saude;
}
public String getImagem() {
    return "lib\\paladino.png";
}

    
}


