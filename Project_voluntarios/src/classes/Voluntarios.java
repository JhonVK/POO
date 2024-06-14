package classes;

public class Voluntarios {
    private String nome, habilidade, dia, telefone;
    private int codigo=0;

    public Voluntarios(String nome, String habilidade, String dia, String telefone){
        this.nome=nome;
        this.habilidade=habilidade;
        this.telefone=telefone;
        this.dia=dia;
        this.codigo=codigo++;
    }
    public void setInformação(String nome, String habilidade, String dia, String telefone){
        this.nome=nome;
        this.habilidade=habilidade;
        this.telefone=telefone;
        this.dia=dia;
    }
    public String getInformacaoes(){
        return (this.nome+ this.habilidade+ this.dia+this.telefone);
    }

    public String getname(){
        return this.nome;
    }
    public String getDia(){
        return this.dia;
    }
    public int getCodigo(){
        return this.codigo;
    }
    
}
