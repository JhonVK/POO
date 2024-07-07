import classes.Gato;
import classes.Passaro;
import classes.Som;
import classes.Peixe;
import classes.Loja;
import classes.Cachorro;

public class TesteLoja {
    public static void main(String[] args) throws Exception {
        Loja loja1= new Loja("casas bahia");
        Cachorro cah1=new Cachorro("maggie", "Linguicinha");
        loja1.inserir(cah1);
    }
}
