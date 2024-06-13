public class Conta1 {
    int numero;
    String dono;
    double saldo;
    double limite;
    Conta1(){
        this.numero=122;
        this.dono="x";
        this.saldo=0;
        this.limite=0;

    }

void limiteOperacoes(int lim){
    this.limite=lim;
}

boolean saca(double valor){
if (this.limite < valor){

        return false;
}else{
        this.saldo = this.saldo - valor;
        this.limite-=valor;
        return true;
}}

void deposita(double quantidade){
        this.saldo = this.saldo + quantidade;
    }

String nome(){
    return this.dono;
}

double saldo(){
    return this.saldo;
}

void transferePara(Conta1 destino, int valor){
    if(this.limite<valor){
        System.out.println("Limite insuficiente para transferencia.");
        
    }else{
    this.saldo=this.saldo-valor;
    destino.saldo+=valor;
    this.limite-=valor;
    }
}

void imprime(){
    System.out.println("Nome do dono: "+this.dono);
    System.out.println("Saldo:"+ this.saldo);
    System.out.println("Limite: "+ this.limite);
}
}
