
public class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;

boolean saca(double valor){
if ((this.saldo+this.limite) < valor){
        return false;
}else{
        this.saldo = this.saldo - valor;
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
}
