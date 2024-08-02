package classes;

public class Cliente extends Thread{
    private Cinema cinema;
    private int quantIngressos;
    public Cliente(Cinema x, int y){
        this.cinema=x;
        this.quantIngressos=y;
    }
    public void run(){
        cinema.vendaIngressos(this.quantIngressos);


    }
}
