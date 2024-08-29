package classes;

import java.util.Random;

public class Monstro extends Personagem{
    
    Random gerador = new Random();

    public Monstro(int ataque, int defesa, int saude, String nome){
        super(ataque, defesa, saude, nome);
    }

    public String getNomeclass() {
        return "Monstro feio";
    }
    

    public String getImagem() {
        return "lib\\monster.png";
    }

}
