import classes.Circulo;
import classes.Triangulo;
import classes.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Triangulo t= new Triangulo(10, 10);
        Retangulo r= new Retangulo(10, 10);
        Circulo c= new Circulo(5);
        System.out.println(t.calcularArea());
        System.out.println(r.calcularArea());
        System.out.println(c.calcularArea());
    }
}
