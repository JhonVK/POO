package classes;

public class Paladino extends Personagem implements IntefaceHab {

private double defesaHab;

public Paladino(int ataque, int defesa, int saude, String nome){
    super(ataque, defesa, saude, nome);
    this.defesaHab=0.5;
}

public double getHab(){
    return this.defesaHab;
}
public String getNomeclass(){
    return "Paladino";
}
    
}


