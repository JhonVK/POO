package classes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//JLabel: Exibe texto/imagens.
//JPanel: Organiza e agrupa componentes.
//JFrame: Janela principal da aplicação.


public class TelaAtributos extends JFrame implements ChangeListener, ActionListener {
    private Container tela= getContentPane();
    private JPanel panel;
    private int pontosExtras=7;
    private Personagem personagem;
    private JButton botaoContinuar;
    private JLabel textoPontos, ataqueTexto, defesaTexto, saudeTexto, inicioTexto;
    private JSlider sliderAtaque, sliderDefesa, sliderSaude;
    private int ataqueInicial, saudeInicial, defesaInicial;

    public TelaAtributos(Personagem x){
        super("Dungeon Fighter");
        this.personagem=x;
        panel=new FundoPainel("lib\\fundo2.jpg");
        panel.setLayout(null);
        ataqueInicial=x.getAtaque();
        defesaInicial=x.getDefesa();
        saudeInicial=x.getSaude();
        inicioTexto= new JLabel("Destribua os pontos do "+x.getNomeclass()+":");
        inicioTexto.setForeground(Color.RED);
        inicioTexto.setBounds(20, 25, 400, 50);
        inicioTexto.setFont(new Font("Serif", Font.TYPE1_FONT, 25 ));
        tela.add(inicioTexto);

        ataqueTexto = new JLabel("Ataque: ");
        ataqueTexto.setForeground(Color.RED);
        sliderAtaque = new JSlider(0, x.getAtaque(),  x.getAtaque()+pontosExtras, x.getAtaque());
        sliderAtaque.setMajorTickSpacing(1);
        sliderAtaque.setPaintTicks(true);
        sliderAtaque.setForeground(Color.red);
        sliderAtaque.setPaintLabels(true);
        sliderAtaque.setSnapToTicks(true);
        sliderAtaque.setOpaque(false);
        sliderAtaque.setBounds(130, 100, 150, 50);
        ataqueTexto.setBounds(80, 100, 50, 50);
        sliderAtaque.addChangeListener(this);
        panel.add(ataqueTexto);
        panel.add(sliderAtaque);

        defesaTexto = new JLabel("Defesa: ");
        defesaTexto.setForeground(Color.RED);
        sliderDefesa = new JSlider(0, x.getDefesa(),  x.getDefesa()+pontosExtras, x.getDefesa());
        sliderDefesa.setMajorTickSpacing(1);
        sliderDefesa.setPaintTicks(true);
        sliderDefesa.setForeground(Color.red);
        sliderDefesa.setPaintLabels(true);
        sliderDefesa.setSnapToTicks(true);
        sliderDefesa.setOpaque(false);
        sliderDefesa.setBounds(130, 150, 150, 50);
        defesaTexto.setBounds(80, 150, 50, 50);
        sliderDefesa.addChangeListener(this);
        panel.add(defesaTexto);
        panel.add(sliderDefesa);
        
        saudeTexto = new JLabel("Saúde: ");
        saudeTexto.setForeground(Color.RED);
        sliderSaude = new JSlider(0, x.getSaude(),  x.getSaude()+pontosExtras, x.getSaude()); 
        sliderSaude.setMajorTickSpacing(1);
        sliderSaude.setPaintTicks(true);
        sliderSaude.setForeground(Color.red);
        sliderSaude.setPaintLabels(true);
        sliderSaude.setSnapToTicks(true);
        sliderSaude.setOpaque(false);
        sliderSaude.setBounds(130, 200, 150, 50);
        saudeTexto.setBounds(80, 200, 50, 50);
        sliderSaude.addChangeListener(this);
        panel.add(saudeTexto);
        panel.add(sliderSaude);
        
        textoPontos= new JLabel("Pontos sobrando: "+ pontosExtras);
        textoPontos.setForeground(Color.RED);
        textoPontos.setBounds(75, 250, 400, 100);
        textoPontos.setFont(new Font("zzz", Font.TYPE1_FONT, 25 ));
        panel.add(textoPontos);

        botaoContinuar= new JButton("Confirmar");
        botaoContinuar.setBounds(90, 320, 200, 50);
        botaoContinuar.setFont(new Font("zzz", Font.TYPE1_FONT, 25 ));
        botaoContinuar.setForeground(Color.RED);
        botaoContinuar.setBorderPainted(false);
        botaoContinuar.setOpaque(false);
        botaoContinuar.setContentAreaFilled(false); 
        botaoContinuar.setFocusPainted(false); 
        botaoContinuar.addActionListener(this);
        
        panel.add(botaoContinuar);

        tela.add(panel);
        setSize(400, 400);
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setVisible(true);

    }
    public void stateChanged(ChangeEvent e) {
        int totalAtaque= sliderAtaque.getValue()-ataqueInicial;
        int totalSaude= sliderSaude.getValue()-saudeInicial;
        int totalDefesa= sliderDefesa.getValue()-defesaInicial;
        int pontosTotais=totalAtaque+totalDefesa+totalSaude;

        if (pontosTotais > pontosExtras) {
            JSlider fonte = (JSlider) e.getSource();
            int excesso = pontosTotais - pontosExtras;

            fonte.setValue(fonte.getValue() - excesso);
            pontosTotais -= excesso;
        }
        textoPontos.setText("Pontos sobrando: "+ (pontosExtras-pontosTotais));
       
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoContinuar) {
            System.out.println("Botão Confirmar clicado");
            personagem.setAtaque(sliderAtaque.getValue());
            personagem.setDefesa(sliderDefesa.getValue());
            personagem.setSaude(sliderSaude.getValue());
            System.out.println("Instanciando Jogo"); 
            new Jogo(personagem); 
            dispose(); 
        }
    }
}
