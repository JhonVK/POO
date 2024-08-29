package classes;

public class Paladino extends Personagem implements IntefaceHab {

private int defesaHab;

public Paladino(int ataque, int defesa, int saude, String nome){
    super(ataque, defesa, saude, nome);
    this.defesaHab=2;
}

public String getHab() {
    return "Habilidade Saude +100%";
}
public String getNomeclass(){
    return "Paladino";
}
public void setHab(){
    this.saude=this.saude*this.defesaHab;
}
public String getImagem() {
    return "lib\\paladino.png";
}

    
}


