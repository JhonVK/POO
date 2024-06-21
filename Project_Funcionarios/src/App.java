import classes.empresa;
import classes.funcionario;
import classes.gerente;
import classes.desenvolvedor;

public class App {
    public static void main(String[] args) throws Exception {
        empresa empresa1=new empresa();

        funcionario gerente1=new gerente("Carlos", 8000, "TI");

        funcionario desenvolvedor1=new desenvolvedor("Ana", 5000, "java");
        funcionario desenvolvedor2=new desenvolvedor("Pedro", 4500, "Python");

        empresa1.adicionarFuncionario(gerente1);
        empresa1.adicionarFuncionario(desenvolvedor1);
        empresa1.adicionarFuncionario(desenvolvedor2);
        empresa.mostrarFuncionario();
        empresa.todosTrabalham();
    }
}
