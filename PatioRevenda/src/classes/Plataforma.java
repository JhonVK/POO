package classes;

public class Plataforma extends Caminhao {
    private double tamanhoCarroceria;

    public Plataforma(String modelo, int ano, int cod, double valor, double tamanhoCarroceria) {
        super(modelo, ano, valor);
        this.tamanhoCarroceria = tamanhoCarroceria;
    }

    public double getTamanhoCarroceria() {
        return tamanhoCarroceria;
    }

    public void setTamanhoCarroceria(double tamanhoCarroceria) {
        this.tamanhoCarroceria = tamanhoCarroceria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamanho da Carroceria: " + tamanhoCarroceria + " metros";
    }
}