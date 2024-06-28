package classes;

public class usuario implements autenticavel {
    private int senha;
    private String nome;

    public usuario(int senh, String nom){
        this.senha=senh;
        this.nome=nom;
    }



    @Override
    public boolean autenticar(String usuario, int senha) {
        if(this.nome==usuario && this.senha==senha){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean redefinirSenha(String usuario, int novaSenha) {
       this.senha=novaSenha;
       this.nome=usuario;
       return true;
    }
    
}
