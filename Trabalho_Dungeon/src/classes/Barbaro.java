package classes;

public class Barbaro extends Personagem implements IntefaceHab {

private int defesaHab;

public Barbaro(int ataque, int defesa, int saude, String nome){
    super(ataque, defesa, saude, nome);
    this.defesaHab=2;
}
public String getNomeclass(){
    return "Barbaro";
}

public String getHab() {
    return "Habilidade Defesa +100%";
}

public void setHab(){
    this.defesa=this.defesa*this.defesaHab;
}
public String getImagem() {
    return "lib\\barbaro.png";
}
}
