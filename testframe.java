import javax.swing.JFrame;

public class testframe extends JFrame{
    private int width;
    private int height;

    public testframe(int w, int h){
        width=w;
        height=h;
    }
    public void setUpGUI(){
        setSize(width, height);
        setTitle("my java app");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}