package classes;

public class Circulo extends FiguraGeometrica{
    double raio;
    public Circulo(double raio){
        this.raio=raio;
    }
    
    public double calcularArea(){
        return (this.raio*this.raio*3.1415);
    }
}
