package classes;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ListarCaminhoes extends JFrame {
    private List<Caminhao> caminhoes;
    private Container tela;
    private String[] caminhaoArray;
    private JList<String> caminhaoList;
    private JScrollPane scrollPane;
    public ListarCaminhoes() {
        super("Lista de Caminhões");

        tela = getContentPane();
        setLayout(new BorderLayout());

        caminhoes = Patio.getCaminhoes();

        caminhaoArray = new String[caminhoes.size()];
        for (int i = 0; i < caminhoes.size(); i++) {
            caminhaoArray[i] = caminhoes.get(i).toString();
        }

        caminhaoList = new JList<>(caminhaoArray);

        scrollPane = new JScrollPane(caminhaoList);
        tela.add(scrollPane, BorderLayout.CENTER);

        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new ListarCaminhoes();
    }
}
