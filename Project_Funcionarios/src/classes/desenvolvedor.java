package classes;

public class desenvolvedor extends funcionario {
    private String linguagem;

    public desenvolvedor(String nome, int salario, String linguagem){
        super(nome, salario);
        this.linguagem=linguagem;
    }
    void trabalhar(){
        System.out.println(this.nome+" esta desenvolvendo em "+this.linguagem);
        
    }
}
