package Picture;
import javafx.scene.layout.Background;

import java.applet.Applet;
import java.awt.*;

public class Car extends Applet{
    public void paint(Graphics g){
        bottom.drawWheel(g);
        bottom.drawTire(g);


        middle.drawDoor(g);
        middle.drawWindow(g);
        middle.drawS(g);
        Outside.drawBackground(g);
        Outside.drawShape(g);
        Outside.drawLight(g);










    }
}