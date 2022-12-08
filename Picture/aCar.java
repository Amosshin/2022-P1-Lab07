package Picture;

import java.applet.Applet;
import java.awt.*;

public class aCar extends Applet{
    public void paint(Graphics g){
        Outside.drawRoad(g);
        Outside.drawCloud(g);
        middle.drawShape(g);
        bottom.drawTire(g);
        bottom.drawWheel(g);
        bottom.drawBumper(g);
        middle.drawWindow(g);
        middle.drawLight(g);
        Outside.drawTree(g);










    }
}