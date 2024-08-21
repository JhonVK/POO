package classes;

import javax.swing.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//JLabel: Exibe texto/imagens.
//JPanel: Organiza e agrupa componentes.
//JFrame: Janela principal da aplicação.


public class Jogo extends JFrame implements ActionListener {

    private Map<JButton, Point> posicoesbotoes = new HashMap<>();

    private int comprimento=12, largura=6, x, y, z, v, posiHeroix, posiHeroiy, posiMonstrox, posiMonstroy;
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
                posicoesbotoes.put(botoes[j][i], new Point(j, i));
                x+=z;
            }
            x=0;
            y+=z;
        }
    }
    private void moveParaCima() {
        if (posiHeroiy > 0) { // Verifica se não está na borda superior do grid
            botoes[posiHeroix][posiHeroiy].setIcon(null);
            posiHeroiy--;
            botoes[posiHeroix][posiHeroiy].setIcon(imageHeroi);
        }
        verificaColisao();
    }
    
    private void moveParaBaixo() {
        if (posiHeroiy < largura - 1) { // Verifica se não está na borda inferior do grid
            botoes[posiHeroix][posiHeroiy].setIcon(null);
            posiHeroiy++;
            botoes[posiHeroix][posiHeroiy].setIcon(imageHeroi);
        }
        verificaColisao();
    }
    
    private void moveParaEsquerda() {
        if (posiHeroix > 0) { // Verifica se não está na borda esquerda do grid
            botoes[posiHeroix][posiHeroiy].setIcon(null);
            posiHeroix--;
            botoes[posiHeroix][posiHeroiy].setIcon(imageHeroi);
        }
        verificaColisao();
    }
    
    private void moveParaDireita() {
        if (posiHeroix < comprimento - 1) { // Verifica se não está na borda direita do grid
            botoes[posiHeroix][posiHeroiy].setIcon(null);
            posiHeroix++;
            botoes[posiHeroix][posiHeroiy].setIcon(imageHeroi);
        }
        verificaColisao();
    }
    
    private void verificaColisao(){
        if (posiHeroix == posiMonstrox && posiHeroiy == posiMonstroy) {
            JOptionPane.showMessageDialog(this, "Você encontrou o monstro!", "Colisão", JOptionPane.INFORMATION_MESSAGE);

        }



    }
    private void setPosicoes(){
        Random gerador = new Random();
        imageHeroi= new ImageIcon(personagem.getImagem());
        imageMonstro= new ImageIcon("lib\\monster.png");
        posiHeroix=gerador.nextInt(comprimento);
        posiMonstrox=gerador.nextInt(comprimento);
        posiHeroiy=0;
        posiMonstroy=largura-1;

        botoes[posiHeroix][posiHeroiy].setIcon(imageHeroi);
        botoes[posiMonstrox][posiMonstroy].setIcon(imageMonstro);
    }

    public void actionPerformed(ActionEvent evento) {
        JButton clickedButton = (JButton) evento.getSource();
        Point position = posicoesbotoes.get(clickedButton);
        if (position != null) {
            int i = position.x;
            int j = position.y;
            if (i == posiHeroix && j == posiHeroiy + 1) {
                moveParaBaixo();
            } else if (i == posiHeroix && j == posiHeroiy - 1) {
                moveParaCima();
            } else if (i == posiHeroix + 1 && j == posiHeroiy) {
                moveParaDireita();
            } else if (i == posiHeroix - 1 && j == posiHeroiy) {
                moveParaEsquerda();
            }
        } 
            
        
    }
}