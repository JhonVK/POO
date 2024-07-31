package classes;

import javax.swing.*;
import java.awt.*;

public class FundoPainel extends JPanel {
    private Image imagemFundo;

    public FundoPainel(String caminhoImagem) {
        imagemFundo = new ImageIcon(caminhoImagem).getImage();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagemFundo != null) {
            g.drawImage(imagemFundo, 0, 0, getWidth(), getHeight(), this);
        }
    }
}