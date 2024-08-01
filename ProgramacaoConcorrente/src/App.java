public class App {
    public static void main(String[] args) throws Exception {
        int [][]matriz= new int[5][2];
        for(int i=0; i<5; i++){
            for(int j=0; j<2; j++){
                matriz[i][j]=j+1;
            }
        }
        Thread1 thread= new Thread1(matriz);
        Thread2 thread2= new Thread2(matriz);

        thread.start();
        thread2.start();
        thread.join();
        System.out.println(thread.soma);
    }
}

class Thread1 extends Thread{
    int [][]vetor;
    int soma;
    public Thread1(int [][]vetor){
        this.vetor=vetor;
    }
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(vetor[i][0]);
            soma+=vetor[i][0];
            try {
                Thread.sleep(50); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Thread2 extends Thread{
    int [][]vetor;
    Thread2(int [][]vetor){
        this.vetor=vetor;
    }
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(vetor[i][1]);
            
        }
    }
    
}