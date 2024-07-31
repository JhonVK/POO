package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//JLabel: Exibe texto/imagens.
//JPanel: Organiza e agrupa componentes.
//JFrame: Janela principal da aplicação.

public class SelecaoClasses extends JFrame implements ActionListener {
    private Container tela= getContentPane();
    private JPanel panel;
    private JButton botao1, botao2, botao3;
    private ImageIcon iconeJogo, guerreiro, paladino, barbaro;
    private JLabel imagem, texto, textobotao1, textobotao2, textobotao3;

    public SelecaoClasses() {
        super("Dungeon Fighter");
        panel=new FundoPainel("lib\\fundo2.jpg");
        panel.setLayout(null);
        
        
        imagem= new JLabel(iconeJogo);
        imagem.setBounds(80, 60, 500, 300);
        panel.add(imagem);

        texto= new JLabel("Escolha Seu Herói: ");
        texto.setBounds(45, 120, 500, 100);
        texto.setFont(new Font("Serif", Font.TYPE1_FONT, 40 ));
        texto.setForeground(Color.white);
        panel.add(texto);
        
        addBotoes();

        tela.add(panel);
        setSize(700, 700);
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setVisible(true);
    }
    private void addBotoes(){
 
        guerreiro= new ImageIcon("lib\\soldado.png");
        paladino= new ImageIcon("lib\\paladino.png");
        barbaro= new ImageIcon("lib\\barbaro.png");

        textobotao1 = new JLabel("<html>Soldado:<br>+50% de dano<br>Dano 10<br>Saúde 4<br>Defesa 4</html>");
        textobotao1.setBounds(30, 290, 300, 200);
        textobotao1.setFont(new Font("Serif", Font.TYPE1_FONT, 25 ));
        textobotao1.setForeground(Color.white);
        panel.add(textobotao1);
        botao1= new JButton(guerreiro);
        botao1.setBounds(30,550,200,120);
        botao1.setBorderPainted(false);
        botao1.setOpaque(false);
        botao1.setContentAreaFilled(false); 
        botao1.setFocusPainted(false); 
        botao1.setBackground(Color.WHITE);
        panel.add(botao1);
        
        textobotao2= new JLabel("<html>Paladino:<br>+50% de vida<br>Dano 4<br>Saúde 8<br>Defesa 6</html>");
        textobotao2.setBounds(235, 290, 300, 200);
        textobotao2.setFont(new Font("Serif", Font.TYPE1_FONT, 25 ));
        textobotao2.setForeground(Color.white);
        panel.add(textobotao2);
        botao2= new JButton(paladino);
        botao2.setBounds(235,550,200,120);
        botao2.setBorderPainted(false);
        botao2.setOpaque(false);
        botao2.setContentAreaFilled(false); 
        botao2.setFocusPainted(false); 
        panel.add(botao2);

        textobotao3= new JLabel("<html>Bárbaro:<br>+50% de Defesa<br>Dano 7<br>Saúde 4<br>DEFESA 7</html>");
        textobotao3.setBounds(440, 290, 300, 200);
        textobotao3.setFont(new Font("Serif", Font.TYPE1_FONT, 25 ));
        textobotao3.setForeground(Color.white);
        panel.add(textobotao3);
        botao3= new JButton(barbaro);
        botao3.setBorderPainted(false);
        botao3.setOpaque(false);
        botao3.setContentAreaFilled(false); 
        botao3.setFocusPainted(false); 
        botao3.setBackground(Color.WHITE);
        botao3.setBounds(440,550,200,120);
        panel.add(botao3);

        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botao1) {
            Personagem soldado= new Soldado(10, 4, 4, "zz");
            new TelaAtributos(soldado);
        } else if (evento.getSource() == botao2) {
            Personagem paladino= new Paladino(4, 6, 8, "zz");
            new TelaAtributos(paladino);
        } else if (evento.getSource() == botao3) {
            Personagem barbaro= new Barbaro(7, 7, 4, "zz");
            new TelaAtributos(barbaro);
        }
    }
}