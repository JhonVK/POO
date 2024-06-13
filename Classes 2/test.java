class Test{
    public static void main(String[] args){
    Banco itau = new Banco("Itau");
 
    System.out.println(itau.pegaCodB());
    System.out.println(itau.pegaNomeB());

    Banco bb = new Banco("Banco do Brasil");
    Conta jose = bb.criaConta("Jose");

    System.out.println(jose.pegaNome());
    System.out.println(jose.pegaCodigo());

    jose.aplica(100.0F);
    jose.retira(30.5F);
    
    System.out.println(jose.pegaSaldo());
    }
   }
   