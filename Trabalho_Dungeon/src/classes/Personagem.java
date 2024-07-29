package classes;
public abstract class Personagem{

private double ataque, defesa, saude;
private String nome;

public Personagem(double ataque, double defesa, double saude, String nome){
    this.ataque=ataque;
    this.defesa=defesa;
    this.saude=saude;
    this.nome=nome;
}

}