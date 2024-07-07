package classes;

public class Peixe extends Animal{
    private String tipoAgua;

    public Peixe(String nome, String tipoAgua){
        super(nome);
        this.tipoAgua=tipoAgua;
    }
    public String getPena(){
        return this.tipoAgua;
    }
    public void setPena(String tipoAgua){
        this.tipoAgua=tipoAgua;
    }
}
