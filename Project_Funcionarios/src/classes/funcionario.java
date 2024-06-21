package classes;
public class funcionario{
    String nome;
    int salario;

    funcionario(String nome, int salario){
        this.nome=nome;
        this.salario=salario;
    }
    void trabalhar(){
        System.out.println(this.nome +"está trabalhando");
    }
    void getInfos(){
        System.out.println(this.nome +" "+this.salario);
    }
}