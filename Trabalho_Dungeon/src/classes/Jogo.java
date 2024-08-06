package classes;

import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//JLabel: Exibe texto/imagens.
//JPanel: Organiza e agrupa componentes.
//JFrame: Janela principal da aplicação.


public class Jogo extends JFrame implements ActionListener {

    private int comprimento=12, largura=6, x, y, z, v, posiHeroi, posiMonstro;
    private Personagem personagem;
    private Container tela= getContentPane();
    private JPanel painel;
    private JButton [][]botoes;
    private ImageIcon image, imageHeroi, imageMonstro;

    public Jogo(Personagem personagem) {
        super("Dungeon Fighter");
        this.personagem=personagem;
        
        inicializaJogo();
        setPosicoes();
        
       tela.add(painel);
       setSize(1100, 650);
       setLocationRelativeTo(null);
       setVisible(true);
    }
    private void inicializaJogo(){
        painel=new FundoPainel("lib\\brick.jpg");
        painel.setLayout(null);
        botoes=new JButton[comprimento][largura];
        z=80;
        v=80;
        for(int i=0; i<largura; i++){
            for(int j=0; j<comprimento; j++){
                botoes[j][i] = new JButton();
                botoes[j][i].setContentAreaFilled(false);
                botoes[j][i].setBounds(x, y, z, v);
                botoes[j][i].addActionListener(this);
                painel.add(botoes[j][i]);
                x+=z;
            }
            x=0;
            y+=z;
        }
    }
    private void setPosicoes(){
        Random gerador = new Random();
        imageHeroi= new ImageIcon(personagem.getImagem());
        imageMonstro= new ImageIcon("lib\\monster.png");
        posiHeroi=gerador.nextInt(comprimento);
        posiMonstro=gerador.nextInt(comprimento);

        botoes[posiHeroi][0].setIcon(imageHeroi);
        botoes[posiMonstro][largura-1].setIcon(imageMonstro);
    }

    public void actionPerformed(ActionEvent evento) {
       
    }
    }

