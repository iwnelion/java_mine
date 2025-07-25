import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxGUI extends JFrame implements ActionListener{
    JComboBox comboBox;
    
    ComboBoxGUI(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] foods = {"souvlaki","pizza","burger"};
        
        comboBox = new JComboBox(foods);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("hotdog");
        //comboBox.insertItemAt("hotdog", 0);
        //comboBox.setSelectedIndex(1);
        //comboBox.removeItem("pizza");
        //comboBox.removeItemAt(1);
        //comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
            //System.out.println(comboBox.getSelectedIndex());
        }
    }
}
