package classes;

public abstract class Caminhao {
    private String modelo;
    private int ano;
    private int id;
    private double valor;
    private static int contadorId = 0;

    public Caminhao(String modelo, int ano, double valor) {
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.id = ++contadorId;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Ano: " + ano + ", ID: " + id + ", Valor: " + valor;
    }
}