package classes;

import java.util.ArrayList;

public class empresa{

    private static ArrayList<funcionario> listaFuncionarios = new ArrayList<funcionario>();


    public void adicionarFuncionario(funcionario funcionario1){
        listaFuncionarios.add(funcionario1);
    }

    public static void mostrarFuncionario(){
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            funcionario elem = listaFuncionarios.get(i);
             elem.getInfos();
       
    }
}
    public static void todosTrabalham(){
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            funcionario elem = listaFuncionarios.get(i);
             elem.trabalhar();
    
}
}
}