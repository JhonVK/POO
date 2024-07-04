package classes;
public class Funcionario {
    private String name;
    private double salary, tax;

    public Funcionario(String name, double tax, double salary){
        this.name=name;
        this.tax=tax;
        this.salary=salary;
    }

    public String getName(){
        return "Employee: "+this.name;
    }
    public Double getSalaryliquid(){
        return (this.salary-this.tax);
    }
    
    public void IncreaseSalary(Double percentage){
        this.salary=this.salary+this.salary*percentage/100;
    }


}
