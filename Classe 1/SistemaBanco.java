public class SistemaBanco {
    public static void main(String[] args) {
    boolean consegui;
    Conta minhaConta;
    Conta minhaConta2;

    minhaConta = new Conta();
    minhaConta2 = new Conta();

    minhaConta.dono = "Maria";
    minhaConta2.dono = "Pedro";

    minhaConta.deposita(5000.0);
    minhaConta2.deposita(5000.0);

    minhaConta.limiteOperacoes(10000);
    minhaConta2.limiteOperacoes(10000);

    System.out.println("Saldo conta 1: " + minhaConta.saldo);
    System.out.println("Saldo conta 2: " + minhaConta2.saldo);

    consegui = minhaConta.saca(1000.0);

    if(consegui == true){
        System.out.println("Saque realizado com sucesso conta 1.");
    }else{
        System.out.println("Saldo insuficiente conta 1");
    }
    
    consegui = minhaConta2.saca(1000);

    if(consegui == true){
        System.out.println("Saque realizado com sucesso conta 2.");
    }else{
        System.out.println("Saldo insuficiente conta 2");
    }

    //transferindo
    minhaConta.transferePara(minhaConta2, 50);
    
    //imprimindo
    minhaConta.imprime();
    minhaConta2.imprime();
    }

}