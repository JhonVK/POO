package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//JLabel: Exibe texto/imagens.
//JPanel: Organiza e agrupa componentes.
//JFrame: Janela principal da aplicação.

public class MainFrameApp extends JFrame implements ActionListener {
    private Container tela= getContentPane();
    private JPanel panel;
    private ImageIcon iconeJogo;
    private JLabel imagem;
    private JButton botao1, botao2, botao3;
    public MainFrameApp() {

        super("Dungeon Fighter");
        panel = new FundoPainel("lib\\fundo2.jpg");
        panel.setLayout(null);
        

        iconeJogo= new ImageIcon("lib\\logo3.png");
        imagem= new JLabel(iconeJogo);
        imagem.setBounds(160, 0, 350, 320);
        panel.add(imagem);

        botao1=new JButton("Jogar");
        botao1.setForeground(Color.RED);
        botao2=new JButton("DEBUG");
        botao2.setForeground(Color.RED);
        botao3=new JButton("Sair");
        botao3.setForeground(Color.RED);

     
        botao1.setBounds(230,450,200,50);
        botao1.setFont(new Font("Arial", Font.BOLD, 28));
        botao1.setBorderPainted(false);
        botao1.setOpaque(false);
        botao1.setContentAreaFilled(false); 
        botao1.setFocusPainted(false); 
        panel.add(botao1);

   
        botao2.setBounds(230,500,200,50);
        botao2.setFont(new Font("Arial", Font.BOLD, 28));
        botao2.setBorderPainted(false);
        botao2.setOpaque(false);
        botao2.setContentAreaFilled(false); 
        botao2.setFocusPainted(false); 
        botao2.setBackground(Color.white);
        panel.add(botao2);

      
        botao3.setBounds(230,550,200,50);
        botao3.setFont(new Font("Arial", Font.BOLD, 28));
        botao3.setBorderPainted(false);
        botao3.setOpaque(false);
        botao3.setContentAreaFilled(false); 
        botao3.setFocusPainted(false); 
        botao3.setBackground(Color.white);
        panel.add(botao3);

        
        tela.add(panel);

        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);

        setSize(700, 700);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent evento) {
       if(evento.getSource()==botao1){
        new SelecaoClasses();
        dispose();
       }else if(evento.getSource()==botao2){
        
       }else if(evento.getSource()==botao3){
        dispose();
       }
        }
    }
