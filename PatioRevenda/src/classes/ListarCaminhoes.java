package classes;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ListarCaminhoes extends JFrame {
    public ListarCaminhoes() {
        super("Lista de Caminhões");

        Container tela = getContentPane();
        setLayout(new BorderLayout());

        // Obter a lista de caminhões do pátio
        List<Caminhao> caminhoes = Patio.getCaminhoes();

        // Converter a lista de caminhões para um array de Strings
        String[] caminhaoArray = new String[caminhoes.size()];
        for (int i = 0; i < caminhoes.size(); i++) {
            caminhaoArray[i] = caminhoes.get(i).toString();
        }

        // Criar a JList com os caminhões
        JList<String> caminhaoList = new JList<>(caminhaoArray);

        // Adicionar a JList a um JScrollPane
        JScrollPane scrollPane = new JScrollPane(caminhaoList);
        tela.add(scrollPane, BorderLayout.CENTER);

        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new ListarCaminhoes();
    }
}
