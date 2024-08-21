package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrameApp extends JFrame implements ActionListener {
    private JButton botao1, botao2, botao3, botao4;
    private Container tela = getContentPane();
    private JPanel panel;

    public MainFrameApp() {
        super("Painel Caminhoes");
        panel=new JPanel();
        panel.setLayout(null);
        
        botao1 = new JButton("Comprar");
        botao2 = new JButton("Vender");
        botao3 = new JButton("Patio");

        botao1.setBounds(50, 20, 200, 20);
        botao2.setBounds(50, 80, 200, 20);
        botao3.setBounds(260, 20, 100, 20);
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);

        panel.add(botao1);
        panel.add(botao2);
        panel.add(botao3);
        tela.add(panel);

        setSize(430, 180);
        setVisible(true);
        setLocationRelativeTo(null); 

        //Descobri este tal de look and feel, achei legal usar ele e mudar um pouco a UI
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
