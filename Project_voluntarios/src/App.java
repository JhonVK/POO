import java.util.ArrayList;
import java.util.Scanner;
import classes.Voluntarios;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        int menu=0;

 while(menu!=5){
System.out.println("Digite o codigo do menu: ");
menu=ler.nextInt();
    switch (menu) {
        case 1:
                System.out.println("Digite nome, habilidade, dia e telefone ");
                String nome, habilidade, dia, telefone;
                nome=ler.next();
                habilidade=ler.next();
                dia=ler.next();
                telefone=ler.next();
                addVoluntario(nome, habilidade, dia, telefone);
            break;
        case 2:

        System.out.println("Digite o codigo para mudar registro: ");
        int codigo=ler.nextInt();
        for (int i = 0; i < listaVoluntarios.size(); i++) {
                Voluntarios elem = listaVoluntarios.get(i);
                if(elem.getCodigo()==codigo){
                    System.out.println("Achamos o cadastro, digite nome, habilidade, dia e telefone ");
                    nome=ler.next();
                    habilidade=ler.next();
                    dia=ler.next();
                    telefone=ler.next();
                    elem.setInformação(nome, habilidade, dia, telefone);
            }
        }
            break;
        case 3:
        System.out.println("Digite o nome do voluntario que deseja buscar: ");    
        nome=ler.next();
        for (int i = 0; i < listaVoluntarios.size(); i++) {
            Voluntarios elem = listaVoluntarios.get(i);
            if(elem.getname().equals(nome)){
                System.out.println(elem.getname());
            }
           }

            break;
        case 4:

            System.out.println("Digite o dia que deseja buscar funcionarios disponiveis: ");
            dia=ler.next();

        for (int i = 0; i < listaVoluntarios.size(); i++) {
            Voluntarios elem = listaVoluntarios.get(i);
            if(elem.getDia().equals(dia)){
                System.out.println(elem.getname());
            }
        }
            break;
    
    
        default:
            break;
        }


    }

        ler.close();
    }
      private static ArrayList<Voluntarios> listaVoluntarios = new ArrayList<Voluntarios>();

      public static void addVoluntario(String nome, String habilidade, String dia, String telefone) {
          Voluntarios novoVoluntario = new Voluntarios(nome, habilidade, dia, telefone);
          listaVoluntarios.add(novoVoluntario);
      }
}
