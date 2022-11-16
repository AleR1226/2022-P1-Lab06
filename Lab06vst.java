// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;

import static java.awt.Color.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
        Random rand = new Random();
        for(int k=1; k<= 100; k++) {
            int x1 = rand.nextInt(391)+10;
            int y1 = rand.nextInt(291)+10;
            int x2 = rand.nextInt(391)+10;
            int y2 =rand.nextInt(291)+10;
            int r = rand.nextInt(256);
            int gr = rand.nextInt(256);
            int b = rand.nextInt(256);
            g.setColor(new Color(r,gr,b));
            g.drawLine(x1,y1,x2,y2);

        }



        // Draw Random Squares
        for(int k=1; k<= 100; k++) {
            int x1 = rand.nextInt(331)+400;
            int y1 = rand.nextInt(240)+10;
            int r = rand.nextInt(256);
            int gr = rand.nextInt(256);
            int b = rand.nextInt(256);
            g.setColor(new Color(r, gr, b));
            g.fillRect(x1, y1,50,50);
        }




        // Draw Random Circles
        for(int k=1; k<= 100; k++) {
            int h = rand.nextInt(200);
            int x1 = rand.nextInt(391-h)+10;
            int y1 = rand.nextInt(291-h)+300;
            int r = rand.nextInt(256);
            int gr = rand.nextInt(256);
            int b = rand.nextInt(256);
            g.setColor(new Color(r, gr, b));
            g.drawOval(x1,y1,h,h);
        }




        // Draw 3-D Box
        g.setColor(yellow);
        g.fillRect(500, 350, 100, 100);
        g.setColor(green);
        Polygon penta = new Polygon();
        penta.addPoint(500,350);
        penta.addPoint(500,450);
        penta.addPoint(550, 500);
        penta.addPoint(550, 400);
       g.fillPolygon(penta);
        g.setColor(red);
        g.fillRect(550, 400, 100, 100);
        g.setColor(blue);
        Polygon Tri = new Polygon();
        Tri.addPoint(600,350);
        Tri.addPoint(600,400);
        Tri.addPoint(650, 400);
        g.fillPolygon(Tri);



    }

}



    
 