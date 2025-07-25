import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Slider implements ChangeListener{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    
    Slider(){
        frame = new JFrame("slider program");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(400, 200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));

        //make the slider vertical
        slider.setOrientation(SwingConstants.VERTICAL);
        
        label.setText("°C = "+slider.getValue());

        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
    }

    //to update the label every time there is a change in the slider
    @Override
    public void stateChanged(ChangeEvent e){
        label.setText("°C = "+slider.getValue());
    }
}
