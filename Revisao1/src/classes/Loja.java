package classes;
import java.util.ArrayList;
public class Loja {
    private ArrayList<Animal> lista;
    private String nomeLoja;
    private int max;

    public Loja(String nome){
        this.nomeLoja=nome;
        this.max=10;
        this.lista = new ArrayList<>(max);
    }

    public void inserir(Animal animalx){
        if(lista.size()<10){
            lista.add(animalx);
            System.out.println("Animal inserido");
        }
    }
    public void remover(Animal animalz){
        if(lista.size()>0){
            lista.remove(animalz);
        }
    }
    public String getNome(){
        return this.nomeLoja;
    }



}
