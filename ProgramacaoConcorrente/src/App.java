import classes.Thread1;
import classes.Thread2;

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
        System.out.println("soma 1: "+ thread.soma);
        System.out.println("soma 2: "+ thread2.soma);
    }
}

