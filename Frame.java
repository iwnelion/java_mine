import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame {
    Frame(){
        this.setTitle("my gui"); //set the title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set the default close operation
        this.setSize(400,400); //set the size of the frame
        this.setResizable(true); //set the frame to be resizable by the user
        this.setVisible(true);       //make it visible

        ImageIcon image = new ImageIcon("thanasis.jpeg"); //create an image icon with nanaseiro
        this.setIconImage(image.getImage());

        this.getContentPane().setBackground(new Color(0x123456)); //set the background color of the frame to dark blue
    }
}
