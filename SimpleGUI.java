import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame=new JFrame("my app");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button=new JButton("click me");

        frame.add(button);

        frame.setVisible(true);
    }
}
