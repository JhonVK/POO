package classes;

public class Cachorro extends Animal implements Som {
    private String raca;

    public Cachorro(String nome, String raca){
        super(nome);
        this.raca=raca;
    }
    public void emitirSom(){
        System.out.println("Cachorro late");
    }
    public String getRaca(){
        return this.raca;
    }
    public void setRaca(String raca){
        this.raca=raca;
    }
}
