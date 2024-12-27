import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame=new JFrame("grid layout example");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(3,2));   //rows, cols

        frame.add(new JButton("button 1"));
        frame.add(new JButton("button 2"));
        frame.add(new JButton("button 3"));
        frame.add(new JButton("button 4"));
        frame.add(new JButton("button 5"));
        frame.add(new JButton("button 6"));
        
        frame.setVisible(true);

    }
}
