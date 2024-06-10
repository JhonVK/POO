class test{
    public static void main(String[] args){
    Banco itau = new Banco("Itau");
    Conta b= itau.criaConta("Maria");
    System.out.println(itau.pegaCodB());
    System.out.println(itau.pegaNomeB());
    b = itau.buscaConta(1);
    b = itau.buscaConta(2);
    Banco bb = new Banco("Banco do Brasil");
    Conta jose = bb.criaConta("Jose");
    System.out.println(jose.pegaNome());
    System.out.println(jose.pegaCodigo());
    System.out.println(jose.pegaSaldo());
    jose.aplica(100.0F);
    jose.retira(30.5F);
    System.out.println(jose.pegaSaldo());
    }
   }
   