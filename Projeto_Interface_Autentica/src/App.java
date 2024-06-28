import classes.autenticavel;
import classes.usuario;
public class App {
    public static void main(String[] args) throws Exception {
        autenticavel usuario=new usuario(1472137, "joao");

        if(usuario.autenticar("joao", 1472137)==true){
            usuario.redefinirSenha("Joao Vitor", 157);
            System.out.println("autenticação foi um sucesso e voce mudou a senha e nome");
        }else{
            System.out.println("autenticação falhou");
        }
    }
}
