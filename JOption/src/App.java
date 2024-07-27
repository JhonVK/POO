import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args){

        int resp = JOptionPane.showConfirmDialog(null, "Prossegue com a tarefa?","Escolha uma opção", JOptionPane.OK_CANCEL_OPTION);
        
        String nome = JOptionPane.showInputDialog( null,"Qual é o seu nome?","Identifique-se",  JOptionPane.QUESTION_MESSAGE);

        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        
        int resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
        }else{
            JOptionPane.showMessageDialog(null, "Seu nome não é " + nome);
        }
    }

}
