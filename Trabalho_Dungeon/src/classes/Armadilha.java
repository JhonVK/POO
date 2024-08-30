package classes;

import java.util.Random;

public class Armadilha extends Personagem {
    Random gerador = new Random();

    public Armadilha(int ataque, int defesa, int saude, String nome){
        super(ataque, defesa, saude, nome);
    }

    public String getNomeclass() {
        return "armadilha";
    }

    public String getImagem() {
        return "lib\\trap.png";
    }
    

}
