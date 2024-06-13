import classes.Funcionario;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        Double porcentage;
      
        System.out.println("Hello, World!");
        Funcionario funcionario1;
        funcionario1= new Funcionario("Joao Silva", 1000, 6000);
        System.out.println(funcionario1.getName()+" "+funcionario1.getSalaryliquid());

        System.out.println("WhicH PERCENTAGE TO INCRESE SALARY?");
        porcentage=ler.nextDouble();
        
        funcionario1.IncreaseSalary(porcentage);

        System.out.println("Update data: "+ funcionario1.getName()+", "+String.format("%.2f", funcionario1.getSalaryliquid()));

        ler.close();
}


}


