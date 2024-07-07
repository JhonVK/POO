package classes;

public class Gato extends Animal implements Som {
    private String tipoPelo;

    public Gato(String nome, String tipoPelo){
        super(nome);
        this.tipoPelo=tipoPelo;
    }
    public void emitirSom(){
        System.out.println("Gato mia");
    }
    public String getPelo(){
        return this.tipoPelo;
    }
    public void setPelo(String tipoPelo){
        this.tipoPelo=tipoPelo;
    }
}
