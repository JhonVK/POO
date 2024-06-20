import java.util.ArrayList;
import java.util.Scanner;

import classes.veiculos;
import classes.moto;
import classes.carro;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        int menu=0;
        String cor; String modelo;

        while(menu!=5){
            System.out.println("1-adicionar moto | 2-adicionar carro | 3-listar: ");
            menu=ler.nextInt();
                 switch (menu) {
                        case 1:
                            System.out.println("Digite cor e modelo da moto  ");
                            cor=ler.next();
                            modelo=ler.next();
                            addMoto(cor, modelo);
                             break;
                        case 2:
                            System.out.println("Digite cor e modelo do carro  ");                     
                            cor=ler.next();
                            modelo=ler.next();
                            addCarro(cor, modelo);
                            break;
                        case 3:
                            for (int i = 0; i < listaVeiculos.size(); i++) {
                                 veiculos elem = listaVeiculos.get(i);
                                  elem.getAcelerar();
                                  elem.getModelo();
                                  elem.getCor();
                            
                           }


            }
        }
        ler.close();
    }

private static ArrayList<veiculos> listaVeiculos = new ArrayList<veiculos>();

      public static void addMoto(String cor, String modelo) {
        moto novaMoto = new moto(cor, modelo);
        listaVeiculos.add(novaMoto);
      }
      public static void addCarro(String cor, String modelo) {
        carro novoCarro = new carro(cor, modelo);
        listaVeiculos.add(novoCarro);
      }

}