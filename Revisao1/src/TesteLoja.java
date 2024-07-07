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
        Gato cat=new Gato("gatinho", "liso");
        Passaro pas1=new Passaro("papa", "branca");
        Peixe peix1=new Peixe("nemo", "salgada");
        loja1.inserir(cah1);
        loja1.inserir(cat);
        loja1.inserir(pas1);
        loja1.inserir(peix1);
        loja1.listar();
    }
}
