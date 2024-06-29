package classes;

public class OrdenacaoBolha implements ordenavel {

    @Override
    public void ordenar(int[] vetor) {
    int temp=0;
       for(int i=0; i<vetor.length; i++){
            for(int j=0; j<vetor.length-i-1; j++){
                if(vetor[j]>vetor[j+1]){
                    temp=vetor[j+1];
                    vetor[j+1]=vetor[j];
                    vetor[j]=temp;
                }
        
        }

       }
    }
    
}
