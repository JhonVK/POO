package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaGameOver extends JFrame implements ActionListener{
    private Container tela= getContentPane();
    private JPanel panel;
    private ImageIcon iconeJogo;
    private JLabel imagem;
    private JButton botao3;
    public TelaGameOver(String mensagem) {
        super("Game Over");
        panel = new FundoPainel("lib\\fundo2.jpg");
        panel.setLayout(null);        

        iconeJogo= new ImageIcon("lib\\logo3.png");
        imagem= new JLabel(iconeJogo);
        imagem.setBounds(160, 0, 350, 320);
        panel.add(imagem);


        botao3=new JButton("Sair");
        botao3.setForeground(Color.RED);


      
        botao3.setBounds(230,550,200,50);
        botao3.setFont(new Font("Arial", Font.BOLD, 28));
        botao3.setBorderPainted(false);
        botao3.setOpaque(false);
        botao3.setContentAreaFilled(false); 
        botao3.setFocusPainted(false); 
        botao3.setBackground(Color.white);
        panel.add(botao3);

        
        tela.add(panel);

        botao3.addActionListener(this);

        setSize(700, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource()==botao3){
         dispose();
        }
    }
}