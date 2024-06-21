package classes;

public class gerente extends funcionario {
    private String departamento;

    public gerente(String nome, int salario, String departamento){
        super(nome, salario);
        this.departamento=departamento;
    }
    void trabalhar(){
        System.out.println(this.nome+" esta gerenciando o departamento de "+this.departamento);

    }
}
