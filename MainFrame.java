package Argentum11;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
public class MainFrame extends JFrame{
    public static int width,height;
    public MainFrame(){
        this.setTitle("Cube simulator");

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        double userScreenWidth = size.getWidth();
        double userScreenHeight = size.getHeight();
        size.setSize(userScreenWidth/2, userScreenHeight/2);
        this.setSize(size);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}