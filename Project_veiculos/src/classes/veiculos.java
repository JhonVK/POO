package classes;

abstract public class veiculos {
    private String cor;
    private String modelo;

    public veiculos(String cor, String modelo){
        this.cor=cor;
        this.modelo=modelo;
    }

    public abstract void getAcelerar();

    public String getCor(){
        return this.cor;
    }
       
    public String getModelo(){
        return this.modelo;
    }
}
