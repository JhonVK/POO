import classes.OrdenacaoBolha;
import classes.ordenavel;

public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        ordenavel l1 = new OrdenacaoBolha();
        l1.ordenar(vetor);
        System.out.println(vetor[1]);
    }
}

