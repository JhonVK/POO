package classes;

public class Guerreiro extends Personagem {

private double defesaHab;

public Guerreiro(double ataque, double defesa, double saude, String nome){
    super(ataque, defesa, saude, nome);
    this.defesaHab=0.5;
}
    
}
