package classes;


public class Thread1 extends Thread{
    private int [][]vetor;
    public int soma;
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
    public int getSoma(){
        return this.soma;
    }
}
