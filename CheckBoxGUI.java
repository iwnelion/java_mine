import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxGUI extends JFrame implements ActionListener{
    JButton button;
    JCheckBox checkbox;

    CheckBoxGUI(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton();
        button.setText("submit");
        button.setFocusable(false);
        button.addActionListener(this);

        checkbox = new JCheckBox();
        checkbox.setText("i am a checkbox");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Consolas", Font.PLAIN, 35));

        this.add(button);
        this.add(checkbox);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println(checkbox.isSelected());
        }
    }
}
