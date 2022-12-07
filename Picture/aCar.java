package Picture;

import java.applet.Applet;
import java.awt.*;

public class aCar extends Applet{
    public void paint(Graphics g){
        Outside.drawBackground(g);
        Outside.drawShape(g);
        bottom.drawTire(g);
        bottom.drawWheel(g);

        middle.drawDoor(g);
        middle.drawWindow(g);
        middle.drawS(g);


        Outside.drawTree(g);










    }
}