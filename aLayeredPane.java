import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class aLayeredPane {
    public static void main(String[] args) {
        //layered pane = allows components to stack/overlap.
        //gives depth (z-order) to components.

        //laybels
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150, 150, 200, 200);
        
        //layered pane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);

        //add labels to layered pane
        //                      the second parameter is the layer.
        //                      lower numbers are lower layers, higher numbers are higher layers.
        layeredPane.add(label1, Integer.valueOf(0)); // lowest layer
        layeredPane.add(label2, Integer.valueOf(1)); // middle layer
        layeredPane.add(label3, Integer.valueOf(2)); // highest layer

        JFrame frame = new JFrame();
        frame.add(layeredPane); //add the layered pane to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
