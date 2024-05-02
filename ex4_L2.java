import java.util.Scanner;
public class ex4_L2{
    public static void main(String[] args){

Scanner ler= new Scanner(System.in);
int n=0;
double s;
System.out.println("Digite o valor N: ");
n= ler.nextInt();

s=(1.0+1.0/2.0+1.0/3.0+1.0/4.0+1.0/5.0+1.0/n);
System.out.println("Valor de s: "+ s);

ler.close();
    }

}