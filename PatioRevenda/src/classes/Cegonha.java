package classes;
public class Cegonha extends Caminhao {
    private int cargaMaxAutomoveis;

    public Cegonha(String modelo, int ano, int cod, double valor, int cargaMaxAutomoveis) {
        super(modelo, ano, valor);
        this.cargaMaxAutomoveis = cargaMaxAutomoveis;
    }

    public int getCargaMaxAutomoveis() {
        return cargaMaxAutomoveis;
    }

    public void setCargaMaxAutomoveis(int cargaMaxAutomoveis) {
        this.cargaMaxAutomoveis = cargaMaxAutomoveis;
    }

    @Override
    public String toString() {
        return super.toString() + ", Carga Máxima de Automóveis: " + cargaMaxAutomoveis;
    }
}