package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrameApp extends JFrame implements ActionListener {
    JButton botao1, botao2, botao3, botao4;

    public MainFrameApp() {
        super("Patio");
        Container tela = getContentPane();
        setLayout(null);
        botao1 = new JButton("COMPRAR");
        botao2 = new JButton("VENDER");
        botao3 = new JButton("PATIO");

        botao1.setBounds(50, 20, 200, 20);
        botao1.setForeground(Color.DARK_GRAY);
        botao2.setBounds(50, 80, 200, 20);
        botao2.setForeground(Color.DARK_GRAY);
        botao3.setBounds(260, 20, 100, 20);
        botao3.setForeground(Color.DARK_GRAY);

        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);

        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);

        setSize(430, 180);
        setVisible(true);
        setLocationRelativeTo(null); // posiciona a janela no centro da tela
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botao1) {
            new ComprarCaminhao();
        } else if (evento.getSource() == botao2) {
            new VenderCaminhao();
        } else if (evento.getSource() == botao3) {
            new ListarCaminhoes();
        }
    }

    public static void main(String[] args) {
        new MainFrameApp().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
