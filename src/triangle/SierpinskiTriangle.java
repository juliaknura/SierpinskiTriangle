package triangle;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class SierpinskiTriangle {

    private static Random gen = new Random();
    private static final int POINT_SIZE=3;
    private static final double GAP=0.1;

    public static void draw(Graphics2D g, int size, int resolution)
    {
        //array in which we store our points
        ArrayList<Point> points = new ArrayList<Point>();

        //will be used during drawing random points from our array
        int position1, position2, x1, y1, x2, y2;

        //drawing three outlining points
        points.add(new Point(size/2,(int) (size*GAP)));
        g.fillOval(size/2, (int) (size*GAP),POINT_SIZE,POINT_SIZE);

        points.add(new Point((int) (size*GAP),(int) (size*(1-GAP))));
        g.fillOval((int) (size*GAP),(int) (size*(1-GAP)),POINT_SIZE,POINT_SIZE);

        points.add(new Point((int) (size*(1-GAP)),(int) (size*(1-GAP))));
        g.fillOval((int) (size*(1-GAP)),(int) (size*(1-GAP)),POINT_SIZE,POINT_SIZE);

        //drawing rest of the points
        for(int i=0;i<resolution;i++)
        {
            position1 = gen.nextInt(points.size());
            position2 = gen.nextInt(3);
            x1 = (int)(points.get(position1).getX());
            x2 = (int)(points.get(position2).getX());

            y1 = (int)(points.get(position1).getY());
            y2 = (int)(points.get(position2).getY());

            points.add(new Point((x1+x2)/2,(y1+y2)/2));
            g.fillOval((x1+x2)/2,(y1+y2)/2,POINT_SIZE,POINT_SIZE);
        }
    }
}
