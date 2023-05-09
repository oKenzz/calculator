import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame{
    
    private static int height = 800;
    private static int width = 600;

    public JPanel panel = new JPanel();

    public View(){
        setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(5,3));
        panel.setPreferredSize(new Dimension(400, 400));
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(height, width));
        setLocationRelativeTo(null);
        add(panel, BorderLayout.SOUTH);
        setVisible(true);
    }

}
