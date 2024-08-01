package classes;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//JLabel: Exibe texto/imagens.
//JPanel: Organiza e agrupa componentes.
//JFrame: Janela principal da aplicação.


public class Jogo extends JFrame implements ActionListener {

    private int comprimento=12;
    private int largura=5;

    private Container tela= getContentPane();
    private JPanel painel;
    private JButton [][]botoes;

    public Jogo() {
        super("Dungeon Fighter");
        botoes=new JButton[comprimento][largura];
        painel= new JPanel();
        painel.setLayout(new GridLayout(largura, comprimento));

        for(int i=0; i<largura; i++){
            for(int j=0; j<comprimento; j++){
                botoes[j][i] = new JButton();
                botoes[j][i].addActionListener(this);
                painel.add(botoes[j][i]);
            }
        }
        
       tela.add(painel);
       setSize(800, 400);
       setLocationRelativeTo(null);
       setVisible(true);
    }


    public void actionPerformed(ActionEvent evento) {
       
    }
    public static void main(String[] args) {
        new Jogo();
    }
    }

