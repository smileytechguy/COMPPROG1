
/**
 * @author Noah Overcash -- smileytechguy
 * @version 2.0.1.2.43.3.2.3
 * explainations of code: https://goo.gl/RyIzwb
 */

import objectdraw.*;
import java.awt.*;

public class A3_009_RisingSunPlusPlus_Overcash extends WindowController {
    public static void main(String[ ]args) {
        new A3_009_RisingSunPlusPlus_Overcash().startController(400, 400);
    }
    FilledOval cloud1;
    FilledOval sun;
    int cVal;
    int sunx=175;
    int suny=340;
    FilledOval cloud2;
    Text thisIsATextObject2;
    Text thisIsATextObject = new Text("Drag the mouse up and down", 20, 20, canvas);
    public void begin() {
        cloud1 = new FilledOval(20, 130, 50, 15, canvas);
        cloud1.setColor(new Color(25, 19, 19));
        sun = new FilledOval(175, 340, 50, 50, canvas);
        sun.setColor(new Color(234, 134, 38));
        cloud2 = new FilledOval(340, 180, 40, 20, canvas);
        cloud2.setColor(new Color(234, 234, 234));
        sunx=175;
        suny=340;
        thisIsATextObject2 = new Text("", 20, 40, canvas);
        thisIsATextObject2.setText("I'm at "+sunx+", "+suny);
    }
    public void onMouseDrag(Location Point) {
        sun.setColor(new Color(cVal, cVal, 0));
        cVal += 2;
        suny -= 3;
        thisIsATextObject2.setText("I'm at "+sunx+", "+suny);
        cloud1.move(2, 0);
        sun.move(0, -3);
        cloud2.move(-3, 0);
        thisIsATextObject.hide();
    }
    public void onMouseExit(Location Point) {
        cloud1.moveTo(20, 130);
        sun.moveTo(175, 340);
        cloud2.moveTo(340, 180);
        sunx=175;
        suny=340;
        thisIsATextObject2.setText("I'm at "+sunx+", "+suny);
        thisIsATextObject.show();
    }
}