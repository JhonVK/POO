package classes;

public class Retangulo extends FiguraGeometrica {
    
    int x, y;
    public Retangulo(int x, int y){
        this.x=x;
        this.y=y;
    }

    
    public double calcularArea() {
        return (this.x*this.y);
    }
}
