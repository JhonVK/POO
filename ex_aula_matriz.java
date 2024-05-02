import java.util.Scanner;
public class ex_aula_matriz{
    public static void main(String[] args){
        int n, m;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        n=ler.nextInt();
        System.out.println("Digite o valor de m: ");
        m=ler.nextInt();

        int matriz[][]= new int[n][m];
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            matriz[i][j]=ler.nextInt();
            }
        }
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            System.out.println("valor da matriz["+i+"]["+j+"]="+matriz[i][j]);
        }
    }
        ler.close();
}}