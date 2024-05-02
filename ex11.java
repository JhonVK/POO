import java.util.Scanner;
public class ex11 {
 public static void main(String[] args) {
 Scanner ler = new Scanner(System.in);
 double a, b;
 a = ler.nextDouble();
 b = ler.nextDouble();

if(a<b){
    System.out.println("A diferença é:" + (b-a));
}else{
    System.out.println("A diferença é:" + (a-b));
}

ler.close();
}

}