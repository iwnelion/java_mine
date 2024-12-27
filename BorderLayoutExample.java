import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame=new JFrame("border layout example");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        frame.add(new JButton("north"), BorderLayout.NORTH);
        frame.add(new JButton("south"), BorderLayout.SOUTH);
        frame.add(new JButton("east"), BorderLayout.EAST);
        frame.add(new JButton("west"), BorderLayout.WEST);
        frame.add(new JButton("center"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
