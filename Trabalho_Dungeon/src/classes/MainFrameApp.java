package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//JLabel: Exibe texto/imagens.
//JPanel: Organiza e agrupa componentes.
//JFrame: Janela principal da aplicação.

public class MainFrameApp extends JFrame implements ActionListener {
    private Container tela= getContentPane();
    private JPanel panel= new JPanel();
    private JButton botao1, botao2, botao3;
    public MainFrameApp() {
        super("Dungeon Fighter");
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        ImageIcon iconeJogo= new ImageIcon("lib\\dungeonhunter.png");
        
        JLabel imagem= new JLabel(iconeJogo);
        imagem.setBounds(50, 30, 500, 200);
        panel.add(imagem);

        JLabel texto= new JLabel("Escolha Seu Herói: ");
        texto.setBounds(210, 250, 300, 100);
        texto.setFont(new Font("Serif", Font.ROMAN_BASELINE, 30 ));
        panel.add(texto);
        
        addBotoes();

        tela.add(panel);
        setSize(700, 700);
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setVisible(true);
    }
    private void addBotoes(){
 
        ImageIcon guerreiro= new ImageIcon("lib\\soldado.png");
        ImageIcon paladino= new ImageIcon("lib\\paladino.png");
        ImageIcon barbaro= new ImageIcon("lib\\barbaro.png");

        JLabel textobotao1 = new JLabel("<html>Guerreiro:<br>Habilidade: + 50% de dano<br>Dano 10<br>Saúde 4<br>Defesa 4</html>");
        textobotao1.setBounds(40, 390, 300, 100);
        textobotao1.setFont(new Font("Serif", Font.ROMAN_BASELINE, 15 ));
        panel.add(textobotao1);
        botao1= new JButton(guerreiro);
        botao1.setBounds(40,500,200,120);
        panel.add(botao1);
        
        JLabel textobotao2= new JLabel("<html>Paladino:<br>Habilidade: + 50% de vida<br>Dano 4<br>Saúde 8<br>Defesa 6</html>");
        textobotao2.setBounds(240, 390, 300, 100);
        textobotao2.setFont(new Font("Serif", Font.ROMAN_BASELINE, 15 ));
        panel.add(textobotao2);
        botao2= new JButton(paladino);
        botao2.setBounds(240,500,200,120);
        panel.add(botao2);

        JLabel textobotao3= new JLabel("<html>Bárbaro:<br>Habilidade: + 50% de Defesa<br>Dano 7<br>Saúde 4<br>Defesa 7</html>");
        textobotao3.setBounds(440, 390, 300, 100);
        textobotao3.setFont(new Font("Serif", Font.ROMAN_BASELINE, 15 ));
        panel.add(textobotao3);
        botao3= new JButton(barbaro);
        botao3.setBounds(440,500,200,120);
        panel.add(botao3);

        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botao1) {
            
        } else if (evento.getSource() == botao2) {
           
        } else if (evento.getSource() == botao3) {
     
        }
    }
}