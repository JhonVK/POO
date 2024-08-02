import classes.Cinema;
import classes.Cliente;

public class App {
    public static void main(String[] args) {
        Cinema cinema = new Cinema(10);
        Cliente cliente1 = new Cliente(cinema, 2);
        Cliente cliente2 = new Cliente(cinema, 3);
        Cliente cliente3 = new Cliente(cinema, 5);
        cliente1.start();
        cliente2.start();
        cliente3.start();
        try {
            cliente1.join();
            cliente2.join();
            cliente3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Ingressos restantes: " +
        cinema.getIngressosDisponiveis());
    }
}