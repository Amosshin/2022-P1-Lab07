package Picture;

import java.applet.Applet;
import java.awt.*;

public class Outside {
    public static  void drawShape(Graphics g){
g.setColor(new Color(255,228,225));
g.fillRect(600,450,400,100);
g.fillRect(650,350,280,100);


    }
    public static void drawTree(Graphics g){
        g.setColor(new Color(66, 34, 14));
        g.fillRect(200,250,100,250);
        g.setColor(new Color(10, 80, 17));
        g.fillOval(120,100,250,250);



    }
    public static void drawBackground(Graphics g){
        g.drawLine(0,500,1200,500);
        g.setColor(new Color(135,135,135));
        g.fillRect(0,500,1200,400);
        g.setColor(new Color(135, 206, 235));
        g.fillRect(0,0,1200,500);
g.setColor(new Color(239, 187, 4));
       g.fillRect(50,700,90,40);
        g.fillRect(190,700,90,40);
        g.fillRect(330,700,90,40);
        g.fillRect(470,700,90,40);
        g.fillRect(610,700,90,40);
        g.fillRect(750,700,90,40);
        g.fillRect(890,700,90,40);
        g.fillRect(1030,700,90,40);
        g.fillRect(1170,700,90,40);



    }



    }

