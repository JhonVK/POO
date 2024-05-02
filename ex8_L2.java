import java.util.Scanner;
public class ex8_L2{
    public static void main(String[] args){
        int t=0, temp=0, menor=0;
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        t=ler.nextInt();
        int vetor[]=new int[t];

    for(int i=0; i<vetor.length; i++){
        vetor[i]=ler.nextInt();
    }
    for(int i=0; i<vetor.length; i++){
        System.out.println("Elemento "+(i+1)+" :"+vetor[i]);
    }

    for(int j=0; j<vetor.length; j++){
        for(int i=0; i<vetor.length; i++){
            if(vetor[i]<menor){
                menor=vetor[i];
            }
        }
    }
    ler.close();
    }

}