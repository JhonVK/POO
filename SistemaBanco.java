public class SistemaBanco {
    public static void main(String[] args) {
    boolean consegui;
    Conta minhaConta;
    minhaConta = new Conta();
    minhaConta.dono = "Maria";
    minhaConta.deposita(500.0);
    System.out.println("Saldo: " + minhaConta.saldo);
    consegui = minhaConta.saca(500.0);

    if(consegui == true){
        System.out.println("Saque realizado com sucesso.");
    }else{
        System.out.println("Saldo insuficiente");
    }
    System.out.println("Saldo atual: " + minhaConta.saldo);

    System.out.println("Nome: "+ minhaConta.nome());
   
    System.out.println("Saldo Atual: "+ minhaConta.saldo());
    }

}