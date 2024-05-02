import java.util.Scanner;
public class JavaApplication1 {
 public static void main(String[] args) {
 Scanner ler = new Scanner(System.in);
 int a, b;
 float media;
 System.out.println("Digite o primeiro numero:");
 a = ler.nextInt();
 System.out.println("Digite o segundo numero:");
 b = ler.nextInt();
 media = (float)(a+b)/2;
 System.out.println("A media é:" + media);
 System.out.printf("A media é:%.2f\n", media);
 ler.close();
 }
}
