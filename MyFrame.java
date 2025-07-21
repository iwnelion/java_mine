import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){
        ImageIcon icon = new ImageIcon("thanasis.jpeg");

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150, 250, 150, 150); //x, y, width, height
        label.setVisible(false); //initially hidden

        button = new JButton();
        button.setBounds(100, 100, 250, 150); //x, y, width, height
        button.addActionListener(this);
        // button.setIcon(icon);
        button.setText("who's the cutest kitten in the world?");

        button.setFocusable(false); //removes the focus outline when clicked
        button.setHorizontalTextPosition(JButton.CENTER); //text position
        button.setVerticalTextPosition(JButton.BOTTOM); //text position
        button.setFont(new Font("Comic Sans", Font.BOLD, 25)); //font style and size
        button.setForeground(Color.cyan); //text color
        button.setBackground(Color.lightGray); //button background color
        button.setBorder(BorderFactory.createEtchedBorder()); //button border
        //button.setEnabled(false); //disables the button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("thanasis is the cutest kitten of them all");
            button.setEnabled(false); //disables the button after one click
            label.setVisible(true); //shows the label with the image
        }
    }
}
