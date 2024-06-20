package classes;

public class carro extends veiculos {
    public carro(String cor, String modelo){
        super(cor, modelo);
    }
    public void getAcelerar(){
        System.out.println("carro acelerando");
    }
}
