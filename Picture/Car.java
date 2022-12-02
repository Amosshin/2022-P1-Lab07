package Picture;
import java.applet.Applet;
import java.awt.*;

public class Car extends Applet{
    public void paint(Graphics g){
        bottom.drawWheel(g);
        bottom.drawTire(g);


        middle.drawdoor(g);
        middle.drawWindow(g);
        middle.drawS(g);

        Outside.drawShape(g);
        Outside.drawLight(g);
        Outside.drawSidemirror(g);









    }
}