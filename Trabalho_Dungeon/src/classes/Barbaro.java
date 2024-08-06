package classes;

public class Barbaro extends Personagem implements IntefaceHab {

private double defesaHab;

public Barbaro(int ataque, int defesa, int saude, String nome){
    super(ataque, defesa, saude, nome);
    this.defesaHab=0.5;
}
public String getNomeclass(){
    return "Barbaro";
}

public double getHab() {
    return this.defesaHab;
}
public String getImagem() {
    return "lib\\barbaro.png";
}
}
