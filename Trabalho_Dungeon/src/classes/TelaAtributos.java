package classes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

//JLabel: Exibe texto/imagens.
//JPanel: Organiza e agrupa componentes.
//JFrame: Janela principal da aplicação.


public class TelaAtributos extends JFrame implements ChangeListener {
    private Container tela= getContentPane();
    private JPanel panel= new JPanel();
    private int pontosExtras=7;

    JLabel textoPontos, ataqueTexto, defesaTexto, saudeTexto, inicioTexto;

    JSlider sliderAtaque, sliderDefesa, sliderSaude;
    private int ataqueInicial, saudeInicial, defesaInicial;
    public TelaAtributos(Personagem x){
        super("Dungeon Fighter");
        panel.setLayout(null);
        ataqueInicial=x.getAtaque();
        defesaInicial=x.getDefesa();
        saudeInicial=x.getSaude();
        inicioTexto= new JLabel("Destribua os pontos do "+x.getNomeclass()+":");
        inicioTexto.setBounds(50, 25, 400, 50);
        inicioTexto.setFont(new Font("Serif", Font.TYPE1_FONT, 20 ));
        tela.add(inicioTexto);

        ataqueTexto = new JLabel("Ataque: ");
        sliderAtaque = new JSlider(0, x.getAtaque(),  x.getAtaque()+pontosExtras, x.getAtaque());
        sliderAtaque.setMajorTickSpacing(1);
        sliderAtaque.setPaintTicks(true);
        sliderAtaque.setPaintLabels(true);
        sliderAtaque.setSnapToTicks(true);
        sliderAtaque.setBounds(130, 100, 150, 50);
        ataqueTexto.setBounds(80, 100, 50, 50);
        sliderAtaque.addChangeListener(this);
        panel.add(ataqueTexto);
        panel.add(sliderAtaque);

        defesaTexto = new JLabel("Defesa: ");
        sliderDefesa = new JSlider(0, x.getDefesa(),  x.getDefesa()+pontosExtras, x.getDefesa());
        sliderDefesa.setMajorTickSpacing(1);
        sliderDefesa.setPaintTicks(true);
        sliderDefesa.setPaintLabels(true);
        sliderDefesa.setSnapToTicks(true);
        sliderDefesa.setBounds(130, 150, 150, 50);
        defesaTexto.setBounds(80, 150, 50, 50);
        sliderDefesa.addChangeListener(this);
        panel.add(defesaTexto);
        panel.add(sliderDefesa);
        
        saudeTexto = new JLabel("Saúde: ");
        sliderSaude = new JSlider(0, x.getSaude(),  x.getSaude()+pontosExtras, x.getSaude()); 
        sliderSaude.setMajorTickSpacing(1);
        sliderSaude.setPaintTicks(true);
        sliderSaude.setPaintLabels(true);
        sliderSaude.setSnapToTicks(true);
        sliderSaude.setBounds(130, 200, 150, 50);
        saudeTexto.setBounds(80, 200, 50, 50);
        sliderSaude.addChangeListener(this);
        panel.add(saudeTexto);
        panel.add(sliderSaude);
        
        textoPontos= new JLabel("Pontos sobrando: "+ pontosExtras);
        textoPontos.setBounds(80, 250, 200, 100);
        panel.add(textoPontos);

      
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
}
