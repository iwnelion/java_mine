import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLabels {
    public static void main(String[] args) {
        //Label = text, icon, both

        //label
        JLabel label = new JLabel();
        label.setText("the best kitten in the world");

        //icon
        ImageIcon icon = new ImageIcon("thanasis.jpeg");
        label.setIcon(icon);

        //label border
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        //label properties
        label.setHorizontalTextPosition(JLabel.CENTER); //set text position relative to icon
        label.setVerticalTextPosition(JLabel.TOP); //set text position relative to icon
        label.setForeground(new Color(0x00FF00)); //set text color
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); //set font
        label.setIconTextGap(-50); //set gap between icon and text
        label.setBackground(Color.BLACK); //set background color
        label.setOpaque(true); //make background visible
        label.setBorder(border); //set border

        label.setVerticalAlignment(JLabel.CENTER); //set vertical alignment
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal alignment

        //window and components
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);
    }
}