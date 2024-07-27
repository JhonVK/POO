package classes;

import javax.swing.*;
import java.awt.*;

public class MainFrameApp extends JFrame{
public MainFrameApp(){
    super("Exemplo com JButton");
    JButton botao;
     Container tela = getContentPane();
    setLayout(null);
    botao = new JButton ("Procurar");
    botao.setBounds(50,50,100,30);
    tela.add(botao);
    setSize(400, 250);
    setVisible(true);
    setLocationRelativeTo(null);
}

}