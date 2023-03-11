package scene;

import javax.swing.*;
import java.awt.*;

public class Scene {

    private final int SIZE;
    private final JFrame frame;
    private final MyPanel panel;
    private final ImageIcon icon;
    private final int RESOLUTION;

    public Scene(int size, int resolution)
    {
        SIZE=size;
        RESOLUTION=resolution;
        frame = new JFrame();
        panel = new MyPanel(SIZE,RESOLUTION);
        icon = new ImageIcon("src\\sierpinskiTriangle.png");
    }

    public void draw()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setIconImage(icon.getImage());

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
