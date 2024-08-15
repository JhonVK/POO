package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComprarCaminhao extends JFrame implements ActionListener {
    JButton botao1, botao2;

    public ComprarCaminhao() {
        super("Compra");

        ImageIcon icone1, icone2;
        Container tela = getContentPane();

        setLayout(null);

        icone1 = new ImageIcon("lib\\4047295_eighteen_semi_transportation_truck_wheeler_icon.png");
        icone2 = new ImageIcon("lib\\4047352_flatbed_flatbedlorry_isometric_lorry_truck_icon.png");

        botao1 = new JButton(icone1);
        botao1.setContentAreaFilled(false);
        botao2 = new JButton(icone2);
        botao2.setContentAreaFilled(false);

        botao1.setBorderPainted(false);
        botao1.setOpaque(false);
        botao2.setBorderPainted(false);
        botao2.setOpaque(false);
        
        botao1.setBounds(0, 100, 300, 300);
        botao2.setBounds(400, 100, 300, 300);

        JLabel label = new JLabel("Escolha o veiculo: ");
        label.setFont(new Font("Serif", Font.TYPE1_FONT, 25 ));
        label.setBounds(50, 50, 200, 20);

        botao1.addActionListener(this);
        botao2.addActionListener(this);

        tela.add(botao1);
        tela.add(botao2);
        tela.add(label);

        setSize(700, 400);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent evento) {
        try {
            if (evento.getSource() == botao1) {
                Caminhao caminhao = new Cegonha("Cegonha", 2024, 0, 500000,1000);
                Patio.comprarCaminhao(caminhao);
                JOptionPane.showMessageDialog(this, "Caminhão adicionado: " + caminhao.getModelo()+ ", ID do caminhao: "+ caminhao.getId());
            } else if (evento.getSource() == botao2) {
                Caminhao caminhao = new Plataforma("Plataforma", 2024, 0, 1000000,60);
                Patio.comprarCaminhao(caminhao);
                JOptionPane.showMessageDialog(this, "Caminhão adicionado: " + caminhao.getModelo()+", ID do caminhao: "+ caminhao.getId());
            }
        } catch (PatioCheioException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
