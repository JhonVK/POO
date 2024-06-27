package classes;

public class Triangulo extends FiguraGeometrica {
    double base, altura;
    public Triangulo(float base, float altura){
        this.base=base;
        this.altura=altura;
    }
   
    public double calcularArea() {
        return((this.base*this.altura)/2);
        
    }
}
