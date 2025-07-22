import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.GridLayout;

public class aGridLayout {
    public static void main(String[] args) {
        //grid layout = places components in a grid of cells.
        //each component takes all the available space within its cell,
        //and each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 3, 2, 2)); //rows, cols, hgap, vgap

        //buttons
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        
        frame.setVisible(true);
        
    }
}
