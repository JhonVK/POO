import java.util.Scanner;
public class inverte{
    public static void main(String[] args){
        int t=0, temp=0;
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        t=ler.nextInt();
        int vetor[]=new int[t];
        int tamanho= (vetor.length-1);

    for(int i=0; i<vetor.length; i++){
        vetor[i]=ler.nextInt();
    }
    for(int i=0; i<vetor.length/2; i++){
        temp=vetor[i];
        vetor[i]=vetor[tamanho];
        vetor[tamanho]=temp;
        tamanho--;
    }
    for(int i=0; i<vetor.length; i++){
        System.out.println("Elemento "+(i+1)+" :"+vetor[i]);
    }

    ler.close();
    }


}