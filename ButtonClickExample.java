import javax.swing.*;
import java.awt.event.*;

public class ButtonClickExample {
    public static void main(String[] args) {
        JFrame frame=new JFrame("button click example");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button=new JButton("click me");

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("button clicked");
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
