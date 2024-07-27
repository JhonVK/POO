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
        botao2 = new JButton(icone2);

        botao1.setBounds(0, 100, 300, 300);
        botao2.setBounds(400, 100, 300, 300);

        JLabel label = new JLabel("Escolha o veiculo: ");
        label.setBounds(50, 0, 200, 20);

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
                Caminhao caminhao = new Cegonha("Cegonha Modelo 1", 2024, 100000, 5,0);
                Patio.comprarCaminhao(caminhao);
                JOptionPane.showMessageDialog(this, "Caminhão adicionado: " + caminhao.getModelo());
            } else if (evento.getSource() == botao2) {
                Caminhao caminhao = new Plataforma("Plataforma Modelo 2", 2024, 120000, 10.5,0);
                Patio.comprarCaminhao(caminhao);
                JOptionPane.showMessageDialog(this, "Caminhão adicionado: " + caminhao.getModelo());
            }
        } catch (PatioCheioException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
