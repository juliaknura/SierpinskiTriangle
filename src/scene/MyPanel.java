package scene;

import java.awt.*;
import triangle.*;
import javax.swing.*;

public class MyPanel extends JPanel {

    private final int SIZE;
    private final int RESOLUTION;

    public MyPanel(int size,int resolution)
    {
        SIZE=size;
        RESOLUTION=resolution;
        this.setPreferredSize(new Dimension(SIZE,SIZE));
        this.setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        SierpinskiTriangle.draw(g2d,SIZE,RESOLUTION);
    }
}
