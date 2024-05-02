import java.util.Scanner;
public class ex6_L2{
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        double[] vetor;
        double menor=0, maior=0, media=0;
        vetor= new double[20];
        for(int i=0; i<vetor.length; i++){
            vetor[i]=ler.nextDouble();
            media=media+vetor[i];
            if(i==0){
                menor=vetor[i];
                maior=vetor[i];
            }
            if(vetor[i]<menor){
                menor=vetor[i];
            }
            if(vetor[i]>maior){
                maior=vetor[i];
            }
        }
        media=media/20;
        for(int i=0; i<10; i++){
            System.out.println("Elemento "+(i+1)+" :"+vetor[i]);
        }
        System.out.println("Media: "+media);
        System.out.println("Menor elemento: "+menor);
        System.out.println("Maior elemento: "+maior);



        ler.close();  
    }
}
