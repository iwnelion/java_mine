import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonsGUI extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton souvlakiButton;
    JRadioButton burgerButton;

    RadioButtonsGUI(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("pizza");
        souvlakiButton = new JRadioButton("souvlaki");
        burgerButton = new JRadioButton("burger");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(souvlakiButton);
        group.add(burgerButton);

        pizzaButton.addActionListener(this);
        souvlakiButton.addActionListener(this);
        burgerButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(souvlakiButton);
        this.add(burgerButton);

        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==pizzaButton){
            System.out.println("you ordered pizza");
        }else if(e.getSource()==souvlakiButton){
            System.out.println("you ordered souvlaki");
        }else if(e.getSource()==burgerButton){
            System.out.println("you ordered burger");
        }
    }
}
