 

import objectdraw.*;
import java.awt.*;
import java.util.*;
public class A3_015_ButtonCount_Overcash extends WindowController {
    RandomIntGenerator rGen = new RandomIntGenerator(0, 255);
    int buttonX;
    int textX;
    int xOffset;
    int boxWidth;
    int yOffset;
    int boxHeight;
    int box1Count;
    int box2Count;
    int box3Count;
    int totalCount;
    int topWithPadding;
    int fontSize;
    FilledRect box1;
    FilledRect box2;
    FilledRect box3;
    Text b1Text;
    Text b2Text;
    Text b3Text;
    Text allClicksText;
    Text missedClickText;
    public static void main(String[] args) {
        A3_015_ButtonCount_Overcash pineapple = new A3_015_ButtonCount_Overcash(); // pineapple is the var the class is in
        pineapple.startController(600, 600);
        pineapple.fontSize = pineapple.canvas.getWidth()/18;
        pineapple.xOffset = pineapple.canvas.getWidth()/6;
        pineapple.boxWidth = pineapple.canvas.getWidth()/6 - 20;
        pineapple.buttonX = pineapple.canvas.getWidth()/6;
        pineapple.yOffset = pineapple.canvas.getHeight()/6;
        pineapple.boxHeight = pineapple.canvas.getHeight()/6 - 20;
        pineapple.topWithPadding = pineapple.canvas.getHeight()/6;
        pineapple.textX = (pineapple.xOffset)*(5/2);
        pineapple.box1 = new FilledRect(pineapple.buttonX, pineapple.topWithPadding, pineapple.boxHeight, pineapple.boxHeight, pineapple.canvas);
        pineapple.box1.setColor(Color.RED);
        pineapple.b1Text = new Text("Red clicks: 0", pineapple.textX, pineapple.topWithPadding, pineapple.canvas);
        pineapple.b1Text.setColor(Color.RED);
        pineapple.b1Text.setFontSize(pineapple.fontSize);
        pineapple.box2 = new FilledRect(pineapple.buttonX, pineapple.topWithPadding+pineapple.yOffset, pineapple.boxHeight, pineapple.boxHeight, pineapple.canvas);
        pineapple.box2.setColor(Color.GREEN);
        pineapple.b2Text = new Text("Green clicks: 0", pineapple.textX, pineapple.topWithPadding*2, pineapple.canvas);
        pineapple.b2Text.setColor(Color.GREEN);
        pineapple.b2Text.setFontSize(pineapple.fontSize);
        pineapple.box3 = new FilledRect(pineapple.buttonX, pineapple.topWithPadding+(2*pineapple.yOffset), pineapple.boxHeight, pineapple.boxHeight, pineapple.canvas);
        pineapple.box3.setColor(Color.BLUE);
        pineapple.b3Text = new Text("Blue clicks: 0", pineapple.textX, pineapple.topWithPadding*3, pineapple.canvas);
        pineapple.b3Text.setColor(Color.BLUE);
        pineapple.b3Text.setFontSize(pineapple.fontSize);
        pineapple.allClicksText = new Text("Total clicks: 0", pineapple.buttonX, (4*pineapple.yOffset)+pineapple.fontSize, pineapple.canvas);
        pineapple.allClicksText.setFontSize(pineapple.fontSize);
        pineapple.missedClickText = new Text("Missed clicks: 0", pineapple.buttonX, 5*pineapple.yOffset, pineapple.canvas);
        pineapple.missedClickText.setFontSize(pineapple.fontSize);
    }
    public void onMouseClick(Location p) {
        totalCount++;
        allClicksText.setText("Total clicks: "+totalCount);
        missedClickText.setColor(new Color(rGen.nextValue(), rGen.nextValue(), rGen.nextValue()));
        if (box1.contains(p)) {
            box1Count++;
            b1Text.setText("Red clicks: "+box1Count);
        } else if (box2.contains(p)) {
            box2Count++;
            b2Text.setText("Green clicks: "+box2Count);
        } else if (box3.contains(p)) {
            box3Count++;
            b3Text.setText("Blue clicks: "+box3Count);
        } else {
            missedClickText.setText("Missed clicks: "+(totalCount-(box1Count+box2Count+box3Count)));
        }
    }
}