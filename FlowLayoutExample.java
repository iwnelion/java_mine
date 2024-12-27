import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame=new JFrame("flowlayout example");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        frame.add(new JButton("button 1"));
        frame.add(new JButton("button 2"));
        frame.add(new JButton("button 3"));

        frame.setVisible(true);
    }
}
