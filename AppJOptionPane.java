import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AppJOptionPane {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "this is a message dialog", "dialog title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "here is some info", "title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "really???", "title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "your pc has a virus mehehehe", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "IT'S BROKEN", "title", JOptionPane.ERROR_MESSAGE);

        //int option = JOptionPane.showConfirmDialog(null, "do you code?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
        // String name = JOptionPane.showInputDialog("what's your name?");
        // System.out.println(name);

        ImageIcon icon = new ImageIcon("thanasis.jpeg");
        String[] respones={"yes!!", "no :(", "thanasuiiiii"};
        JOptionPane.showOptionDialog(null, "do you like coding?", "title", JOptionPane.DEFAULT_OPTION, 0, icon, respones, respones[0]);
    }
}
