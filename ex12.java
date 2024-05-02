import java.util.Scanner;
public class ex12 {
 public static void main(String[] args) {
 Scanner ler = new Scanner(System.in);
 int a, b;
 a = ler.nextInt();
 b = ler.nextInt();

if(a%b==0){
    System.out.println(a+ " É multiplo de " + b);
}else if(b%a==0){
    System.out.println(b+ " É multiplo de " + a);
}
ler.close();
 }
}