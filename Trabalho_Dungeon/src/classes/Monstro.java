package classes;

import java.util.Random;

public class Monstro extends Personagem{
    
    private int dano;
    Random gerador = new Random();

    public Monstro(int ataque, int defesa, int saude, String nome){
        super(ataque, defesa, saude, nome);
        this.dano=gerador.nextInt(12);
    }

    public String getNomeclass() {
        return "Monstro feio";
    }
    

    public String getImagem() {
        return "lib\\monster.png";
    }


    

}
