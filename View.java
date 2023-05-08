import java.awt.Dimension;

import javax.swing.JFrame;

public class View extends JFrame{
    
    private static int height = 800;
    private static int width = 600;

    public View(){
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(height, width));
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
