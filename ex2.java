import java.util.Scanner;
public class ex2 {
 public static void main(String[] args) {
for(int i=1; i<=10; i++){
    for(int j=1; j<=10; j++){
        int result= i*j;
        System.out.println(i+"*"+j +"="+ result);
    }
}

// ex 2b
Scanner ler = new Scanner(System.in);
System.out.println("Digite seu IMC: ");
double imc= ler.nextDouble();
if(imc<20){
    System.out.println("Magro");
}else if(imc>=20 && imc<25){
    System.out.println("Normal");
}else if(imc>=25 && imc<29){
    System.out.println("Acima do peso");
}else if(imc>=29 && imc<30){
    System.out.println("Obeso");
}else if(imc>=30){
    System.out.println("Muito obeso");
}
// ex 3
int a, b, c;

System.out.println("Digite A: ");
a=ler.nextInt();
System.out.println("Digite B: ");
b=ler.nextInt();
System.out.println("Digite C: ");
c=ler.nextInt();

System.out.println("O delta é: "+ (b*b-4*a*c));

ler.close();

}

}