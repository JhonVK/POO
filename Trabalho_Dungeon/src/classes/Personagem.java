package classes;
public abstract class Personagem{

protected int ataque;
protected int defesa;
protected int saude;
private String nome;

public Personagem(int ataque, int defesa, int saude, String nome){
    this.ataque=ataque;
    this.defesa=defesa;
    this.saude=saude;
    this.nome=nome;
}

public abstract String getNomeclass();

void setAtaque(int ataque){
    this.ataque=ataque;
}
void setDecreasevida(int decre){
    this.saude-=decre;
}
void setDefesa(int defesa){
    this.defesa=defesa;
}
void setSaude(int saude){
    this.saude=saude;
}
int getAtaque(){
    return this.ataque;
}
void setHab(){
    
}
int getDefesa(){
    return this.defesa;
}
int getSaude(){
    return this.saude;
}
String getNome(){
    return this.nome;
}
abstract String getImagem();
}