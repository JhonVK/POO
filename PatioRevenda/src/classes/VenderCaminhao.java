package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VenderCaminhao extends JFrame implements ActionListener {
    JButton venderBotao;
    JTextField idCampo;

    public VenderCaminhao() {
        super("Vender Caminhão");

        Container tela = getContentPane();
        setLayout(null);

        JLabel idLabel = new JLabel("ID do Caminhão:");
        idLabel.setBounds(50, 50, 200, 20);

        idCampo = new JTextField();
        idCampo.setBounds(160, 50, 200, 20);

        venderBotao = new JButton("VENDER");
        venderBotao.setBounds(50, 100, 100, 20);

        venderBotao.addActionListener(this);

        tela.add(idLabel);
        tela.add(idCampo);
        tela.add(venderBotao);

        setSize(400, 200);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == venderBotao) {
            try {
                int id = Integer.parseInt(idCampo.getText());
                Patio patio = new Patio();
                patio.venderCaminhao(id);
                JOptionPane.showMessageDialog(this, "Caminhão vendido com sucesso.");
            }  catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um ID válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                
            }catch (IdException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } 
        }
    }

    public static void main(String[] args) {
        new VenderCaminhao();
    }
}
