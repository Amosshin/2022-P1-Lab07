package Picture;

import java.applet.Applet;
import java.awt.*;

public class middle {
    public static  void drawShape(Graphics g){
        g.setColor(new Color(255,228,225));
        g.fillRect(600,450,400,100);
        g.fillRect(650,350,280,100);


    }
    public static void drawWindow(Graphics g){
        g.setColor(new Color(179, 220, 225));
        g.fillRect(830,375,80,70);
        g.fillRect(700,375,80,70);


    }
    public static void drawLight(Graphics g){
        g.setColor(new Color(255, 242, 159));
        g.fillRect(970,450,30,30);
        g.setColor(Color.red);
        g.fillRect(600,450,30,30);




    }



}
