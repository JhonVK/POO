package classes;

public class Passaro extends Animal implements Som {
    private String tipoPena;

    public Passaro(String nome, String tipoPena){
        super(nome);
        this.tipoPena=tipoPena;
    }
    public void emitirSom(){
        System.out.println("Passaro canta");
    }
    public String getPena(){
        return this.tipoPena;
    }
    public void setPena(String tipoPena){
        this.tipoPena=tipoPena;
    }
}
