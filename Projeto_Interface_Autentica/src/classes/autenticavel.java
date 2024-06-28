package classes;
public interface autenticavel{

    boolean autenticar(String usuario, int senha);
    boolean redefinirSenha(String usuario, int novaSenha);


}