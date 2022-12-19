import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CriaDialogo
{
 // private static final int 0 = 0;

public static void main(String[] args)
  {
    
    
    Object[] options = { "Sim", "Não" };
    int n = JOptionPane.showOptionDialog(null,
    				"Usar poção de cura?",
    				"Você ganhou uma poção de cura", JOptionPane.YES_NO_OPTION,
    				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    System.out.println(n);
    
    JOptionPane.showMessageDialog(null, "Efeito passivo: Sangramento: O inimigo perdeu 5 de vida", null,
            1);
    
    JOptionPane.showMessageDialog(null, "Mensagem", UIManager.getString(
            "OptionPane.messageDialogTitle", null),
            0);
    
   }
}

