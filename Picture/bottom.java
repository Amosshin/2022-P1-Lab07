package Picture;
import java.applet.Applet;
import java.awt.*;

public class bottom{
    public static void drawTire(Graphics g){
        g.setColor(Color.black);
        g.fillOval(670,500,80,80);
        g.fillOval(850,500,80,80);


    }
    public static void drawWheel(Graphics g){
        g.setColor(new Color(197, 197, 197, 178));
        g.fillOval(685,515,50,50);
        g.fillOval(865,515,50,50);



    }
public static void drawBumper(Graphics g){
    g.setColor(new Color(31, 29, 11));
    g.fillRect(960,520,50,30);
    g.fillRect(590,520,50,30);



}


    }



