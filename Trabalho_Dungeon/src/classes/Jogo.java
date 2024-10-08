package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Jogo extends JFrame implements ActionListener {

    private static final int COMPRIMENTO = 12;
    private static final int LARGURA = 6;
    private static final int BOTAO_TAMANHO = 80;
    private static int NUM_DICAS = 0;
    
    private boolean[][] armadilhaImagem, monstrinhosImagem;
    private Random gerador = new Random();
    private int[] posiArmadilhaX, posiMonstrinhosX;
    private int posiHeroix, posiHeroiy, posiMonstrox, posiMonstroy;
    private Personagem personagem, monstro;
    private Container tela = getContentPane();
    private JPanel painel;
    private JButton[][] botoes;
    private JButton botaoDica;
    private ImageIcon imageHeroi, imageMonstro, imageArmadilha, imageMonstrinhos;
    private JLabel textoInfo;
    

    public Jogo(Personagem personagem) {
        super("Dungeon Fighter");
        this.personagem = personagem;
        monstro=new Monstro(10, 6, 15, "Monstro");
        personagem.setHab();
        inicializaInfos();
        inicializaJogo();
        setPosicoes();
        dicas();

        tela.add(botaoDica);
        tela.add(textoInfo);
        tela.add(painel);
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void inicializaInfos(){
        textoInfo = new JLabel("<html>Ataque: " + personagem.getAtaque() + "<br>Saúde: " + personagem.getSaude() + "<br>Defesa: " + personagem.getDefesa() + "</html>");
        textoInfo.setBounds(50, 500, 500, 100);
        textoInfo.setFont(new Font("Serif", Font.TYPE1_FONT, 25 ));
        textoInfo.setForeground(Color.white);
    }

    private void dicas(){
        botaoDica=new JButton("Dica ");
        botaoDica.setBounds(200, 500, 200, 100);
        botaoDica.setFont(new Font("Serif", Font.TYPE1_FONT, 25 ));
        botaoDica.setForeground(Color.black);
        botaoDica.addActionListener(this);

    }

    private void AtualizaInfos(){
        textoInfo.setText(("<html>Ataque: " + personagem.getAtaque() + "<br>Saúde: " + personagem.getSaude() + "<br>Defesa: " + personagem.getDefesa() + "</html>"));
    }
    
    private void inicializaJogo() {
        painel = new FundoPainel("lib\\brick.jpg");
        painel.setLayout(null);

        imageArmadilha = new ImageIcon("lib\\trap.png");
        imageMonstrinhos = new ImageIcon("lib\\monstrinho.png");
        
        armadilhaImagem = new boolean[COMPRIMENTO][LARGURA];
        botoes = new JButton[COMPRIMENTO][LARGURA];
        
        for (int i = 0; i < LARGURA; i++) {
            for (int j = 0; j < COMPRIMENTO; j++) {
                botoes[j][i] = new JButton();
                botoes[j][i].setContentAreaFilled(false);
                botoes[j][i].setBounds(j * BOTAO_TAMANHO, i * BOTAO_TAMANHO, BOTAO_TAMANHO, BOTAO_TAMANHO);
                botoes[j][i].addActionListener(this);
                painel.add(botoes[j][i]);
            }
        }
    }

    private void moveParaCima() {
        if (posiHeroiy > 0) {
            atualizarPosicao(posiHeroix, posiHeroiy - 1);
        }
    }

    private void moveParaBaixo() {
        if (posiHeroiy < LARGURA - 1) {
            atualizarPosicao(posiHeroix, posiHeroiy + 1);
        }
    }

    private void moveParaEsquerda() {
        if (posiHeroix > 0) {
            atualizarPosicao(posiHeroix - 1, posiHeroiy);
        }
    }

    private void moveParaDireita() {
        if (posiHeroix < COMPRIMENTO - 1) {
            atualizarPosicao(posiHeroix + 1, posiHeroiy);
        }
    }

    private void atualizarPosicao(int novoX, int novoY) {
        botoes[posiHeroix][posiHeroiy].setIcon(null);
        posiHeroix = novoX;
        posiHeroiy = novoY;
        botoes[posiHeroix][posiHeroiy].setIcon(imageHeroi);
        botoes[posiMonstrox][posiMonstroy].setIcon(imageMonstro);
        atualArmadilhas();
        verificaColisao();
    }

    private void verificaColisao() {
        if (posiHeroix == posiMonstrox && posiHeroiy == posiMonstroy) {
        
            int ataqueMonstro = monstro.getAtaque();
            int defesaPersonagem = personagem.getDefesa();
            int danoPersonagem = ataqueMonstro - defesaPersonagem;
            personagem.setDecreasevida(danoPersonagem);
    
          
            int ataquePersonagem = personagem.getAtaque();
            monstro.setDecreasevida(ataquePersonagem);
    
            if (personagem.getSaude() <= 0) {
                new TelaGameOver("Game Over ");
                dispose();
            } else if (monstro.getSaude() <= 0) {
                JOptionPane.showMessageDialog(this, "Você derrotou o monstro!", "Vitória", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                AtualizaInfos();
                botoes[posiMonstrox][posiMonstroy].setIcon(imageMonstro);
            }
        }
    
        for (int i = 0; i < COMPRIMENTO; i++) {
            if (posiHeroix == posiArmadilhaX[i] && posiHeroiy == i) {
                JOptionPane.showMessageDialog(this, "Você encontrou uma armadilha", "Colisão", JOptionPane.INFORMATION_MESSAGE);
                Personagem armadilha = new Armadilha(10, 6, 6, "Armadilha");
                int ataque = armadilha.getAtaque();
                ataque = ataque - personagem.getDefesa();
                personagem.setDecreasevida(ataque);
                AtualizaInfos();
                if (personagem.getSaude() <= 0) {
                    new TelaGameOver("Game Over");
                    dispose();
                }
                armadilhaImagem[posiArmadilhaX[i]][i] = true;
                break;
            } else if (posiHeroix == posiMonstrinhosX[i] && posiHeroiy == i) {
                botoes[posiMonstrinhosX[i]][i].setIcon(imageMonstrinhos);
                JOptionPane.showMessageDialog(this, "Você encontrou um Monstro!", "Colisão", JOptionPane.INFORMATION_MESSAGE);
                int ataque = gerador.nextInt(4);
                personagem.setDecreasevida(ataque);
                AtualizaInfos();
                if (personagem.getSaude() <= 0) {
                    new TelaGameOver("Game Over");
                    dispose();
                }
                monstrinhosImagem[posiMonstrinhosX[i]][i] = false;
                botoes[posiMonstrinhosX[i]][i].setIcon(imageHeroi);
                posiMonstrinhosX[i] = 1000;
                break;
            }
        }
    }
    
    private void atualArmadilhas() {
        for (int i = 0; i < COMPRIMENTO; i++) {
            for (int j = 0; j < LARGURA; j++) {
                if (armadilhaImagem[i][j]) {
                    botoes[i][j].setIcon(imageArmadilha);
                }else if (monstrinhosImagem[i][j]) {
                    botoes[i][j].setIcon(imageMonstrinhos);
                }
            }
        }
    }

    private void setPosicoes() {
        imageHeroi = new ImageIcon(personagem.getImagem());
        imageMonstro = new ImageIcon("lib\\monster.png");

        posiHeroix = gerador.nextInt(COMPRIMENTO);
        posiHeroiy = 0;
        posiMonstrox = gerador.nextInt(COMPRIMENTO);
        posiMonstroy = LARGURA - 1;
        posiArmadilhaX = new int[COMPRIMENTO];
        posiMonstrinhosX= new int[COMPRIMENTO];

        armadilhaImagem = new boolean[COMPRIMENTO][LARGURA];
        monstrinhosImagem = new boolean[COMPRIMENTO][LARGURA];

        for (int i = 0; i < COMPRIMENTO; i++) {
            int posiArma;
            int posiMonstrinho;
            do {
                posiArma = gerador.nextInt(COMPRIMENTO);
                posiMonstrinho = gerador.nextInt(COMPRIMENTO);
            } while (posiArma == posiMonstrinho || 
                     (posiArma == posiMonstrox && i == posiMonstroy) || 
                     (posiMonstrinho == posiMonstrox && i == posiMonstroy));
            posiArmadilhaX[i] = posiArma;
            posiMonstrinhosX[i] = posiMonstrinho;
        }

        for (int i = 0; i < COMPRIMENTO; i++) {
            for (int j = 0; j < LARGURA; j++) {
                armadilhaImagem[i][j] = false;
                monstrinhosImagem[i][j] = false;
            }
        }

        botoes[posiHeroix][posiHeroiy].setIcon(imageHeroi);
        botoes[posiMonstrox][posiMonstroy].setIcon(imageMonstro);
    }

    private void darDica() {
        if(NUM_DICAS<3){
        for (int j = 0; j < LARGURA; j++) {
            if (posiArmadilhaX[j] == posiHeroix) {
                botoes[posiHeroix][j].setIcon(imageArmadilha);
            } 
        }
    }NUM_DICAS++;
}
    
    public void actionPerformed(ActionEvent evento) {
        JButton botaoclickado = (JButton) evento.getSource();
        if (evento.getSource() == botaoDica){
            darDica();
        }else{

        for (int i = 0; i < COMPRIMENTO; i++) {
            for (int j = 0; j < LARGURA; j++) {
                if (botaoclickado == botoes[i][j]) {
                    if (i == posiHeroix + 1 && j == posiHeroiy) {
                        moveParaDireita();
                    } else if (i == posiHeroix - 1 && j == posiHeroiy) {
                        moveParaEsquerda();
                    } else if (i == posiHeroix && j == posiHeroiy - 1) {
                        moveParaCima();
                    } else if (i == posiHeroix && j == posiHeroiy + 1) {
                        moveParaBaixo();
                    }
                    return;
                }
            }
        }
    }
    }
}