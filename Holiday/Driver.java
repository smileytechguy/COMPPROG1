	import objectdraw.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import javax.imageio.*;
public class Driver extends WindowController {
    ActiveGift a;
    ActiveOrn o;
    ActiveSnow s;
    int t = 0;
    public static void main(String[] args) {
        Driver oc = new Driver();
        oc.startController((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()-25);
    }

    public void begin() {
        new Treé (canvas.getWidth() / 4, canvas.getHeight() / 8, canvas.getWidth() / 4, canvas.getHeight() / 3 * 2, new Color[] {
                new Color(
                    58, 
                    118, 
                    17
                ), 
                new Color(
                    58, 
                    118, 
                    18
                ), 
                new Color(
                    58, 
                    118, 
                    19
                ), 
                new Color(
                    58, 
                    118, 
                    20
                ), 
                new Color(
                    58, 
                    118, 
                    21
                ), 
                new Color(
                    58, 
                    118, 
                    22
                ), 
                new Color(
                    58, 
                    118, 
                    23
                ), 
                new Color(
                    58, 
                    119, 
                    17
                ), 
                new Color(
                    58, 
                    119, 
                    18
                ), 
                new Color(
                    58, 
                    119, 
                    19
                ), 
                new Color(
                    58, 
                    119, 
                    20
                ), 
                new Color(
                    58, 
                    119, 
                    21
                ), 
                new Color(
                    58, 
                    119, 
                    22
                ), 
                new Color(
                    58, 
                    119, 
                    23
                ), 
                new Color(
                    58, 
                    120, 
                    17
                ), 
                new Color(
                    58, 
                    120, 
                    18
                ), 
                new Color(
                    58, 
                    120, 
                    19
                ), 
                new Color(
                    58, 
                    120, 
                    20
                ), 
                new Color(
                    58, 
                    120, 
                    21
                ), 
                new Color(
                    58, 
                    120, 
                    22
                ), 
                new Color(
                    58, 
                    120, 
                    23
                ), 
                new Color(
                    58, 
                    121, 
                    17
                ), 
                new Color(
                    58, 
                    121, 
                    18
                ), 
                new Color(
                    58, 
                    121, 
                    19
                ), 
                new Color(
                    58, 
                    121, 
                    20
                ), 
                new Color(
                    58, 
                    121, 
                    21
                ), 
                new Color(
                    58, 
                    121, 
                    22
                ), 
                new Color(
                    58, 
                    121, 
                    23
                ), 
                new Color(
                    58, 
                    122, 
                    17
                ), 
                new Color(
                    58, 
                    122, 
                    18
                ), 
                new Color(
                    58, 
                    122, 
                    19
                ), 
                new Color(
                    58, 
                    122, 
                    20
                ), 
                new Color(
                    58, 
                    122, 
                    21
                ), 
                new Color(
                    58, 
                    122, 
                    22
                ), 
                new Color(
                    58, 
                    122, 
                    23
                ), 
                new Color(
                    58, 
                    123, 
                    17
                ), 
                new Color(
                    58, 
                    123, 
                    18
                ), 
                new Color(
                    58, 
                    123, 
                    19
                ), 
                new Color(
                    58, 
                    123, 
                    20
                ), 
                new Color(
                    58, 
                    123, 
                    21
                ), 
                new Color(
                    58, 
                    123, 
                    22
                ), 
                new Color(
                    58, 
                    123, 
                    23
                ), 
                new Color(
                    58, 
                    124, 
                    17
                ), 
                new Color(
                    58, 
                    124, 
                    18
                ), 
                new Color(
                    58, 
                    124, 
                    19
                ), 
                new Color(
                    58, 
                    124, 
                    20
                ), 
                new Color(
                    58, 
                    124, 
                    21
                ), 
                new Color(
                    58, 
                    124, 
                    22
                ), 
                new Color(
                    58, 
                    124, 
                    23
                ), 
                new Color(
                    58, 
                    125, 
                    17
                ), 
                new Color(
                    58, 
                    125, 
                    18
                ), 
                new Color(
                    58, 
                    125, 
                    19
                ), 
                new Color(
                    58, 
                    125, 
                    20
                ), 
                new Color(
                    58, 
                    125, 
                    21
                ), 
                new Color(
                    58, 
                    125, 
                    22
                ), 
                new Color(
                    58, 
                    125, 
                    23
                ), 
                new Color(
                    58, 
                    126, 
                    17
                ), 
                new Color(
                    58, 
                    126, 
                    18
                ), 
                new Color(
                    58, 
                    126, 
                    19
                ), 
                new Color(
                    58, 
                    126, 
                    20
                ), 
                new Color(
                    58, 
                    126, 
                    21
                ), 
                new Color(
                    58, 
                    126, 
                    22
                ), 
                new Color(
                    58, 
                    126, 
                    23
                ), 
                new Color(
                    58, 
                    127, 
                    17
                ), 
                new Color(
                    58, 
                    127, 
                    18
                ), 
                new Color(
                    58, 
                    127, 
                    19
                ), 
                new Color(
                    58, 
                    127, 
                    20
                ), 
                new Color(
                    58, 
                    127, 
                    21
                ), 
                new Color(
                    58, 
                    127, 
                    22
                ), 
                new Color(
                    58, 
                    127, 
                    23
                ), 
                new Color(
                    58, 
                    128, 
                    17
                ), 
                new Color(
                    58, 
                    128, 
                    18
                ), 
                new Color(
                    58, 
                    128, 
                    19
                ), 
                new Color(
                    58, 
                    128, 
                    20
                ), 
                new Color(
                    58, 
                    128, 
                    21
                ), 
                new Color(
                    58, 
                    128, 
                    22
                ), 
                new Color(
                    58, 
                    128, 
                    23
                ), 
                new Color(
                    58, 
                    129, 
                    17
                ), 
                new Color(
                    58, 
                    129, 
                    18
                ), 
                new Color(
                    58, 
                    129, 
                    19
                ), 
                new Color(
                    58, 
                    129, 
                    20
                ), 
                new Color(
                    58, 
                    129, 
                    21
                ), 
                new Color(
                    58, 
                    129, 
                    22
                ), 
                new Color(
                    58, 
                    129, 
                    23
                ), 
                new Color(
                    58, 
                    130, 
                    17
                ), 
                new Color(
                    58, 
                    130, 
                    18
                ), 
                new Color(
                    58, 
                    130, 
                    19
                ), 
                new Color(
                    58, 
                    130, 
                    20
                ), 
                new Color(
                    58, 
                    130, 
                    21
                ), 
                new Color(
                    58, 
                    130, 
                    22
                ), 
                new Color(
                    58, 
                    130, 
                    23
                ), 
                new Color(
                    58, 
                    131, 
                    17
                ), 
                new Color(
                    58, 
                    131, 
                    18
                ), 
                new Color(
                    58, 
                    131, 
                    19
                ), 
                new Color(
                    58, 
                    131, 
                    20
                ), 
                new Color(
                    58, 
                    131, 
                    21
                ), 
                new Color(
                    58, 
                    131, 
                    22
                ), 
                new Color(
                    58, 
                    131, 
                    23
                ), 
                new Color(
                    58, 
                    132, 
                    17
                ), 
                new Color(
                    58, 
                    132, 
                    18
                ), 
                new Color(
                    58, 
                    132, 
                    19
                ), 
                new Color(
                    58, 
                    132, 
                    20
                ), 
                new Color(
                    58, 
                    132, 
                    21
                ), 
                new Color(
                    58, 
                    132, 
                    22
                ), 
                new Color(
                    58, 
                    132, 
                    23
                ), 
                new Color(
                    58, 
                    133, 
                    17
                ), 
                new Color(
                    58, 
                    133, 
                    18
                ), 
                new Color(
                    58, 
                    133, 
                    19
                ), 
                new Color(
                    58, 
                    133, 
                    20
                ), 
                new Color(
                    58, 
                    133, 
                    21
                ), 
                new Color(
                    58, 
                    133, 
                    22
                ), 
                new Color(
                    58, 
                    133, 
                    23
                ), 
                new Color(
                    58, 
                    134, 
                    17
                ), 
                new Color(
                    58, 
                    134, 
                    18
                ), 
                new Color(
                    58, 
                    134, 
                    19
                ), 
                new Color(
                    58, 
                    134, 
                    20
                ), 
                new Color(
                    58, 
                    134, 
                    21
                ), 
                new Color(
                    58, 
                    134, 
                    22
                ), 
                new Color(
                    58, 
                    134, 
                    23
                ), 
                new Color(
                    58, 
                    135, 
                    17
                ), 
                new Color(
                    58, 
                    135, 
                    18
                ), 
                new Color(
                    58, 
                    135, 
                    19
                ), 
                new Color(
                    58, 
                    135, 
                    20
                ), 
                new Color(
                    58, 
                    135, 
                    21
                ), 
                new Color(
                    58, 
                    135, 
                    22
                ), 
                new Color(
                    58, 
                    135, 
                    23
                ), 
                new Color(
                    58, 
                    136, 
                    17
                ), 
                new Color(
                    58, 
                    136, 
                    18
                ), 
                new Color(
                    58, 
                    136, 
                    19
                ), 
                new Color(
                    58, 
                    136, 
                    20
                ), 
                new Color(
                    58, 
                    136, 
                    21
                ), 
                new Color(
                    58, 
                    136, 
                    22
                ), 
                new Color(
                    58, 
                    136, 
                    23
                ), 
                new Color(
                    58, 
                    137, 
                    17
                ), 
                new Color(
                    58, 
                    137, 
                    18
                ), 
                new Color(
                    58, 
                    137, 
                    19
                ), 
                new Color(
                    58, 
                    137, 
                    20
                ), 
                new Color(
                    58, 
                    137, 
                    21
                ), 
                new Color(
                    58, 
                    137, 
                    22
                ), 
                new Color(
                    58, 
                    137, 
                    23
                ), 
                new Color(
                    58, 
                    138, 
                    17
                ), 
                new Color(
                    58, 
                    138, 
                    18
                ), 
                new Color(
                    58, 
                    138, 
                    19
                ), 
                new Color(
                    58, 
                    138, 
                    20
                ), 
                new Color(
                    58, 
                    138, 
                    21
                ), 
                new Color(
                    58, 
                    138, 
                    22
                ), 
                new Color(
                    58, 
                    138, 
                    23
                ), 
                new Color(
                    58, 
                    139, 
                    17
                ), 
                new Color(
                    58, 
                    139, 
                    18
                ), 
                new Color(
                    58, 
                    139, 
                    19
                ), 
                new Color(
                    58, 
                    139, 
                    20
                ), 
                new Color(
                    58, 
                    139, 
                    21
                ), 
                new Color(
                    58, 
                    139, 
                    22
                ), 
                new Color(
                    58, 
                    139, 
                    23
                ), 
                new Color(
                    58, 
                    140, 
                    17
                ), 
                new Color(
                    58, 
                    140, 
                    18
                ), 
                new Color(
                    58, 
                    140, 
                    19
                ), 
                new Color(
                    58, 
                    140, 
                    20
                ), 
                new Color(
                    58, 
                    140, 
                    21
                ), 
                new Color(
                    58, 
                    140, 
                    22
                ), 
                new Color(
                    58, 
                    140, 
                    23
                ), 
                new Color(
                    58, 
                    141, 
                    17
                ), 
                new Color(
                    58, 
                    141, 
                    18
                ), 
                new Color(
                    58, 
                    141, 
                    19
                ), 
                new Color(
                    58, 
                    141, 
                    20
                ), 
                new Color(
                    58, 
                    141, 
                    21
                ), 
                new Color(
                    58, 
                    141, 
                    22
                ), 
                new Color(
                    58, 
                    141, 
                    23
                ), 
                new Color(
                    58, 
                    142, 
                    17
                ), 
                new Color(
                    58, 
                    142, 
                    18
                ), 
                new Color(
                    58, 
                    142, 
                    19
                ), 
                new Color(
                    58, 
                    142, 
                    20
                ), 
                new Color(
                    58, 
                    142, 
                    21
                ), 
                new Color(
                    58, 
                    142, 
                    22
                ), 
                new Color(
                    58, 
                    142, 
                    23
                ), 
                new Color(
                    58, 
                    143, 
                    17
                ), 
                new Color(
                    58, 
                    143, 
                    18
                ), 
                new Color(
                    58, 
                    143, 
                    19
                ), 
                new Color(
                    58, 
                    143, 
                    20
                ), 
                new Color(
                    58, 
                    143, 
                    21
                ), 
                new Color(
                    58, 
                    143, 
                    22
                ), 
                new Color(
                    58, 
                    143, 
                    23
                ), 
                new Color(
                    58, 
                    144, 
                    17
                ), 
                new Color(
                    58, 
                    144, 
                    18
                ), 
                new Color(
                    58, 
                    144, 
                    19
                ), 
                new Color(
                    58, 
                    144, 
                    20
                ), 
                new Color(
                    58, 
                    144, 
                    21
                ), 
                new Color(
                    58, 
                    144, 
                    22
                ), 
                new Color(
                    58, 
                    144, 
                    23
                ), 
                new Color(
                    58, 
                    145, 
                    17
                ), 
                new Color(
                    58, 
                    145, 
                    18
                ), 
                new Color(
                    58, 
                    145, 
                    19
                ), 
                new Color(
                    58, 
                    145, 
                    20
                ), 
                new Color(
                    58, 
                    145, 
                    21
                ), 
                new Color(
                    58, 
                    145, 
                    22
                ), 
                new Color(
                    58, 
                    145, 
                    23
                ), 
                new Color(
                    58, 
                    146, 
                    17
                ), 
                new Color(
                    58, 
                    146, 
                    18
                ), 
                new Color(
                    58, 
                    146, 
                    19
                ), 
                new Color(
                    58, 
                    146, 
                    20
                ), 
                new Color(
                    58, 
                    146, 
                    21
                ), 
                new Color(
                    58, 
                    146, 
                    22
                ), 
                new Color(
                    58, 
                    146, 
                    23
                ), 
                new Color(
                    58, 
                    147, 
                    17
                ), 
                new Color(
                    58, 
                    147, 
                    18
                ), 
                new Color(
                    58, 
                    147, 
                    19
                ), 
                new Color(
                    58, 
                    147, 
                    20
                ), 
                new Color(
                    58, 
                    147, 
                    21
                ), 
                new Color(
                    58, 
                    147, 
                    22
                ), 
                new Color(
                    58, 
                    147, 
                    23
                ), 
                new Color(
                    58, 
                    148, 
                    17
                ), 
                new Color(
                    58, 
                    148, 
                    18
                ), 
                new Color(
                    58, 
                    148, 
                    19
                ), 
                new Color(
                    58, 
                    148, 
                    20
                ), 
                new Color(
                    58, 
                    148, 
                    21
                ), 
                new Color(
                    58, 
                    148, 
                    22
                ), 
                new Color(
                    58, 
                    148, 
                    23
                ), 
                new Color(
                    58, 
                    149, 
                    17
                ), 
                new Color(
                    58, 
                    149, 
                    18
                ), 
                new Color(
                    58, 
                    149, 
                    19
                ), 
                new Color(
                    58, 
                    149, 
                    20
                ), 
                new Color(
                    58, 
                    149, 
                    21
                ), 
                new Color(
                    58, 
                    149, 
                    22
                ), 
                new Color(
                    58, 
                    149, 
                    23
                ), 
                new Color(
                    58, 
                    150, 
                    17
                ), 
                new Color(
                    58, 
                    150, 
                    18
                ), 
                new Color(
                    58, 
                    150, 
                    19
                ), 
                new Color(
                    58, 
                    150, 
                    20
                ), 
                new Color(
                    58, 
                    150, 
                    21
                ), 
                new Color(
                    58, 
                    150, 
                    22
                ), 
                new Color(
                    58, 
                    150, 
                    23
                ), 
                new Color(
                    58, 
                    151, 
                    17
                ), 
                new Color(
                    58, 
                    151, 
                    18
                ), 
                new Color(
                    58, 
                    151, 
                    19
                ), 
                new Color(
                    58, 
                    151, 
                    20
                ), 
                new Color(
                    58, 
                    151, 
                    21
                ), 
                new Color(
                    58, 
                    151, 
                    22
                ), 
                new Color(
                    58, 
                    151, 
                    23
                ), 
                new Color(
                    58, 
                    152, 
                    17
                ), 
                new Color(
                    58, 
                    152, 
                    18
                ), 
                new Color(
                    58, 
                    152, 
                    19
                ), 
                new Color(
                    58, 
                    152, 
                    20
                ), 
                new Color(
                    58, 
                    152, 
                    21
                ), 
                new Color(
                    58, 
                    152, 
                    22
                ), 
                new Color(
                    58, 
                    152, 
                    23
                ), 
                new Color(
                    58, 
                    153, 
                    17
                ), 
                new Color(
                    58, 
                    153, 
                    18
                ), 
                new Color(
                    58, 
                    153, 
                    19
                ), 
                new Color(
                    58, 
                    153, 
                    20
                ), 
                new Color(
                    58, 
                    153, 
                    21
                ), 
                new Color(
                    58, 
                    153, 
                    22
                ), 
                new Color(
                    58, 
                    153, 
                    23
                ), 
                new Color(
                    58, 
                    154, 
                    17
                ), 
                new Color(
                    58, 
                    154, 
                    18
                ), 
                new Color(
                    58, 
                    154, 
                    19
                ), 
                new Color(
                    58, 
                    154, 
                    20
                ), 
                new Color(
                    58, 
                    154, 
                    21
                ), 
                new Color(
                    58, 
                    154, 
                    22
                ), 
                new Color(
                    58, 
                    154, 
                    23
                ), 
                new Color(
                    59, 
                    118, 
                    17
                ), 
                new Color(
                    59, 
                    118, 
                    18
                ), 
                new Color(
                    59, 
                    118, 
                    19
                ), 
                new Color(
                    59, 
                    118, 
                    20
                ), 
                new Color(
                    59, 
                    118, 
                    21
                ), 
                new Color(
                    59, 
                    118, 
                    22
                ), 
                new Color(
                    59, 
                    118, 
                    23
                ), 
                new Color(
                    59, 
                    119, 
                    17
                ), 
                new Color(
                    59, 
                    119, 
                    18
                ), 
                new Color(
                    59, 
                    119, 
                    19
                ), 
                new Color(
                    59, 
                    119, 
                    20
                ), 
                new Color(
                    59, 
                    119, 
                    21
                ), 
                new Color(
                    59, 
                    119, 
                    22
                ), 
                new Color(
                    59, 
                    119, 
                    23
                ), 
                new Color(
                    59, 
                    120, 
                    17
                ), 
                new Color(
                    59, 
                    120, 
                    18
                ), 
                new Color(
                    59, 
                    120, 
                    19
                ), 
                new Color(
                    59, 
                    120, 
                    20
                ), 
                new Color(
                    59, 
                    120, 
                    21
                ), 
                new Color(
                    59, 
                    120, 
                    22
                ), 
                new Color(
                    59, 
                    120, 
                    23
                ), 
                new Color(
                    59, 
                    121, 
                    17
                ), 
                new Color(
                    59, 
                    121, 
                    18
                ), 
                new Color(
                    59, 
                    121, 
                    19
                ), 
                new Color(
                    59, 
                    121, 
                    20
                ), 
                new Color(
                    59, 
                    121, 
                    21
                ), 
                new Color(
                    59, 
                    121, 
                    22
                ), 
                new Color(
                    59, 
                    121, 
                    23
                ), 
                new Color(
                    59, 
                    122, 
                    17
                ), 
                new Color(
                    59, 
                    122, 
                    18
                ), 
                new Color(
                    59, 
                    122, 
                    19
                ), 
                new Color(
                    59, 
                    122, 
                    20
                ), 
                new Color(
                    59, 
                    122, 
                    21
                ), 
                new Color(
                    59, 
                    122, 
                    22
                ), 
                new Color(
                    59, 
                    122, 
                    23
                ), 
                new Color(
                    59, 
                    123, 
                    17
                ), 
                new Color(
                    59, 
                    123, 
                    18
                ), 
                new Color(
                    59, 
                    123, 
                    19
                ), 
                new Color(
                    59, 
                    123, 
                    20
                ), 
                new Color(
                    59, 
                    123, 
                    21
                ), 
                new Color(
                    59, 
                    123, 
                    22
                ), 
                new Color(
                    59, 
                    123, 
                    23
                ), 
                new Color(
                    59, 
                    124, 
                    17
                ), 
                new Color(
                    59, 
                    124, 
                    18
                ), 
                new Color(
                    59, 
                    124, 
                    19
                ), 
                new Color(
                    59, 
                    124, 
                    20
                ), 
                new Color(
                    59, 
                    124, 
                    21
                ), 
                new Color(
                    59, 
                    124, 
                    22
                ), 
                new Color(
                    59, 
                    124, 
                    23
                ), 
                new Color(
                    59, 
                    125, 
                    17
                ), 
                new Color(
                    59, 
                    125, 
                    18
                ), 
                new Color(
                    59, 
                    125, 
                    19
                ), 
                new Color(
                    59, 
                    125, 
                    20
                ), 
                new Color(
                    59, 
                    125, 
                    21
                ), 
                new Color(
                    59, 
                    125, 
                    22
                ), 
                new Color(
                    59, 
                    125, 
                    23
                ), 
                new Color(
                    59, 
                    126, 
                    17
                ), 
                new Color(
                    59, 
                    126, 
                    18
                ), 
                new Color(
                    59, 
                    126, 
                    19
                ), 
                new Color(
                    59, 
                    126, 
                    20
                ), 
                new Color(
                    59, 
                    126, 
                    21
                ), 
                new Color(
                    59, 
                    126, 
                    22
                ), 
                new Color(
                    59, 
                    126, 
                    23
                ), 
                new Color(
                    59, 
                    127, 
                    17
                ), 
                new Color(
                    59, 
                    127, 
                    18
                ), 
                new Color(
                    59, 
                    127, 
                    19
                ), 
                new Color(
                    59, 
                    127, 
                    20
                ), 
                new Color(
                    59, 
                    127, 
                    21
                ), 
                new Color(
                    59, 
                    127, 
                    22
                ), 
                new Color(
                    59, 
                    127, 
                    23
                ), 
                new Color(
                    59, 
                    128, 
                    17
                ), 
                new Color(
                    59, 
                    128, 
                    18
                ), 
                new Color(
                    59, 
                    128, 
                    19
                ), 
                new Color(
                    59, 
                    128, 
                    20
                ), 
                new Color(
                    59, 
                    128, 
                    21
                ), 
                new Color(
                    59, 
                    128, 
                    22
                ), 
                new Color(
                    59, 
                    128, 
                    23
                ), 
                new Color(
                    59, 
                    129, 
                    17
                ), 
                new Color(
                    59, 
                    129, 
                    18
                ), 
                new Color(
                    59, 
                    129, 
                    19
                ), 
                new Color(
                    59, 
                    129, 
                    20
                ), 
                new Color(
                    59, 
                    129, 
                    21
                ), 
                new Color(
                    59, 
                    129, 
                    22
                ), 
                new Color(
                    59, 
                    129, 
                    23
                ), 
                new Color(
                    59, 
                    130, 
                    17
                ), 
                new Color(
                    59, 
                    130, 
                    18
                ), 
                new Color(
                    59, 
                    130, 
                    19
                ), 
                new Color(
                    59, 
                    130, 
                    20
                ), 
                new Color(
                    59, 
                    130, 
                    21
                ), 
                new Color(
                    59, 
                    130, 
                    22
                ), 
                new Color(
                    59, 
                    130, 
                    23
                ), 
                new Color(
                    59, 
                    131, 
                    17
                ), 
                new Color(
                    59, 
                    131, 
                    18
                ), 
                new Color(
                    59, 
                    131, 
                    19
                ), 
                new Color(
                    59, 
                    131, 
                    20
                ), 
                new Color(
                    59, 
                    131, 
                    21
                ), 
                new Color(
                    59, 
                    131, 
                    22
                ), 
                new Color(
                    59, 
                    131, 
                    23
                ), 
                new Color(
                    59, 
                    132, 
                    17
                ), 
                new Color(
                    59, 
                    132, 
                    18
                ), 
                new Color(
                    59, 
                    132, 
                    19
                ), 
                new Color(
                    59, 
                    132, 
                    20
                ), 
                new Color(
                    59, 
                    132, 
                    21
                ), 
                new Color(
                    59, 
                    132, 
                    22
                ), 
                new Color(
                    59, 
                    132, 
                    23
                ), 
                new Color(
                    59, 
                    133, 
                    17
                ), 
                new Color(
                    59, 
                    133, 
                    18
                ), 
                new Color(
                    59, 
                    133, 
                    19
                ), 
                new Color(
                    59, 
                    133, 
                    20
                ), 
                new Color(
                    59, 
                    133, 
                    21
                ), 
                new Color(
                    59, 
                    133, 
                    22
                ), 
                new Color(
                    59, 
                    133, 
                    23
                ), 
                new Color(
                    59, 
                    134, 
                    17
                ), 
                new Color(
                    59, 
                    134, 
                    18
                ), 
                new Color(
                    59, 
                    134, 
                    19
                ), 
                new Color(
                    59, 
                    134, 
                    20
                ), 
                new Color(
                    59, 
                    134, 
                    21
                ), 
                new Color(
                    59, 
                    134, 
                    22
                ), 
                new Color(
                    59, 
                    134, 
                    23
                ), 
                new Color(
                    59, 
                    135, 
                    17
                ), 
                new Color(
                    59, 
                    135, 
                    18
                ), 
                new Color(
                    59, 
                    135, 
                    19
                ), 
                new Color(
                    59, 
                    135, 
                    20
                ), 
                new Color(
                    59, 
                    135, 
                    21
                ), 
                new Color(
                    59, 
                    135, 
                    22
                ), 
                new Color(
                    59, 
                    135, 
                    23
                ), 
                new Color(
                    59, 
                    136, 
                    17
                ), 
                new Color(
                    59, 
                    136, 
                    18
                ), 
                new Color(
                    59, 
                    136, 
                    19
                ), 
                new Color(
                    59, 
                    136, 
                    20
                ), 
                new Color(
                    59, 
                    136, 
                    21
                ), 
                new Color(
                    59, 
                    136, 
                    22
                ), 
                new Color(
                    59, 
                    136, 
                    23
                ), 
                new Color(
                    59, 
                    137, 
                    17
                ), 
                new Color(
                    59, 
                    137, 
                    18
                ), 
                new Color(
                    59, 
                    137, 
                    19
                ), 
                new Color(
                    59, 
                    137, 
                    20
                ), 
                new Color(
                    59, 
                    137, 
                    21
                ), 
                new Color(
                    59, 
                    137, 
                    22
                ), 
                new Color(
                    59, 
                    137, 
                    23
                ), 
                new Color(
                    59, 
                    138, 
                    17
                ), 
                new Color(
                    59, 
                    138, 
                    18
                ), 
                new Color(
                    59, 
                    138, 
                    19
                ), 
                new Color(
                    59, 
                    138, 
                    20
                ), 
                new Color(
                    59, 
                    138, 
                    21
                ), 
                new Color(
                    59, 
                    138, 
                    22
                ), 
                new Color(
                    59, 
                    138, 
                    23
                ), 
                new Color(
                    59, 
                    139, 
                    17
                ), 
                new Color(
                    59, 
                    139, 
                    18
                ), 
                new Color(
                    59, 
                    139, 
                    19
                ), 
                new Color(
                    59, 
                    139, 
                    20
                ), 
                new Color(
                    59, 
                    139, 
                    21
                ), 
                new Color(
                    59, 
                    139, 
                    22
                ), 
                new Color(
                    59, 
                    139, 
                    23
                ), 
                new Color(
                    59, 
                    140, 
                    17
                ), 
                new Color(
                    59, 
                    140, 
                    18
                ), 
                new Color(
                    59, 
                    140, 
                    19
                ), 
                new Color(
                    59, 
                    140, 
                    20
                ), 
                new Color(
                    59, 
                    140, 
                    21
                ), 
                new Color(
                    59, 
                    140, 
                    22
                ), 
                new Color(
                    59, 
                    140, 
                    23
                ), 
                new Color(
                    59, 
                    141, 
                    17
                ), 
                new Color(
                    59, 
                    141, 
                    18
                ), 
                new Color(
                    59, 
                    141, 
                    19
                ), 
                new Color(
                    59, 
                    141, 
                    20
                ), 
                new Color(
                    59, 
                    141, 
                    21
                ), 
                new Color(
                    59, 
                    141, 
                    22
                ), 
                new Color(
                    59, 
                    141, 
                    23
                ), 
                new Color(
                    59, 
                    142, 
                    17
                ), 
                new Color(
                    59, 
                    142, 
                    18
                ), 
                new Color(
                    59, 
                    142, 
                    19
                ), 
                new Color(
                    59, 
                    142, 
                    20
                ), 
                new Color(
                    59, 
                    142, 
                    21
                ), 
                new Color(
                    59, 
                    142, 
                    22
                ), 
                new Color(
                    59, 
                    142, 
                    23
                ), 
                new Color(
                    59, 
                    143, 
                    17
                ), 
                new Color(
                    59, 
                    143, 
                    18
                ), 
                new Color(
                    59, 
                    143, 
                    19
                ), 
                new Color(
                    59, 
                    143, 
                    20
                ), 
                new Color(
                    59, 
                    143, 
                    21
                ), 
                new Color(
                    59, 
                    143, 
                    22
                ), 
                new Color(
                    59, 
                    143, 
                    23
                ), 
                new Color(
                    59, 
                    144, 
                    17
                ), 
                new Color(
                    59, 
                    144, 
                    18
                ), 
                new Color(
                    59, 
                    144, 
                    19
                ), 
                new Color(
                    59, 
                    144, 
                    20
                ), 
                new Color(
                    59, 
                    144, 
                    21
                ), 
                new Color(
                    59, 
                    144, 
                    22
                ), 
                new Color(
                    59, 
                    144, 
                    23
                ), 
                new Color(
                    59, 
                    145, 
                    17
                ), 
                new Color(
                    59, 
                    145, 
                    18
                ), 
                new Color(
                    59, 
                    145, 
                    19
                ), 
                new Color(
                    59, 
                    145, 
                    20
                ), 
                new Color(
                    59, 
                    145, 
                    21
                ), 
                new Color(
                    59, 
                    145, 
                    22
                ), 
                new Color(
                    59, 
                    145, 
                    23
                ), 
                new Color(
                    59, 
                    146, 
                    17
                ), 
                new Color(
                    59, 
                    146, 
                    18
                ), 
                new Color(
                    59, 
                    146, 
                    19
                ), 
                new Color(
                    59, 
                    146, 
                    20
                ), 
                new Color(
                    59, 
                    146, 
                    21
                ), 
                new Color(
                    59, 
                    146, 
                    22
                ), 
                new Color(
                    59, 
                    146, 
                    23
                ), 
                new Color(
                    59, 
                    147, 
                    17
                ), 
                new Color(
                    59, 
                    147, 
                    18
                ), 
                new Color(
                    59, 
                    147, 
                    19
                ), 
                new Color(
                    59, 
                    147, 
                    20
                ), 
                new Color(
                    59, 
                    147, 
                    21
                ), 
                new Color(
                    59, 
                    147, 
                    22
                ), 
                new Color(
                    59, 
                    147, 
                    23
                ), 
                new Color(
                    59, 
                    148, 
                    17
                ), 
                new Color(
                    59, 
                    148, 
                    18
                ), 
                new Color(
                    59, 
                    148, 
                    19
                ), 
                new Color(
                    59, 
                    148, 
                    20
                ), 
                new Color(
                    59, 
                    148, 
                    21
                ), 
                new Color(
                    59, 
                    148, 
                    22
                ), 
                new Color(
                    59, 
                    148, 
                    23
                ), 
                new Color(
                    59, 
                    149, 
                    17
                ), 
                new Color(
                    59, 
                    149, 
                    18
                ), 
                new Color(
                    59, 
                    149, 
                    19
                ), 
                new Color(
                    59, 
                    149, 
                    20
                ), 
                new Color(
                    59, 
                    149, 
                    21
                ), 
                new Color(
                    59, 
                    149, 
                    22
                ), 
                new Color(
                    59, 
                    149, 
                    23
                ), 
                new Color(
                    59, 
                    150, 
                    17
                ), 
                new Color(
                    59, 
                    150, 
                    18
                ), 
                new Color(
                    59, 
                    150, 
                    19
                ), 
                new Color(
                    59, 
                    150, 
                    20
                ), 
                new Color(
                    59, 
                    150, 
                    21
                ), 
                new Color(
                    59, 
                    150, 
                    22
                ), 
                new Color(
                    59, 
                    150, 
                    23
                ), 
                new Color(
                    59, 
                    151, 
                    17
                ), 
                new Color(
                    59, 
                    151, 
                    18
                ), 
                new Color(
                    59, 
                    151, 
                    19
                ), 
                new Color(
                    59, 
                    151, 
                    20
                ), 
                new Color(
                    59, 
                    151, 
                    21
                ), 
                new Color(
                    59, 
                    151, 
                    22
                ), 
                new Color(
                    59, 
                    151, 
                    23
                ), 
                new Color(
                    59, 
                    152, 
                    17
                ), 
                new Color(
                    59, 
                    152, 
                    18
                ), 
                new Color(
                    59, 
                    152, 
                    19
                ), 
                new Color(
                    59, 
                    152, 
                    20
                ), 
                new Color(
                    59, 
                    152, 
                    21
                ), 
                new Color(
                    59, 
                    152, 
                    22
                ), 
                new Color(
                    59, 
                    152, 
                    23
                ), 
                new Color(
                    59, 
                    153, 
                    17
                ), 
                new Color(
                    59, 
                    153, 
                    18
                ), 
                new Color(
                    59, 
                    153, 
                    19
                ), 
                new Color(
                    59, 
                    153, 
                    20
                ), 
                new Color(
                    59, 
                    153, 
                    21
                ), 
                new Color(
                    59, 
                    153, 
                    22
                ), 
                new Color(
                    59, 
                    153, 
                    23
                ), 
                new Color(
                    59, 
                    154, 
                    17
                ), 
                new Color(
                    59, 
                    154, 
                    18
                ), 
                new Color(
                    59, 
                    154, 
                    19
                ), 
                new Color(
                    59, 
                    154, 
                    20
                ), 
                new Color(
                    59, 
                    154, 
                    21
                ), 
                new Color(
                    59, 
                    154, 
                    22
                ), 
                new Color(
                    59, 
                    154, 
                    23
                ), 
                new Color(
                    60, 
                    118, 
                    17
                ), 
                new Color(
                    60, 
                    118, 
                    18
                ), 
                new Color(
                    60, 
                    118, 
                    19
                ), 
                new Color(
                    60, 
                    118, 
                    20
                ), 
                new Color(
                    60, 
                    118, 
                    21
                ), 
                new Color(
                    60, 
                    118, 
                    22
                ), 
                new Color(
                    60, 
                    118, 
                    23
                ), 
                new Color(
                    60, 
                    119, 
                    17
                ), 
                new Color(
                    60, 
                    119, 
                    18
                ), 
                new Color(
                    60, 
                    119, 
                    19
                ), 
                new Color(
                    60, 
                    119, 
                    20
                ), 
                new Color(
                    60, 
                    119, 
                    21
                ), 
                new Color(
                    60, 
                    119, 
                    22
                ), 
                new Color(
                    60, 
                    119, 
                    23
                ), 
                new Color(
                    60, 
                    120, 
                    17
                ), 
                new Color(
                    60, 
                    120, 
                    18
                ), 
                new Color(
                    60, 
                    120, 
                    19
                ), 
                new Color(
                    60, 
                    120, 
                    20
                ), 
                new Color(
                    60, 
                    120, 
                    21
                ), 
                new Color(
                    60, 
                    120, 
                    22
                ), 
                new Color(
                    60, 
                    120, 
                    23
                ), 
                new Color(
                    60, 
                    121, 
                    17
                ), 
                new Color(
                    60, 
                    121, 
                    18
                ), 
                new Color(
                    60, 
                    121, 
                    19
                ), 
                new Color(
                    60, 
                    121, 
                    20
                ), 
                new Color(
                    60, 
                    121, 
                    21
                ), 
                new Color(
                    60, 
                    121, 
                    22
                ), 
                new Color(
                    60, 
                    121, 
                    23
                ), 
                new Color(
                    60, 
                    122, 
                    17
                ), 
                new Color(
                    60, 
                    122, 
                    18
                ), 
                new Color(
                    60, 
                    122, 
                    19
                ), 
                new Color(
                    60, 
                    122, 
                    20
                ), 
                new Color(
                    60, 
                    122, 
                    21
                ), 
                new Color(
                    60, 
                    122, 
                    22
                ), 
                new Color(
                    60, 
                    122, 
                    23
                ), 
                new Color(
                    60, 
                    123, 
                    17
                ), 
                new Color(
                    60, 
                    123, 
                    18
                ), 
                new Color(
                    60, 
                    123, 
                    19
                ), 
                new Color(
                    60, 
                    123, 
                    20
                ), 
                new Color(
                    60, 
                    123, 
                    21
                ), 
                new Color(
                    60, 
                    123, 
                    22
                ), 
                new Color(
                    60, 
                    123, 
                    23
                ), 
                new Color(
                    60, 
                    124, 
                    17
                ), 
                new Color(
                    60, 
                    124, 
                    18
                ), 
                new Color(
                    60, 
                    124, 
                    19
                ), 
                new Color(
                    60, 
                    124, 
                    20
                ), 
                new Color(
                    60, 
                    124, 
                    21
                ), 
                new Color(
                    60, 
                    124, 
                    22
                ), 
                new Color(
                    60, 
                    124, 
                    23
                ), 
                new Color(
                    60, 
                    125, 
                    17
                ), 
                new Color(
                    60, 
                    125, 
                    18
                ), 
                new Color(
                    60, 
                    125, 
                    19
                ), 
                new Color(
                    60, 
                    125, 
                    20
                ), 
                new Color(
                    60, 
                    125, 
                    21
                ), 
                new Color(
                    60, 
                    125, 
                    22
                ), 
                new Color(
                    60, 
                    125, 
                    23
                ), 
                new Color(
                    60, 
                    126, 
                    17
                ), 
                new Color(
                    60, 
                    126, 
                    18
                ), 
                new Color(
                    60, 
                    126, 
                    19
                ), 
                new Color(
                    60, 
                    126, 
                    20
                ), 
                new Color(
                    60, 
                    126, 
                    21
                ), 
                new Color(
                    60, 
                    126, 
                    22
                ), 
                new Color(
                    60, 
                    126, 
                    23
                ), 
                new Color(
                    60, 
                    127, 
                    17
                ), 
                new Color(
                    60, 
                    127, 
                    18
                ), 
                new Color(
                    60, 
                    127, 
                    19
                ), 
                new Color(
                    60, 
                    127, 
                    20
                ), 
                new Color(
                    60, 
                    127, 
                    21
                ), 
                new Color(
                    60, 
                    127, 
                    22
                ), 
                new Color(
                    60, 
                    127, 
                    23
                ), 
                new Color(
                    60, 
                    128, 
                    17
                ), 
                new Color(
                    60, 
                    128, 
                    18
                ), 
                new Color(
                    60, 
                    128, 
                    19
                ), 
                new Color(
                    60, 
                    128, 
                    20
                ), 
                new Color(
                    60, 
                    128, 
                    21
                ), 
                new Color(
                    60, 
                    128, 
                    22
                ), 
                new Color(
                    60, 
                    128, 
                    23
                ), 
                new Color(
                    60, 
                    129, 
                    17
                ), 
                new Color(
                    60, 
                    129, 
                    18
                ), 
                new Color(
                    60, 
                    129, 
                    19
                ), 
                new Color(
                    60, 
                    129, 
                    20
                ), 
                new Color(
                    60, 
                    129, 
                    21
                ), 
                new Color(
                    60, 
                    129, 
                    22
                ), 
                new Color(
                    60, 
                    129, 
                    23
                ), 
                new Color(
                    60, 
                    130, 
                    17
                ), 
                new Color(
                    60, 
                    130, 
                    18
                ), 
                new Color(
                    60, 
                    130, 
                    19
                ), 
                new Color(
                    60, 
                    130, 
                    20
                ), 
                new Color(
                    60, 
                    130, 
                    21
                ), 
                new Color(
                    60, 
                    130, 
                    22
                ), 
                new Color(
                    60, 
                    130, 
                    23
                ), 
                new Color(
                    60, 
                    131, 
                    17
                ), 
                new Color(
                    60, 
                    131, 
                    18
                ), 
                new Color(
                    60, 
                    131, 
                    19
                ), 
                new Color(
                    60, 
                    131, 
                    20
                ), 
                new Color(
                    60, 
                    131, 
                    21
                ), 
                new Color(
                    60, 
                    131, 
                    22
                ), 
                new Color(
                    60, 
                    131, 
                    23
                ), 
                new Color(
                    60, 
                    132, 
                    17
                ), 
                new Color(
                    60, 
                    132, 
                    18
                ), 
                new Color(
                    60, 
                    132, 
                    19
                ), 
                new Color(
                    60, 
                    132, 
                    20
                ), 
                new Color(
                    60, 
                    132, 
                    21
                ), 
                new Color(
                    60, 
                    132, 
                    22
                ), 
                new Color(
                    60, 
                    132, 
                    23
                ), 
                new Color(
                    60, 
                    133, 
                    17
                ), 
                new Color(
                    60, 
                    133, 
                    18
                ), 
                new Color(
                    60, 
                    133, 
                    19
                ), 
                new Color(
                    60, 
                    133, 
                    20
                ), 
                new Color(
                    60, 
                    133, 
                    21
                ), 
                new Color(
                    60, 
                    133, 
                    22
                ), 
                new Color(
                    60, 
                    133, 
                    23
                ), 
                new Color(
                    60, 
                    134, 
                    17
                ), 
                new Color(
                    60, 
                    134, 
                    18
                ), 
                new Color(
                    60, 
                    134, 
                    19
                ), 
                new Color(
                    60, 
                    134, 
                    20
                ), 
                new Color(
                    60, 
                    134, 
                    21
                ), 
                new Color(
                    60, 
                    134, 
                    22
                ), 
                new Color(
                    60, 
                    134, 
                    23
                ), 
                new Color(
                    60, 
                    135, 
                    17
                ), 
                new Color(
                    60, 
                    135, 
                    18
                ), 
                new Color(
                    60, 
                    135, 
                    19
                ), 
                new Color(
                    60, 
                    135, 
                    20
                ), 
                new Color(
                    60, 
                    135, 
                    21
                ), 
                new Color(
                    60, 
                    135, 
                    22
                ), 
                new Color(
                    60, 
                    135, 
                    23
                ), 
                new Color(
                    60, 
                    136, 
                    17
                ), 
                new Color(
                    60, 
                    136, 
                    18
                ), 
                new Color(
                    60, 
                    136, 
                    19
                ), 
                new Color(
                    60, 
                    136, 
                    20
                ), 
                new Color(
                    60, 
                    136, 
                    21
                ), 
                new Color(
                    60, 
                    136, 
                    22
                ), 
                new Color(
                    60, 
                    136, 
                    23
                ), 
                new Color(
                    60, 
                    137, 
                    17
                ), 
                new Color(
                    60, 
                    137, 
                    18
                ), 
                new Color(
                    60, 
                    137, 
                    19
                ), 
                new Color(
                    60, 
                    137, 
                    20
                ), 
                new Color(
                    60, 
                    137, 
                    21
                ), 
                new Color(
                    60, 
                    137, 
                    22
                ), 
                new Color(
                    60, 
                    137, 
                    23
                ), 
                new Color(
                    60, 
                    138, 
                    17
                ), 
                new Color(
                    60, 
                    138, 
                    18
                ), 
                new Color(
                    60, 
                    138, 
                    19
                ), 
                new Color(
                    60, 
                    138, 
                    20
                ), 
                new Color(
                    60, 
                    138, 
                    21
                ), 
                new Color(
                    60, 
                    138, 
                    22
                ), 
                new Color(
                    60, 
                    138, 
                    23
                ), 
                new Color(
                    60, 
                    139, 
                    17
                ), 
                new Color(
                    60, 
                    139, 
                    18
                ), 
                new Color(
                    60, 
                    139, 
                    19
                ), 
                new Color(
                    60, 
                    139, 
                    20
                ), 
                new Color(
                    60, 
                    139, 
                    21
                ), 
                new Color(
                    60, 
                    139, 
                    22
                ), 
                new Color(
                    60, 
                    139, 
                    23
                ), 
                new Color(
                    60, 
                    140, 
                    17
                ), 
                new Color(
                    60, 
                    140, 
                    18
                ), 
                new Color(
                    60, 
                    140, 
                    19
                ), 
                new Color(
                    60, 
                    140, 
                    20
                ), 
                new Color(
                    60, 
                    140, 
                    21
                ), 
                new Color(
                    60, 
                    140, 
                    22
                ), 
                new Color(
                    60, 
                    140, 
                    23
                ), 
                new Color(
                    60, 
                    141, 
                    17
                ), 
                new Color(
                    60, 
                    141, 
                    18
                ), 
                new Color(
                    60, 
                    141, 
                    19
                ), 
                new Color(
                    60, 
                    141, 
                    20
                ), 
                new Color(
                    60, 
                    141, 
                    21
                ), 
                new Color(
                    60, 
                    141, 
                    22
                ), 
                new Color(
                    60, 
                    141, 
                    23
                ), 
                new Color(
                    60, 
                    142, 
                    17
                ), 
                new Color(
                    60, 
                    142, 
                    18
                ), 
                new Color(
                    60, 
                    142, 
                    19
                ), 
                new Color(
                    60, 
                    142, 
                    20
                ), 
                new Color(
                    60, 
                    142, 
                    21
                ), 
                new Color(
                    60, 
                    142, 
                    22
                ), 
                new Color(
                    60, 
                    142, 
                    23
                ), 
                new Color(
                    60, 
                    143, 
                    17
                ), 
                new Color(
                    60, 
                    143, 
                    18
                ), 
                new Color(
                    60, 
                    143, 
                    19
                ), 
                new Color(
                    60, 
                    143, 
                    20
                ), 
                new Color(
                    60, 
                    143, 
                    21
                ), 
                new Color(
                    60, 
                    143, 
                    22
                ), 
                new Color(
                    60, 
                    143, 
                    23
                ), 
                new Color(
                    60, 
                    144, 
                    17
                ), 
                new Color(
                    60, 
                    144, 
                    18
                ), 
                new Color(
                    60, 
                    144, 
                    19
                ), 
                new Color(
                    60, 
                    144, 
                    20
                ), 
                new Color(
                    60, 
                    144, 
                    21
                ), 
                new Color(
                    60, 
                    144, 
                    22
                ), 
                new Color(
                    60, 
                    144, 
                    23
                ), 
                new Color(
                    60, 
                    145, 
                    17
                ), 
                new Color(
                    60, 
                    145, 
                    18
                ), 
                new Color(
                    60, 
                    145, 
                    19
                ), 
                new Color(
                    60, 
                    145, 
                    20
                ), 
                new Color(
                    60, 
                    145, 
                    21
                ), 
                new Color(
                    60, 
                    145, 
                    22
                ), 
                new Color(
                    60, 
                    145, 
                    23
                ), 
                new Color(
                    60, 
                    146, 
                    17
                ), 
                new Color(
                    60, 
                    146, 
                    18
                ), 
                new Color(
                    60, 
                    146, 
                    19
                ), 
                new Color(
                    60, 
                    146, 
                    20
                ), 
                new Color(
                    60, 
                    146, 
                    21
                ), 
                new Color(
                    60, 
                    146, 
                    22
                ), 
                new Color(
                    60, 
                    146, 
                    23
                ), 
                new Color(
                    60, 
                    147, 
                    17
                ), 
                new Color(
                    60, 
                    147, 
                    18
                ), 
                new Color(
                    60, 
                    147, 
                    19
                ), 
                new Color(
                    60, 
                    147, 
                    20
                ), 
                new Color(
                    60, 
                    147, 
                    21
                ), 
                new Color(
                    60, 
                    147, 
                    22
                ), 
                new Color(
                    60, 
                    147, 
                    23
                ), 
                new Color(
                    60, 
                    148, 
                    17
                ), 
                new Color(
                    60, 
                    148, 
                    18
                ), 
                new Color(
                    60, 
                    148, 
                    19
                ), 
                new Color(
                    60, 
                    148, 
                    20
                ), 
                new Color(
                    60, 
                    148, 
                    21
                ), 
                new Color(
                    60, 
                    148, 
                    22
                ), 
                new Color(
                    60, 
                    148, 
                    23
                ), 
                new Color(
                    60, 
                    149, 
                    17
                ), 
                new Color(
                    60, 
                    149, 
                    18
                ), 
                new Color(
                    60, 
                    149, 
                    19
                ), 
                new Color(
                    60, 
                    149, 
                    20
                ), 
                new Color(
                    60, 
                    149, 
                    21
                ), 
                new Color(
                    60, 
                    149, 
                    22
                ), 
                new Color(
                    60, 
                    149, 
                    23
                ), 
                new Color(
                    60, 
                    150, 
                    17
                ), 
                new Color(
                    60, 
                    150, 
                    18
                ), 
                new Color(
                    60, 
                    150, 
                    19
                ), 
                new Color(
                    60, 
                    150, 
                    20
                ), 
                new Color(
                    60, 
                    150, 
                    21
                ), 
                new Color(
                    60, 
                    150, 
                    22
                ), 
                new Color(
                    60, 
                    150, 
                    23
                ), 
                new Color(
                    60, 
                    151, 
                    17
                ), 
                new Color(
                    60, 
                    151, 
                    18
                ), 
                new Color(
                    60, 
                    151, 
                    19
                ), 
                new Color(
                    60, 
                    151, 
                    20
                ), 
                new Color(
                    60, 
                    151, 
                    21
                ), 
                new Color(
                    60, 
                    151, 
                    22
                ), 
                new Color(
                    60, 
                    151, 
                    23
                ), 
                new Color(
                    60, 
                    152, 
                    17
                ), 
                new Color(
                    60, 
                    152, 
                    18
                ), 
                new Color(
                    60, 
                    152, 
                    19
                ), 
                new Color(
                    60, 
                    152, 
                    20
                ), 
                new Color(
                    60, 
                    152, 
                    21
                ), 
                new Color(
                    60, 
                    152, 
                    22
                ), 
                new Color(
                    60, 
                    152, 
                    23
                ), 
                new Color(
                    60, 
                    153, 
                    17
                ), 
                new Color(
                    60, 
                    153, 
                    18
                ), 
                new Color(
                    60, 
                    153, 
                    19
                ), 
                new Color(
                    60, 
                    153, 
                    20
                ), 
                new Color(
                    60, 
                    153, 
                    21
                ), 
                new Color(
                    60, 
                    153, 
                    22
                ), 
                new Color(
                    60, 
                    153, 
                    23
                ), 
                new Color(
                    60, 
                    154, 
                    17
                ), 
                new Color(
                    60, 
                    154, 
                    18
                ), 
                new Color(
                    60, 
                    154, 
                    19
                ), 
                new Color(
                    60, 
                    154, 
                    20
                ), 
                new Color(
                    60, 
                    154, 
                    21
                ), 
                new Color(
                    60, 
                    154, 
                    22
                ), 
                new Color(
                    60, 
                    154, 
                    23
                ), 
                new Color(
                    61, 
                    118, 
                    17
                ), 
                new Color(
                    61, 
                    118, 
                    18
                ), 
                new Color(
                    61, 
                    118, 
                    19
                ), 
                new Color(
                    61, 
                    118, 
                    20
                ), 
                new Color(
                    61, 
                    118, 
                    21
                ), 
                new Color(
                    61, 
                    118, 
                    22
                ), 
                new Color(
                    61, 
                    118, 
                    23
                ), 
                new Color(
                    61, 
                    119, 
                    17
                ), 
                new Color(
                    61, 
                    119, 
                    18
                ), 
                new Color(
                    61, 
                    119, 
                    19
                ), 
                new Color(
                    61, 
                    119, 
                    20
                ), 
                new Color(
                    61, 
                    119, 
                    21
                ), 
                new Color(
                    61, 
                    119, 
                    22
                ), 
                new Color(
                    61, 
                    119, 
                    23
                ), 
                new Color(
                    61, 
                    120, 
                    17
                ), 
                new Color(
                    61, 
                    120, 
                    18
                ), 
                new Color(
                    61, 
                    120, 
                    19
                ), 
                new Color(
                    61, 
                    120, 
                    20
                ), 
                new Color(
                    61, 
                    120, 
                    21
                ), 
                new Color(
                    61, 
                    120, 
                    22
                ), 
                new Color(
                    61, 
                    120, 
                    23
                ), 
                new Color(
                    61, 
                    121, 
                    17
                ), 
                new Color(
                    61, 
                    121, 
                    18
                ), 
                new Color(
                    61, 
                    121, 
                    19
                ), 
                new Color(
                    61, 
                    121, 
                    20
                ), 
                new Color(
                    61, 
                    121, 
                    21
                ), 
                new Color(
                    61, 
                    121, 
                    22
                ), 
                new Color(
                    61, 
                    121, 
                    23
                ), 
                new Color(
                    61, 
                    122, 
                    17
                ), 
                new Color(
                    61, 
                    122, 
                    18
                ), 
                new Color(
                    61, 
                    122, 
                    19
                ), 
                new Color(
                    61, 
                    122, 
                    20
                ), 
                new Color(
                    61, 
                    122, 
                    21
                ), 
                new Color(
                    61, 
                    122, 
                    22
                ), 
                new Color(
                    61, 
                    122, 
                    23
                ), 
                new Color(
                    61, 
                    123, 
                    17
                ), 
                new Color(
                    61, 
                    123, 
                    18
                ), 
                new Color(
                    61, 
                    123, 
                    19
                ), 
                new Color(
                    61, 
                    123, 
                    20
                ), 
                new Color(
                    61, 
                    123, 
                    21
                ), 
                new Color(
                    61, 
                    123, 
                    22
                ), 
                new Color(
                    61, 
                    123, 
                    23
                ), 
                new Color(
                    61, 
                    124, 
                    17
                ), 
                new Color(
                    61, 
                    124, 
                    18
                ), 
                new Color(
                    61, 
                    124, 
                    19
                ), 
                new Color(
                    61, 
                    124, 
                    20
                ), 
                new Color(
                    61, 
                    124, 
                    21
                ), 
                new Color(
                    61, 
                    124, 
                    22
                ), 
                new Color(
                    61, 
                    124, 
                    23
                ), 
                new Color(
                    61, 
                    125, 
                    17
                ), 
                new Color(
                    61, 
                    125, 
                    18
                ), 
                new Color(
                    61, 
                    125, 
                    19
                ), 
                new Color(
                    61, 
                    125, 
                    20
                ), 
                new Color(
                    61, 
                    125, 
                    21
                ), 
                new Color(
                    61, 
                    125, 
                    22
                ), 
                new Color(
                    61, 
                    125, 
                    23
                ), 
                new Color(
                    61, 
                    126, 
                    17
                ), 
                new Color(
                    61, 
                    126, 
                    18
                ), 
                new Color(
                    61, 
                    126, 
                    19
                ), 
                new Color(
                    61, 
                    126, 
                    20
                ), 
                new Color(
                    61, 
                    126, 
                    21
                ), 
                new Color(
                    61, 
                    126, 
                    22
                ), 
                new Color(
                    61, 
                    126, 
                    23
                ), 
                new Color(
                    61, 
                    127, 
                    17
                ), 
                new Color(
                    61, 
                    127, 
                    18
                ), 
                new Color(
                    61, 
                    127, 
                    19
                ), 
                new Color(
                    61, 
                    127, 
                    20
                ), 
                new Color(
                    61, 
                    127, 
                    21
                ), 
                new Color(
                    61, 
                    127, 
                    22
                ), 
                new Color(
                    61, 
                    127, 
                    23
                ), 
                new Color(
                    61, 
                    128, 
                    17
                ), 
                new Color(
                    61, 
                    128, 
                    18
                ), 
                new Color(
                    61, 
                    128, 
                    19
                ), 
                new Color(
                    61, 
                    128, 
                    20
                ), 
                new Color(
                    61, 
                    128, 
                    21
                ), 
                new Color(
                    61, 
                    128, 
                    22
                ), 
                new Color(
                    61, 
                    128, 
                    23
                ), 
                new Color(
                    61, 
                    129, 
                    17
                ), 
                new Color(
                    61, 
                    129, 
                    18
                ), 
                new Color(
                    61, 
                    129, 
                    19
                ), 
                new Color(
                    61, 
                    129, 
                    20
                ), 
                new Color(
                    61, 
                    129, 
                    21
                ), 
                new Color(
                    61, 
                    129, 
                    22
                ), 
                new Color(
                    61, 
                    129, 
                    23
                ), 
                new Color(
                    61, 
                    130, 
                    17
                ), 
                new Color(
                    61, 
                    130, 
                    18
                ), 
                new Color(
                    61, 
                    130, 
                    19
                ), 
                new Color(
                    61, 
                    130, 
                    20
                ), 
                new Color(
                    61, 
                    130, 
                    21
                ), 
                new Color(
                    61, 
                    130, 
                    22
                ), 
                new Color(
                    61, 
                    130, 
                    23
                ), 
                new Color(
                    61, 
                    131, 
                    17
                ), 
                new Color(
                    61, 
                    131, 
                    18
                ), 
                new Color(
                    61, 
                    131, 
                    19
                ), 
                new Color(
                    61, 
                    131, 
                    20
                ), 
                new Color(
                    61, 
                    131, 
                    21
                ), 
                new Color(
                    61, 
                    131, 
                    22
                ), 
                new Color(
                    61, 
                    131, 
                    23
                ), 
                new Color(
                    61, 
                    132, 
                    17
                ), 
                new Color(
                    61, 
                    132, 
                    18
                ), 
                new Color(
                    61, 
                    132, 
                    19
                ), 
                new Color(
                    61, 
                    132, 
                    20
                ), 
                new Color(
                    61, 
                    132, 
                    21
                ), 
                new Color(
                    61, 
                    132, 
                    22
                ), 
                new Color(
                    61, 
                    132, 
                    23
                ), 
                new Color(
                    61, 
                    133, 
                    17
                ), 
                new Color(
                    61, 
                    133, 
                    18
                ), 
                new Color(
                    61, 
                    133, 
                    19
                ), 
                new Color(
                    61, 
                    133, 
                    20
                ), 
                new Color(
                    61, 
                    133, 
                    21
                ), 
                new Color(
                    61, 
                    133, 
                    22
                ), 
                new Color(
                    61, 
                    133, 
                    23
                ), 
                new Color(
                    61, 
                    134, 
                    17
                ), 
                new Color(
                    61, 
                    134, 
                    18
                ), 
                new Color(
                    61, 
                    134, 
                    19
                ), 
                new Color(
                    61, 
                    134, 
                    20
                ), 
                new Color(
                    61, 
                    134, 
                    21
                ), 
                new Color(
                    61, 
                    134, 
                    22
                ), 
                new Color(
                    61, 
                    134, 
                    23
                ), 
                new Color(
                    61, 
                    135, 
                    17
                ), 
                new Color(
                    61, 
                    135, 
                    18
                ), 
                new Color(
                    61, 
                    135, 
                    19
                ), 
                new Color(
                    61, 
                    135, 
                    20
                ), 
                new Color(
                    61, 
                    135, 
                    21
                ), 
                new Color(
                    61, 
                    135, 
                    22
                ), 
                new Color(
                    61, 
                    135, 
                    23
                ), 
                new Color(
                    61, 
                    136, 
                    17
                ), 
                new Color(
                    61, 
                    136, 
                    18
                ), 
                new Color(
                    61, 
                    136, 
                    19
                ), 
                new Color(
                    61, 
                    136, 
                    20
                ), 
                new Color(
                    61, 
                    136, 
                    21
                ), 
                new Color(
                    61, 
                    136, 
                    22
                ), 
                new Color(
                    61, 
                    136, 
                    23
                ), 
                new Color(
                    61, 
                    137, 
                    17
                ), 
                new Color(
                    61, 
                    137, 
                    18
                ), 
                new Color(
                    61, 
                    137, 
                    19
                ), 
                new Color(
                    61, 
                    137, 
                    20
                ), 
                new Color(
                    61, 
                    137, 
                    21
                ), 
                new Color(
                    61, 
                    137, 
                    22
                ), 
                new Color(
                    61, 
                    137, 
                    23
                ), 
                new Color(
                    61, 
                    138, 
                    17
                ), 
                new Color(
                    61, 
                    138, 
                    18
                ), 
                new Color(
                    61, 
                    138, 
                    19
                ), 
                new Color(
                    61, 
                    138, 
                    20
                ), 
                new Color(
                    61, 
                    138, 
                    21
                ), 
                new Color(
                    61, 
                    138, 
                    22
                ), 
                new Color(
                    61, 
                    138, 
                    23
                ), 
                new Color(
                    61, 
                    139, 
                    17
                ), 
                new Color(
                    61, 
                    139, 
                    18
                ), 
                new Color(
                    61, 
                    139, 
                    19
                ), 
                new Color(
                    61, 
                    139, 
                    20
                ), 
                new Color(
                    61, 
                    139, 
                    21
                ), 
                new Color(
                    61, 
                    139, 
                    22
                ), 
                new Color(
                    61, 
                    139, 
                    23
                ), 
                new Color(
                    61, 
                    140, 
                    17
                ), 
                new Color(
                    61, 
                    140, 
                    18
                ), 
                new Color(
                    61, 
                    140, 
                    19
                ), 
                new Color(
                    61, 
                    140, 
                    20
                ), 
                new Color(
                    61, 
                    140, 
                    21
                ), 
                new Color(
                    61, 
                    140, 
                    22
                ), 
                new Color(
                    61, 
                    140, 
                    23
                ), 
                new Color(
                    61, 
                    141, 
                    17
                ), 
                new Color(
                    61, 
                    141, 
                    18
                ), 
                new Color(
                    61, 
                    141, 
                    19
                ), 
                new Color(
                    61, 
                    141, 
                    20
                ), 
                new Color(
                    61, 
                    141, 
                    21
                ), 
                new Color(
                    61, 
                    141, 
                    22
                ), 
                new Color(
                    61, 
                    141, 
                    23
                ), 
                new Color(
                    61, 
                    142, 
                    17
                ), 
                new Color(
                    61, 
                    142, 
                    18
                ), 
                new Color(
                    61, 
                    142, 
                    19
                ), 
                new Color(
                    61, 
                    142, 
                    20
                ), 
                new Color(
                    61, 
                    142, 
                    21
                ), 
                new Color(
                    61, 
                    142, 
                    22
                ), 
                new Color(
                    61, 
                    142, 
                    23
                ), 
                new Color(
                    61, 
                    143, 
                    17
                ), 
                new Color(
                    61, 
                    143, 
                    18
                ), 
                new Color(
                    61, 
                    143, 
                    19
                ), 
                new Color(
                    61, 
                    143, 
                    20
                ), 
                new Color(
                    61, 
                    143, 
                    21
                ), 
                new Color(
                    61, 
                    143, 
                    22
                ), 
                new Color(
                    61, 
                    143, 
                    23
                ), 
                new Color(
                    61, 
                    144, 
                    17
                ), 
                new Color(
                    61, 
                    144, 
                    18
                ), 
                new Color(
                    61, 
                    144, 
                    19
                ), 
                new Color(
                    61, 
                    144, 
                    20
                ), 
                new Color(
                    61, 
                    144, 
                    21
                ), 
                new Color(
                    61, 
                    144, 
                    22
                ), 
                new Color(
                    61, 
                    144, 
                    23
                ), 
                new Color(
                    61, 
                    145, 
                    17
                ), 
                new Color(
                    61, 
                    145, 
                    18
                ), 
                new Color(
                    61, 
                    145, 
                    19
                ), 
                new Color(
                    61, 
                    145, 
                    20
                ), 
                new Color(
                    61, 
                    145, 
                    21
                ), 
                new Color(
                    61, 
                    145, 
                    22
                ), 
                new Color(
                    61, 
                    145, 
                    23
                ), 
                new Color(
                    61, 
                    146, 
                    17
                ), 
                new Color(
                    61, 
                    146, 
                    18
                ), 
                new Color(
                    61, 
                    146, 
                    19
                ), 
                new Color(
                    61, 
                    146, 
                    20
                ), 
                new Color(
                    61, 
                    146, 
                    21
                ), 
                new Color(
                    61, 
                    146, 
                    22
                ), 
                new Color(
                    61, 
                    146, 
                    23
                ), 
                new Color(
                    61, 
                    147, 
                    17
                ), 
                new Color(
                    61, 
                    147, 
                    18
                ), 
                new Color(
                    61, 
                    147, 
                    19
                ), 
                new Color(
                    61, 
                    147, 
                    20
                ), 
                new Color(
                    61, 
                    147, 
                    21
                ), 
                new Color(
                    61, 
                    147, 
                    22
                ), 
                new Color(
                    61, 
                    147, 
                    23
                ), 
                new Color(
                    61, 
                    148, 
                    17
                ), 
                new Color(
                    61, 
                    148, 
                    18
                ), 
                new Color(
                    61, 
                    148, 
                    19
                ), 
                new Color(
                    61, 
                    148, 
                    20
                ), 
                new Color(
                    61, 
                    148, 
                    21
                ), 
                new Color(
                    61, 
                    148, 
                    22
                ), 
                new Color(
                    61, 
                    148, 
                    23
                ), 
                new Color(
                    61, 
                    149, 
                    17
                ), 
                new Color(
                    61, 
                    149, 
                    18
                ), 
                new Color(
                    61, 
                    149, 
                    19
                ), 
                new Color(
                    61, 
                    149, 
                    20
                ), 
                new Color(
                    61, 
                    149, 
                    21
                ), 
                new Color(
                    61, 
                    149, 
                    22
                ), 
                new Color(
                    61, 
                    149, 
                    23
                ), 
                new Color(
                    61, 
                    150, 
                    17
                ), 
                new Color(
                    61, 
                    150, 
                    18
                ), 
                new Color(
                    61, 
                    150, 
                    19
                ), 
                new Color(
                    61, 
                    150, 
                    20
                ), 
                new Color(
                    61, 
                    150, 
                    21
                ), 
                new Color(
                    61, 
                    150, 
                    22
                ), 
                new Color(
                    61, 
                    150, 
                    23
                ), 
                new Color(
                    61, 
                    151, 
                    17
                ), 
                new Color(
                    61, 
                    151, 
                    18
                ), 
                new Color(
                    61, 
                    151, 
                    19
                ), 
                new Color(
                    61, 
                    151, 
                    20
                ), 
                new Color(
                    61, 
                    151, 
                    21
                ), 
                new Color(
                    61, 
                    151, 
                    22
                ), 
                new Color(
                    61, 
                    151, 
                    23
                ), 
                new Color(
                    61, 
                    152, 
                    17
                ), 
                new Color(
                    61, 
                    152, 
                    18
                ), 
                new Color(
                    61, 
                    152, 
                    19
                ), 
                new Color(
                    61, 
                    152, 
                    20
                ), 
                new Color(
                    61, 
                    152, 
                    21
                ), 
                new Color(
                    61, 
                    152, 
                    22
                ), 
                new Color(
                    61, 
                    152, 
                    23
                ), 
                new Color(
                    61, 
                    153, 
                    17
                ), 
                new Color(
                    61, 
                    153, 
                    18
                ), 
                new Color(
                    61, 
                    153, 
                    19
                ), 
                new Color(
                    61, 
                    153, 
                    20
                ), 
                new Color(
                    61, 
                    153, 
                    21
                ), 
                new Color(
                    61, 
                    153, 
                    22
                ), 
                new Color(
                    61, 
                    153, 
                    23
                ), 
                new Color(
                    61, 
                    154, 
                    17
                ), 
                new Color(
                    61, 
                    154, 
                    18
                ), 
                new Color(
                    61, 
                    154, 
                    19
                ), 
                new Color(
                    61, 
                    154, 
                    20
                ), 
                new Color(
                    61, 
                    154, 
                    21
                ), 
                new Color(
                    61, 
                    154, 
                    22
                ), 
                new Color(
                    61, 
                    154, 
                    23
                ), 
                new Color(
                    62, 
                    118, 
                    17
                ), 
                new Color(
                    62, 
                    118, 
                    18
                ), 
                new Color(
                    62, 
                    118, 
                    19
                ), 
                new Color(
                    62, 
                    118, 
                    20
                ), 
                new Color(
                    62, 
                    118, 
                    21
                ), 
                new Color(
                    62, 
                    118, 
                    22
                ), 
                new Color(
                    62, 
                    118, 
                    23
                ), 
                new Color(
                    62, 
                    119, 
                    17
                ), 
                new Color(
                    62, 
                    119, 
                    18
                ), 
                new Color(
                    62, 
                    119, 
                    19
                ), 
                new Color(
                    62, 
                    119, 
                    20
                ), 
                new Color(
                    62, 
                    119, 
                    21
                ), 
                new Color(
                    62, 
                    119, 
                    22
                ), 
                new Color(
                    62, 
                    119, 
                    23
                ), 
                new Color(
                    62, 
                    120, 
                    17
                ), 
                new Color(
                    62, 
                    120, 
                    18
                ), 
                new Color(
                    62, 
                    120, 
                    19
                ), 
                new Color(
                    62, 
                    120, 
                    20
                ), 
                new Color(
                    62, 
                    120, 
                    21
                ), 
                new Color(
                    62, 
                    120, 
                    22
                ), 
                new Color(
                    62, 
                    120, 
                    23
                ), 
                new Color(
                    62, 
                    121, 
                    17
                ), 
                new Color(
                    62, 
                    121, 
                    18
                ), 
                new Color(
                    62, 
                    121, 
                    19
                ), 
                new Color(
                    62, 
                    121, 
                    20
                ), 
                new Color(
                    62, 
                    121, 
                    21
                ), 
                new Color(
                    62, 
                    121, 
                    22
                ), 
                new Color(
                    62, 
                    121, 
                    23
                ), 
                new Color(
                    62, 
                    122, 
                    17
                ), 
                new Color(
                    62, 
                    122, 
                    18
                ), 
                new Color(
                    62, 
                    122, 
                    19
                ), 
                new Color(
                    62, 
                    122, 
                    20
                ), 
                new Color(
                    62, 
                    122, 
                    21
                ), 
                new Color(
                    62, 
                    122, 
                    22
                ), 
                new Color(
                    62, 
                    122, 
                    23
                ), 
                new Color(
                    62, 
                    123, 
                    17
                ), 
                new Color(
                    62, 
                    123, 
                    18
                ), 
                new Color(
                    62, 
                    123, 
                    19
                ), 
                new Color(
                    62, 
                    123, 
                    20
                ), 
                new Color(
                    62, 
                    123, 
                    21
                ), 
                new Color(
                    62, 
                    123, 
                    22
                ), 
                new Color(
                    62, 
                    123, 
                    23
                ), 
                new Color(
                    62, 
                    124, 
                    17
                ), 
                new Color(
                    62, 
                    124, 
                    18
                ), 
                new Color(
                    62, 
                    124, 
                    19
                ), 
                new Color(
                    62, 
                    124, 
                    20
                ), 
                new Color(
                    62, 
                    124, 
                    21
                ), 
                new Color(
                    62, 
                    124, 
                    22
                ), 
                new Color(
                    62, 
                    124, 
                    23
                ), 
                new Color(
                    62, 
                    125, 
                    17
                ), 
                new Color(
                    62, 
                    125, 
                    18
                ), 
                new Color(
                    62, 
                    125, 
                    19
                ), 
                new Color(
                    62, 
                    125, 
                    20
                ), 
                new Color(
                    62, 
                    125, 
                    21
                ), 
                new Color(
                    62, 
                    125, 
                    22
                ), 
                new Color(
                    62, 
                    125, 
                    23
                ), 
                new Color(
                    62, 
                    126, 
                    17
                ), 
                new Color(
                    62, 
                    126, 
                    18
                ), 
                new Color(
                    62, 
                    126, 
                    19
                ), 
                new Color(
                    62, 
                    126, 
                    20
                ), 
                new Color(
                    62, 
                    126, 
                    21
                ), 
                new Color(
                    62, 
                    126, 
                    22
                ), 
                new Color(
                    62, 
                    126, 
                    23
                ), 
                new Color(
                    62, 
                    127, 
                    17
                ), 
                new Color(
                    62, 
                    127, 
                    18
                ), 
                new Color(
                    62, 
                    127, 
                    19
                ), 
                new Color(
                    62, 
                    127, 
                    20
                ), 
                new Color(
                    62, 
                    127, 
                    21
                ), 
                new Color(
                    62, 
                    127, 
                    22
                ), 
                new Color(
                    62, 
                    127, 
                    23
                ), 
                new Color(
                    62, 
                    128, 
                    17
                ), 
                new Color(
                    62, 
                    128, 
                    18
                ), 
                new Color(
                    62, 
                    128, 
                    19
                ), 
                new Color(
                    62, 
                    128, 
                    20
                ), 
                new Color(
                    62, 
                    128, 
                    21
                ), 
                new Color(
                    62, 
                    128, 
                    22
                ), 
                new Color(
                    62, 
                    128, 
                    23
                ), 
                new Color(
                    62, 
                    129, 
                    17
                ), 
                new Color(
                    62, 
                    129, 
                    18
                ), 
                new Color(
                    62, 
                    129, 
                    19
                ), 
                new Color(
                    62, 
                    129, 
                    20
                ), 
                new Color(
                    62, 
                    129, 
                    21
                ), 
                new Color(
                    62, 
                    129, 
                    22
                ), 
                new Color(
                    62, 
                    129, 
                    23
                ), 
                new Color(
                    62, 
                    130, 
                    17
                ), 
                new Color(
                    62, 
                    130, 
                    18
                ), 
                new Color(
                    62, 
                    130, 
                    19
                ), 
                new Color(
                    62, 
                    130, 
                    20
                ), 
                new Color(
                    62, 
                    130, 
                    21
                ), 
                new Color(
                    62, 
                    130, 
                    22
                ), 
                new Color(
                    62, 
                    130, 
                    23
                ), 
                new Color(
                    62, 
                    131, 
                    17
                ), 
                new Color(
                    62, 
                    131, 
                    18
                ), 
                new Color(
                    62, 
                    131, 
                    19
                ), 
                new Color(
                    62, 
                    131, 
                    20
                ), 
                new Color(
                    62, 
                    131, 
                    21
                ), 
                new Color(
                    62, 
                    131, 
                    22
                ), 
                new Color(
                    62, 
                    131, 
                    23
                ), 
                new Color(
                    62, 
                    132, 
                    17
                ), 
                new Color(
                    62, 
                    132, 
                    18
                ), 
                new Color(
                    62, 
                    132, 
                    19
                ), 
                new Color(
                    62, 
                    132, 
                    20
                ), 
                new Color(
                    62, 
                    132, 
                    21
                ), 
                new Color(
                    62, 
                    132, 
                    22
                ), 
                new Color(
                    62, 
                    132, 
                    23
                ), 
                new Color(
                    62, 
                    133, 
                    17
                ), 
                new Color(
                    62, 
                    133, 
                    18
                ), 
                new Color(
                    62, 
                    133, 
                    19
                ), 
                new Color(
                    62, 
                    133, 
                    20
                ), 
                new Color(
                    62, 
                    133, 
                    21
                ), 
                new Color(
                    62, 
                    133, 
                    22
                ), 
                new Color(
                    62, 
                    133, 
                    23
                ), 
                new Color(
                    62, 
                    134, 
                    17
                ), 
                new Color(
                    62, 
                    134, 
                    18
                ), 
                new Color(
                    62, 
                    134, 
                    19
                ), 
                new Color(
                    62, 
                    134, 
                    20
                ), 
                new Color(
                    62, 
                    134, 
                    21
                ), 
                new Color(
                    62, 
                    134, 
                    22
                ), 
                new Color(
                    62, 
                    134, 
                    23
                ), 
                new Color(
                    62, 
                    135, 
                    17
                ), 
                new Color(
                    62, 
                    135, 
                    18
                ), 
                new Color(
                    62, 
                    135, 
                    19
                ), 
                new Color(
                    62, 
                    135, 
                    20
                ), 
                new Color(
                    62, 
                    135, 
                    21
                ), 
                new Color(
                    62, 
                    135, 
                    22
                ), 
                new Color(
                    62, 
                    135, 
                    23
                ), 
                new Color(
                    62, 
                    136, 
                    17
                ), 
                new Color(
                    62, 
                    136, 
                    18
                ), 
                new Color(
                    62, 
                    136, 
                    19
                ), 
                new Color(
                    62, 
                    136, 
                    20
                ), 
                new Color(
                    62, 
                    136, 
                    21
                ), 
                new Color(
                    62, 
                    136, 
                    22
                ), 
                new Color(
                    62, 
                    136, 
                    23
                ), 
                new Color(
                    62, 
                    137, 
                    17
                ), 
                new Color(
                    62, 
                    137, 
                    18
                ), 
                new Color(
                    62, 
                    137, 
                    19
                ), 
                new Color(
                    62, 
                    137, 
                    20
                ), 
                new Color(
                    62, 
                    137, 
                    21
                ), 
                new Color(
                    62, 
                    137, 
                    22
                ), 
                new Color(
                    62, 
                    137, 
                    23
                ), 
                new Color(
                    62, 
                    138, 
                    17
                ), 
                new Color(
                    62, 
                    138, 
                    18
                ), 
                new Color(
                    62, 
                    138, 
                    19
                ), 
                new Color(
                    62, 
                    138, 
                    20
                ), 
                new Color(
                    62, 
                    138, 
                    21
                ), 
                new Color(
                    62, 
                    138, 
                    22
                ), 
                new Color(
                    62, 
                    138, 
                    23
                ), 
                new Color(
                    62, 
                    139, 
                    17
                ), 
                new Color(
                    62, 
                    139, 
                    18
                ), 
                new Color(
                    62, 
                    139, 
                    19
                ), 
                new Color(
                    62, 
                    139, 
                    20
                ), 
                new Color(
                    62, 
                    139, 
                    21
                ), 
                new Color(
                    62, 
                    139, 
                    22
                ), 
                new Color(
                    62, 
                    139, 
                    23
                ), 
                new Color(
                    62, 
                    140, 
                    17
                ), 
                new Color(
                    62, 
                    140, 
                    18
                ), 
                new Color(
                    62, 
                    140, 
                    19
                ), 
                new Color(
                    62, 
                    140, 
                    20
                ), 
                new Color(
                    62, 
                    140, 
                    21
                ), 
                new Color(
                    62, 
                    140, 
                    22
                ), 
                new Color(
                    62, 
                    140, 
                    23
                ), 
                new Color(
                    62, 
                    141, 
                    17
                ), 
                new Color(
                    62, 
                    141, 
                    18
                ), 
                new Color(
                    62, 
                    141, 
                    19
                ), 
                new Color(
                    62, 
                    141, 
                    20
                ), 
                new Color(
                    62, 
                    141, 
                    21
                ), 
                new Color(
                    62, 
                    141, 
                    22
                ), 
                new Color(
                    62, 
                    141, 
                    23
                ), 
                new Color(
                    62, 
                    142, 
                    17
                ), 
                new Color(
                    62, 
                    142, 
                    18
                ), 
                new Color(
                    62, 
                    142, 
                    19
                ), 
                new Color(
                    62, 
                    142, 
                    20
                ), 
                new Color(
                    62, 
                    142, 
                    21
                ), 
                new Color(
                    62, 
                    142, 
                    22
                ), 
                new Color(
                    62, 
                    142, 
                    23
                ), 
                new Color(
                    62, 
                    143, 
                    17
                ), 
                new Color(
                    62, 
                    143, 
                    18
                ), 
                new Color(
                    62, 
                    143, 
                    19
                ), 
                new Color(
                    62, 
                    143, 
                    20
                ), 
                new Color(
                    62, 
                    143, 
                    21
                ), 
                new Color(
                    62, 
                    143, 
                    22
                ), 
                new Color(
                    62, 
                    143, 
                    23
                ), 
                new Color(
                    62, 
                    144, 
                    17
                ), 
                new Color(
                    62, 
                    144, 
                    18
                ), 
                new Color(
                    62, 
                    144, 
                    19
                ), 
                new Color(
                    62, 
                    144, 
                    20
                ), 
                new Color(
                    62, 
                    144, 
                    21
                ), 
                new Color(
                    62, 
                    144, 
                    22
                ), 
                new Color(
                    62, 
                    144, 
                    23
                ), 
                new Color(
                    62, 
                    145, 
                    17
                ), 
                new Color(
                    62, 
                    145, 
                    18
                ), 
                new Color(
                    62, 
                    145, 
                    19
                ), 
                new Color(
                    62, 
                    145, 
                    20
                ), 
                new Color(
                    62, 
                    145, 
                    21
                ), 
                new Color(
                    62, 
                    145, 
                    22
                ), 
                new Color(
                    62, 
                    145, 
                    23
                ), 
                new Color(
                    62, 
                    146, 
                    17
                ), 
                new Color(
                    62, 
                    146, 
                    18
                ), 
                new Color(
                    62, 
                    146, 
                    19
                ), 
                new Color(
                    62, 
                    146, 
                    20
                ), 
                new Color(
                    62, 
                    146, 
                    21
                ), 
                new Color(
                    62, 
                    146, 
                    22
                ), 
                new Color(
                    62, 
                    146, 
                    23
                ), 
                new Color(
                    62, 
                    147, 
                    17
                ), 
                new Color(
                    62, 
                    147, 
                    18
                ), 
                new Color(
                    62, 
                    147, 
                    19
                ), 
                new Color(
                    62, 
                    147, 
                    20
                ), 
                new Color(
                    62, 
                    147, 
                    21
                ), 
                new Color(
                    62, 
                    147, 
                    22
                ), 
                new Color(
                    62, 
                    147, 
                    23
                ), 
                new Color(
                    62, 
                    148, 
                    17
                ), 
                new Color(
                    62, 
                    148, 
                    18
                ), 
                new Color(
                    62, 
                    148, 
                    19
                ), 
                new Color(
                    62, 
                    148, 
                    20
                ), 
                new Color(
                    62, 
                    148, 
                    21
                ), 
                new Color(
                    62, 
                    148, 
                    22
                ), 
                new Color(
                    62, 
                    148, 
                    23
                ), 
                new Color(
                    62, 
                    149, 
                    17
                ), 
                new Color(
                    62, 
                    149, 
                    18
                ), 
                new Color(
                    62, 
                    149, 
                    19
                ), 
                new Color(
                    62, 
                    149, 
                    20
                ), 
                new Color(
                    62, 
                    149, 
                    21
                ), 
                new Color(
                    62, 
                    149, 
                    22
                ), 
                new Color(
                    62, 
                    149, 
                    23
                ), 
                new Color(
                    62, 
                    150, 
                    17
                ), 
                new Color(
                    62, 
                    150, 
                    18
                ), 
                new Color(
                    62, 
                    150, 
                    19
                ), 
                new Color(
                    62, 
                    150, 
                    20
                ), 
                new Color(
                    62, 
                    150, 
                    21
                ), 
                new Color(
                    62, 
                    150, 
                    22
                ), 
                new Color(
                    62, 
                    150, 
                    23
                ), 
                new Color(
                    62, 
                    151, 
                    17
                ), 
                new Color(
                    62, 
                    151, 
                    18
                ), 
                new Color(
                    62, 
                    151, 
                    19
                ), 
                new Color(
                    62, 
                    151, 
                    20
                ), 
                new Color(
                    62, 
                    151, 
                    21
                ), 
                new Color(
                    62, 
                    151, 
                    22
                ), 
                new Color(
                    62, 
                    151, 
                    23
                ), 
                new Color(
                    62, 
                    152, 
                    17
                ), 
                new Color(
                    62, 
                    152, 
                    18
                ), 
                new Color(
                    62, 
                    152, 
                    19
                ), 
                new Color(
                    62, 
                    152, 
                    20
                ), 
                new Color(
                    62, 
                    152, 
                    21
                ), 
                new Color(
                    62, 
                    152, 
                    22
                ), 
                new Color(
                    62, 
                    152, 
                    23
                ), 
                new Color(
                    62, 
                    153, 
                    17
                ), 
                new Color(
                    62, 
                    153, 
                    18
                ), 
                new Color(
                    62, 
                    153, 
                    19
                ), 
                new Color(
                    62, 
                    153, 
                    20
                ), 
                new Color(
                    62, 
                    153, 
                    21
                ), 
                new Color(
                    62, 
                    153, 
                    22
                ), 
                new Color(
                    62, 
                    153, 
                    23
                ), 
                new Color(
                    62, 
                    154, 
                    17
                ), 
                new Color(
                    62, 
                    154, 
                    18
                ), 
                new Color(
                    62, 
                    154, 
                    19
                ), 
                new Color(
                    62, 
                    154, 
                    20
                ), 
                new Color(
                    62, 
                    154, 
                    21
                ), 
                new Color(
                    62, 
                    154, 
                    22
                ), 
                new Color(
                    62, 
                    154, 
                    23
                ), 
                new Color(
                    63, 
                    118, 
                    17
                ), 
                new Color(
                    63, 
                    118, 
                    18
                ), 
                new Color(
                    63, 
                    118, 
                    19
                ), 
                new Color(
                    63, 
                    118, 
                    20
                ), 
                new Color(
                    63, 
                    118, 
                    21
                ), 
                new Color(
                    63, 
                    118, 
                    22
                ), 
                new Color(
                    63, 
                    118, 
                    23
                ), 
                new Color(
                    63, 
                    119, 
                    17
                ), 
                new Color(
                    63, 
                    119, 
                    18
                ), 
                new Color(
                    63, 
                    119, 
                    19
                ), 
                new Color(
                    63, 
                    119, 
                    20
                ), 
                new Color(
                    63, 
                    119, 
                    21
                ), 
                new Color(
                    63, 
                    119, 
                    22
                ), 
                new Color(
                    63, 
                    119, 
                    23
                ), 
                new Color(
                    63, 
                    120, 
                    17
                ), 
                new Color(
                    63, 
                    120, 
                    18
                ), 
                new Color(
                    63, 
                    120, 
                    19
                ), 
                new Color(
                    63, 
                    120, 
                    20
                ), 
                new Color(
                    63, 
                    120, 
                    21
                ), 
                new Color(
                    63, 
                    120, 
                    22
                ), 
                new Color(
                    63, 
                    120, 
                    23
                ), 
                new Color(
                    63, 
                    121, 
                    17
                ), 
                new Color(
                    63, 
                    121, 
                    18
                ), 
                new Color(
                    63, 
                    121, 
                    19
                ), 
                new Color(
                    63, 
                    121, 
                    20
                ), 
                new Color(
                    63, 
                    121, 
                    21
                ), 
                new Color(
                    63, 
                    121, 
                    22
                ), 
                new Color(
                    63, 
                    121, 
                    23
                ), 
                new Color(
                    63, 
                    122, 
                    17
                ), 
                new Color(
                    63, 
                    122, 
                    18
                ), 
                new Color(
                    63, 
                    122, 
                    19
                ), 
                new Color(
                    63, 
                    122, 
                    20
                ), 
                new Color(
                    63, 
                    122, 
                    21
                ), 
                new Color(
                    63, 
                    122, 
                    22
                ), 
                new Color(
                    63, 
                    122, 
                    23
                ), 
                new Color(
                    63, 
                    123, 
                    17
                ), 
                new Color(
                    63, 
                    123, 
                    18
                ), 
                new Color(
                    63, 
                    123, 
                    19
                ), 
                new Color(
                    63, 
                    123, 
                    20
                ), 
                new Color(
                    63, 
                    123, 
                    21
                ), 
                new Color(
                    63, 
                    123, 
                    22
                ), 
                new Color(
                    63, 
                    123, 
                    23
                ), 
                new Color(
                    63, 
                    124, 
                    17
                ), 
                new Color(
                    63, 
                    124, 
                    18
                ), 
                new Color(
                    63, 
                    124, 
                    19
                ), 
                new Color(
                    63, 
                    124, 
                    20
                ), 
                new Color(
                    63, 
                    124, 
                    21
                ), 
                new Color(
                    63, 
                    124, 
                    22
                ), 
                new Color(
                    63, 
                    124, 
                    23
                ), 
                new Color(
                    63, 
                    125, 
                    17
                ), 
                new Color(
                    63, 
                    125, 
                    18
                ), 
                new Color(
                    63, 
                    125, 
                    19
                ), 
                new Color(
                    63, 
                    125, 
                    20
                ), 
                new Color(
                    63, 
                    125, 
                    21
                ), 
                new Color(
                    63, 
                    125, 
                    22
                ), 
                new Color(
                    63, 
                    125, 
                    23
                ), 
                new Color(
                    63, 
                    126, 
                    17
                ), 
                new Color(
                    63, 
                    126, 
                    18
                ), 
                new Color(
                    63, 
                    126, 
                    19
                ), 
                new Color(
                    63, 
                    126, 
                    20
                ), 
                new Color(
                    63, 
                    126, 
                    21
                ), 
                new Color(
                    63, 
                    126, 
                    22
                ), 
                new Color(
                    63, 
                    126, 
                    23
                ), 
                new Color(
                    63, 
                    127, 
                    17
                ), 
                new Color(
                    63, 
                    127, 
                    18
                ), 
                new Color(
                    63, 
                    127, 
                    19
                ), 
                new Color(
                    63, 
                    127, 
                    20
                ), 
                new Color(
                    63, 
                    127, 
                    21
                ), 
                new Color(
                    63, 
                    127, 
                    22
                ), 
                new Color(
                    63, 
                    127, 
                    23
                ), 
                new Color(
                    63, 
                    128, 
                    17
                ), 
                new Color(
                    63, 
                    128, 
                    18
                ), 
                new Color(
                    63, 
                    128, 
                    19
                ), 
                new Color(
                    63, 
                    128, 
                    20
                ), 
                new Color(
                    63, 
                    128, 
                    21
                ), 
                new Color(
                    63, 
                    128, 
                    22
                ), 
                new Color(
                    63, 
                    128, 
                    23
                ), 
                new Color(
                    63, 
                    129, 
                    17
                ), 
                new Color(
                    63, 
                    129, 
                    18
                ), 
                new Color(
                    63, 
                    129, 
                    19
                ), 
                new Color(
                    63, 
                    129, 
                    20
                ), 
                new Color(
                    63, 
                    129, 
                    21
                ), 
                new Color(
                    63, 
                    129, 
                    22
                ), 
                new Color(
                    63, 
                    129, 
                    23
                ), 
                new Color(
                    63, 
                    130, 
                    17
                ), 
                new Color(
                    63, 
                    130, 
                    18
                ), 
                new Color(
                    63, 
                    130, 
                    19
                ), 
                new Color(
                    63, 
                    130, 
                    20
                ), 
                new Color(
                    63, 
                    130, 
                    21
                ), 
                new Color(
                    63, 
                    130, 
                    22
                ), 
                new Color(
                    63, 
                    130, 
                    23
                ), 
                new Color(
                    63, 
                    131, 
                    17
                ), 
                new Color(
                    63, 
                    131, 
                    18
                ), 
                new Color(
                    63, 
                    131, 
                    19
                ), 
                new Color(
                    63, 
                    131, 
                    20
                ), 
                new Color(
                    63, 
                    131, 
                    21
                ), 
                new Color(
                    63, 
                    131, 
                    22
                ), 
                new Color(
                    63, 
                    131, 
                    23
                ), 
                new Color(
                    63, 
                    132, 
                    17
                ), 
                new Color(
                    63, 
                    132, 
                    18
                ), 
                new Color(
                    63, 
                    132, 
                    19
                ), 
                new Color(
                    63, 
                    132, 
                    20
                ), 
                new Color(
                    63, 
                    132, 
                    21
                ), 
                new Color(
                    63, 
                    132, 
                    22
                ), 
                new Color(
                    63, 
                    132, 
                    23
                ), 
                new Color(
                    63, 
                    133, 
                    17
                ), 
                new Color(
                    63, 
                    133, 
                    18
                ), 
                new Color(
                    63, 
                    133, 
                    19
                ), 
                new Color(
                    63, 
                    133, 
                    20
                ), 
                new Color(
                    63, 
                    133, 
                    21
                ), 
                new Color(
                    63, 
                    133, 
                    22
                ), 
                new Color(
                    63, 
                    133, 
                    23
                ), 
                new Color(
                    63, 
                    134, 
                    17
                ), 
                new Color(
                    63, 
                    134, 
                    18
                ), 
                new Color(
                    63, 
                    134, 
                    19
                ), 
                new Color(
                    63, 
                    134, 
                    20
                ), 
                new Color(
                    63, 
                    134, 
                    21
                ), 
                new Color(
                    63, 
                    134, 
                    22
                ), 
                new Color(
                    63, 
                    134, 
                    23
                ), 
                new Color(
                    63, 
                    135, 
                    17
                ), 
                new Color(
                    63, 
                    135, 
                    18
                ), 
                new Color(
                    63, 
                    135, 
                    19
                ), 
                new Color(
                    63, 
                    135, 
                    20
                ), 
                new Color(
                    63, 
                    135, 
                    21
                ), 
                new Color(
                    63, 
                    135, 
                    22
                ), 
                new Color(
                    63, 
                    135, 
                    23
                ), 
                new Color(
                    63, 
                    136, 
                    17
                ), 
                new Color(
                    63, 
                    136, 
                    18
                ), 
                new Color(
                    63, 
                    136, 
                    19
                ), 
                new Color(
                    63, 
                    136, 
                    20
                ), 
                new Color(
                    63, 
                    136, 
                    21
                ), 
                new Color(
                    63, 
                    136, 
                    22
                ), 
                new Color(
                    63, 
                    136, 
                    23
                ), 
                new Color(
                    63, 
                    137, 
                    17
                ), 
                new Color(
                    63, 
                    137, 
                    18
                ), 
                new Color(
                    63, 
                    137, 
                    19
                ), 
                new Color(
                    63, 
                    137, 
                    20
                ), 
                new Color(
                    63, 
                    137, 
                    21
                ), 
                new Color(
                    63, 
                    137, 
                    22
                ), 
                new Color(
                    63, 
                    137, 
                    23
                ), 
                new Color(
                    63, 
                    138, 
                    17
                ), 
                new Color(
                    63, 
                    138, 
                    18
                ), 
                new Color(
                    63, 
                    138, 
                    19
                ), 
                new Color(
                    63, 
                    138, 
                    20
                ), 
                new Color(
                    63, 
                    138, 
                    21
                ), 
                new Color(
                    63, 
                    138, 
                    22
                ), 
                new Color(
                    63, 
                    138, 
                    23
                ), 
                new Color(
                    63, 
                    139, 
                    17
                ), 
                new Color(
                    63, 
                    139, 
                    18
                ), 
                new Color(
                    63, 
                    139, 
                    19
                ), 
                new Color(
                    63, 
                    139, 
                    20
                ), 
                new Color(
                    63, 
                    139, 
                    21
                ), 
                new Color(
                    63, 
                    139, 
                    22
                ), 
                new Color(
                    63, 
                    139, 
                    23
                ), 
                new Color(
                    63, 
                    140, 
                    17
                ), 
                new Color(
                    63, 
                    140, 
                    18
                ), 
                new Color(
                    63, 
                    140, 
                    19
                ), 
                new Color(
                    63, 
                    140, 
                    20
                ), 
                new Color(
                    63, 
                    140, 
                    21
                ), 
                new Color(
                    63, 
                    140, 
                    22
                ), 
                new Color(
                    63, 
                    140, 
                    23
                ), 
                new Color(
                    63, 
                    141, 
                    17
                ), 
                new Color(
                    63, 
                    141, 
                    18
                ), 
                new Color(
                    63, 
                    141, 
                    19
                ), 
                new Color(
                    63, 
                    141, 
                    20
                ), 
                new Color(
                    63, 
                    141, 
                    21
                ), 
                new Color(
                    63, 
                    141, 
                    22
                ), 
                new Color(
                    63, 
                    141, 
                    23
                ), 
                new Color(
                    63, 
                    142, 
                    17
                ), 
                new Color(
                    63, 
                    142, 
                    18
                ), 
                new Color(
                    63, 
                    142, 
                    19
                ), 
                new Color(
                    63, 
                    142, 
                    20
                ), 
                new Color(
                    63, 
                    142, 
                    21
                ), 
                new Color(
                    63, 
                    142, 
                    22
                ), 
                new Color(
                    63, 
                    142, 
                    23
                ), 
                new Color(
                    63, 
                    143, 
                    17
                ), 
                new Color(
                    63, 
                    143, 
                    18
                ), 
                new Color(
                    63, 
                    143, 
                    19
                ), 
                new Color(
                    63, 
                    143, 
                    20
                ), 
                new Color(
                    63, 
                    143, 
                    21
                ), 
                new Color(
                    63, 
                    143, 
                    22
                ), 
                new Color(
                    63, 
                    143, 
                    23
                ), 
                new Color(
                    63, 
                    144, 
                    17
                ), 
                new Color(
                    63, 
                    144, 
                    18
                ), 
                new Color(
                    63, 
                    144, 
                    19
                ), 
                new Color(
                    63, 
                    144, 
                    20
                ), 
                new Color(
                    63, 
                    144, 
                    21
                ), 
                new Color(
                    63, 
                    144, 
                    22
                ), 
                new Color(
                    63, 
                    144, 
                    23
                ), 
                new Color(
                    63, 
                    145, 
                    17
                ), 
                new Color(
                    63, 
                    145, 
                    18
                ), 
                new Color(
                    63, 
                    145, 
                    19
                ), 
                new Color(
                    63, 
                    145, 
                    20
                ), 
                new Color(
                    63, 
                    145, 
                    21
                ), 
                new Color(
                    63, 
                    145, 
                    22
                ), 
                new Color(
                    63, 
                    145, 
                    23
                ), 
                new Color(
                    63, 
                    146, 
                    17
                ), 
                new Color(
                    63, 
                    146, 
                    18
                ), 
                new Color(
                    63, 
                    146, 
                    19
                ), 
                new Color(
                    63, 
                    146, 
                    20
                ), 
                new Color(
                    63, 
                    146, 
                    21
                ), 
                new Color(
                    63, 
                    146, 
                    22
                ), 
                new Color(
                    63, 
                    146, 
                    23
                ), 
                new Color(
                    63, 
                    147, 
                    17
                ), 
                new Color(
                    63, 
                    147, 
                    18
                ), 
                new Color(
                    63, 
                    147, 
                    19
                ), 
                new Color(
                    63, 
                    147, 
                    20
                ), 
                new Color(
                    63, 
                    147, 
                    21
                ), 
                new Color(
                    63, 
                    147, 
                    22
                ), 
                new Color(
                    63, 
                    147, 
                    23
                ), 
                new Color(
                    63, 
                    148, 
                    17
                ), 
                new Color(
                    63, 
                    148, 
                    18
                ), 
                new Color(
                    63, 
                    148, 
                    19
                ), 
                new Color(
                    63, 
                    148, 
                    20
                ), 
                new Color(
                    63, 
                    148, 
                    21
                ), 
                new Color(
                    63, 
                    148, 
                    22
                ), 
                new Color(
                    63, 
                    148, 
                    23
                ), 
                new Color(
                    63, 
                    149, 
                    17
                ), 
                new Color(
                    63, 
                    149, 
                    18
                ), 
                new Color(
                    63, 
                    149, 
                    19
                ), 
                new Color(
                    63, 
                    149, 
                    20
                ), 
                new Color(
                    63, 
                    149, 
                    21
                ), 
                new Color(
                    63, 
                    149, 
                    22
                ), 
                new Color(
                    63, 
                    149, 
                    23
                ), 
                new Color(
                    63, 
                    150, 
                    17
                ), 
                new Color(
                    63, 
                    150, 
                    18
                ), 
                new Color(
                    63, 
                    150, 
                    19
                ), 
                new Color(
                    63, 
                    150, 
                    20
                ), 
                new Color(
                    63, 
                    150, 
                    21
                ), 
                new Color(
                    63, 
                    150, 
                    22
                ), 
                new Color(
                    63, 
                    150, 
                    23
                ), 
                new Color(
                    63, 
                    151, 
                    17
                ), 
                new Color(
                    63, 
                    151, 
                    18
                ), 
                new Color(
                    63, 
                    151, 
                    19
                ), 
                new Color(
                    63, 
                    151, 
                    20
                ), 
                new Color(
                    63, 
                    151, 
                    21
                ), 
                new Color(
                    63, 
                    151, 
                    22
                ), 
                new Color(
                    63, 
                    151, 
                    23
                ), 
                new Color(
                    63, 
                    152, 
                    17
                ), 
                new Color(
                    63, 
                    152, 
                    18
                ), 
                new Color(
                    63, 
                    152, 
                    19
                ), 
                new Color(
                    63, 
                    152, 
                    20
                ), 
                new Color(
                    63, 
                    152, 
                    21
                ), 
                new Color(
                    63, 
                    152, 
                    22
                ), 
                new Color(
                    63, 
                    152, 
                    23
                ), 
                new Color(
                    63, 
                    153, 
                    17
                ), 
                new Color(
                    63, 
                    153, 
                    18
                ), 
                new Color(
                    63, 
                    153, 
                    19
                ), 
                new Color(
                    63, 
                    153, 
                    20
                ), 
                new Color(
                    63, 
                    153, 
                    21
                ), 
                new Color(
                    63, 
                    153, 
                    22
                ), 
                new Color(
                    63, 
                    153, 
                    23
                ), 
                new Color(
                    63, 
                    154, 
                    17
                ), 
                new Color(
                    63, 
                    154, 
                    18
                ), 
                new Color(
                    63, 
                    154, 
                    19
                ), 
                new Color(
                    63, 
                    154, 
                    20
                ), 
                new Color(
                    63, 
                    154, 
                    21
                ), 
                new Color(
                    63, 
                    154, 
                    22
                ), 
                new Color(
                    63, 
                    154, 
                    23
                ), 
                new Color(
                    64, 
                    118, 
                    17
                ), 
                new Color(
                    64, 
                    118, 
                    18
                ), 
                new Color(
                    64, 
                    118, 
                    19
                ), 
                new Color(
                    64, 
                    118, 
                    20
                ), 
                new Color(
                    64, 
                    118, 
                    21
                ), 
                new Color(
                    64, 
                    118, 
                    22
                ), 
                new Color(
                    64, 
                    118, 
                    23
                ), 
                new Color(
                    64, 
                    119, 
                    17
                ), 
                new Color(
                    64, 
                    119, 
                    18
                ), 
                new Color(
                    64, 
                    119, 
                    19
                ), 
                new Color(
                    64, 
                    119, 
                    20
                ), 
                new Color(
                    64, 
                    119, 
                    21
                ), 
                new Color(
                    64, 
                    119, 
                    22
                ), 
                new Color(
                    64, 
                    119, 
                    23
                ), 
                new Color(
                    64, 
                    120, 
                    17
                ), 
                new Color(
                    64, 
                    120, 
                    18
                ), 
                new Color(
                    64, 
                    120, 
                    19
                ), 
                new Color(
                    64, 
                    120, 
                    20
                ), 
                new Color(
                    64, 
                    120, 
                    21
                ), 
                new Color(
                    64, 
                    120, 
                    22
                ), 
                new Color(
                    64, 
                    120, 
                    23
                ), 
                new Color(
                    64, 
                    121, 
                    17
                ), 
                new Color(
                    64, 
                    121, 
                    18
                ), 
                new Color(
                    64, 
                    121, 
                    19
                ), 
                new Color(
                    64, 
                    121, 
                    20
                ), 
                new Color(
                    64, 
                    121, 
                    21
                ), 
                new Color(
                    64, 
                    121, 
                    22
                ), 
                new Color(
                    64, 
                    121, 
                    23
                ), 
                new Color(
                    64, 
                    122, 
                    17
                ), 
                new Color(
                    64, 
                    122, 
                    18
                ), 
                new Color(
                    64, 
                    122, 
                    19
                ), 
                new Color(
                    64, 
                    122, 
                    20
                ), 
                new Color(
                    64, 
                    122, 
                    21
                ), 
                new Color(
                    64, 
                    122, 
                    22
                ), 
                new Color(
                    64, 
                    122, 
                    23
                ), 
                new Color(
                    64, 
                    123, 
                    17
                ), 
                new Color(
                    64, 
                    123, 
                    18
                ), 
                new Color(
                    64, 
                    123, 
                    19
                ), 
                new Color(
                    64, 
                    123, 
                    20
                ), 
                new Color(
                    64, 
                    123, 
                    21
                ), 
                new Color(
                    64, 
                    123, 
                    22
                ), 
                new Color(
                    64, 
                    123, 
                    23
                ), 
                new Color(
                    64, 
                    124, 
                    17
                ), 
                new Color(
                    64, 
                    124, 
                    18
                ), 
                new Color(
                    64, 
                    124, 
                    19
                ), 
                new Color(
                    64, 
                    124, 
                    20
                ), 
                new Color(
                    64, 
                    124, 
                    21
                ), 
                new Color(
                    64, 
                    124, 
                    22
                ), 
                new Color(
                    64, 
                    124, 
                    23
                ), 
                new Color(
                    64, 
                    125, 
                    17
                ), 
                new Color(
                    64, 
                    125, 
                    18
                ), 
                new Color(
                    64, 
                    125, 
                    19
                ), 
                new Color(
                    64, 
                    125, 
                    20
                ), 
                new Color(
                    64, 
                    125, 
                    21
                ), 
                new Color(
                    64, 
                    125, 
                    22
                ), 
                new Color(
                    64, 
                    125, 
                    23
                ), 
                new Color(
                    64, 
                    126, 
                    17
                ), 
                new Color(
                    64, 
                    126, 
                    18
                ), 
                new Color(
                    64, 
                    126, 
                    19
                ), 
                new Color(
                    64, 
                    126, 
                    20
                ), 
                new Color(
                    64, 
                    126, 
                    21
                ), 
                new Color(
                    64, 
                    126, 
                    22
                ), 
                new Color(
                    64, 
                    126, 
                    23
                ), 
                new Color(
                    64, 
                    127, 
                    17
                ), 
                new Color(
                    64, 
                    127, 
                    18
                ), 
                new Color(
                    64, 
                    127, 
                    19
                ), 
                new Color(
                    64, 
                    127, 
                    20
                ), 
                new Color(
                    64, 
                    127, 
                    21
                ), 
                new Color(
                    64, 
                    127, 
                    22
                ), 
                new Color(
                    64, 
                    127, 
                    23
                ), 
                new Color(
                    64, 
                    128, 
                    17
                ), 
                new Color(
                    64, 
                    128, 
                    18
                ), 
                new Color(
                    64, 
                    128, 
                    19
                ), 
                new Color(
                    64, 
                    128, 
                    20
                ), 
                new Color(
                    64, 
                    128, 
                    21
                ), 
                new Color(
                    64, 
                    128, 
                    22
                ), 
                new Color(
                    64, 
                    128, 
                    23
                ), 
                new Color(
                    64, 
                    129, 
                    17
                ), 
                new Color(
                    64, 
                    129, 
                    18
                ), 
                new Color(
                    64, 
                    129, 
                    19
                ), 
                new Color(
                    64, 
                    129, 
                    20
                ), 
                new Color(
                    64, 
                    129, 
                    21
                ), 
                new Color(
                    64, 
                    129, 
                    22
                ), 
                new Color(
                    64, 
                    129, 
                    23
                ), 
                new Color(
                    64, 
                    130, 
                    17
                ), 
                new Color(
                    64, 
                    130, 
                    18
                ), 
                new Color(
                    64, 
                    130, 
                    19
                ), 
                new Color(
                    64, 
                    130, 
                    20
                ), 
                new Color(
                    64, 
                    130, 
                    21
                ), 
                new Color(
                    64, 
                    130, 
                    22
                ), 
                new Color(
                    64, 
                    130, 
                    23
                ), 
                new Color(
                    64, 
                    131, 
                    17
                ), 
                new Color(
                    64, 
                    131, 
                    18
                ), 
                new Color(
                    64, 
                    131, 
                    19
                ), 
                new Color(
                    64, 
                    131, 
                    20
                ), 
                new Color(
                    64, 
                    131, 
                    21
                ), 
                new Color(
                    64, 
                    131, 
                    22
                ), 
                new Color(
                    64, 
                    131, 
                    23
                ), 
                new Color(
                    64, 
                    132, 
                    17
                ), 
                new Color(
                    64, 
                    132, 
                    18
                ), 
                new Color(
                    64, 
                    132, 
                    19
                ), 
                new Color(
                    64, 
                    132, 
                    20
                ), 
                new Color(
                    64, 
                    132, 
                    21
                ), 
                new Color(
                    64, 
                    132, 
                    22
                ), 
                new Color(
                    64, 
                    132, 
                    23
                ), 
                new Color(
                    64, 
                    133, 
                    17
                ), 
                new Color(
                    64, 
                    133, 
                    18
                ), 
                new Color(
                    64, 
                    133, 
                    19
                ), 
                new Color(
                    64, 
                    133, 
                    20
                ), 
                new Color(
                    64, 
                    133, 
                    21
                ), 
                new Color(
                    64, 
                    133, 
                    22
                ), 
                new Color(
                    64, 
                    133, 
                    23
                ), 
                new Color(
                    64, 
                    134, 
                    17
                ), 
                new Color(
                    64, 
                    134, 
                    18
                ), 
                new Color(
                    64, 
                    134, 
                    19
                ), 
                new Color(
                    64, 
                    134, 
                    20
                ), 
                new Color(
                    64, 
                    134, 
                    21
                ), 
                new Color(
                    64, 
                    134, 
                    22
                ), 
                new Color(
                    64, 
                    134, 
                    23
                ), 
                new Color(
                    64, 
                    135, 
                    17
                ), 
                new Color(
                    64, 
                    135, 
                    18
                ), 
                new Color(
                    64, 
                    135, 
                    19
                ), 
                new Color(
                    64, 
                    135, 
                    20
                ), 
                new Color(
                    64, 
                    135, 
                    21
                ), 
                new Color(
                    64, 
                    135, 
                    22
                ), 
                new Color(
                    64, 
                    135, 
                    23
                ), 
                new Color(
                    64, 
                    136, 
                    17
                ), 
                new Color(
                    64, 
                    136, 
                    18
                ), 
                new Color(
                    64, 
                    136, 
                    19
                ), 
                new Color(
                    64, 
                    136, 
                    20
                ), 
                new Color(
                    64, 
                    136, 
                    21
                ), 
                new Color(
                    64, 
                    136, 
                    22
                ), 
                new Color(
                    64, 
                    136, 
                    23
                ), 
                new Color(
                    64, 
                    137, 
                    17
                ), 
                new Color(
                    64, 
                    137, 
                    18
                ), 
                new Color(
                    64, 
                    137, 
                    19
                ), 
                new Color(
                    64, 
                    137, 
                    20
                ), 
                new Color(
                    64, 
                    137, 
                    21
                ), 
                new Color(
                    64, 
                    137, 
                    22
                ), 
                new Color(
                    64, 
                    137, 
                    23
                ), 
                new Color(
                    64, 
                    138, 
                    17
                ), 
                new Color(
                    64, 
                    138, 
                    18
                ), 
                new Color(
                    64, 
                    138, 
                    19
                ), 
                new Color(
                    64, 
                    138, 
                    20
                ), 
                new Color(
                    64, 
                    138, 
                    21
                ), 
                new Color(
                    64, 
                    138, 
                    22
                ), 
                new Color(
                    64, 
                    138, 
                    23
                ), 
                new Color(
                    64, 
                    139, 
                    17
                ), 
                new Color(
                    64, 
                    139, 
                    18
                ), 
                new Color(
                    64, 
                    139, 
                    19
                ), 
                new Color(
                    64, 
                    139, 
                    20
                ), 
                new Color(
                    64, 
                    139, 
                    21
                ), 
                new Color(
                    64, 
                    139, 
                    22
                ), 
                new Color(
                    64, 
                    139, 
                    23
                ), 
                new Color(
                    64, 
                    140, 
                    17
                ), 
                new Color(
                    64, 
                    140, 
                    18
                ), 
                new Color(
                    64, 
                    140, 
                    19
                ), 
                new Color(
                    64, 
                    140, 
                    20
                ), 
                new Color(
                    64, 
                    140, 
                    21
                ), 
                new Color(
                    64, 
                    140, 
                    22
                ), 
                new Color(
                    64, 
                    140, 
                    23
                ), 
                new Color(
                    64, 
                    141, 
                    17
                ), 
                new Color(
                    64, 
                    141, 
                    18
                ), 
                new Color(
                    64, 
                    141, 
                    19
                ), 
                new Color(
                    64, 
                    141, 
                    20
                ), 
                new Color(
                    64, 
                    141, 
                    21
                ), 
                new Color(
                    64, 
                    141, 
                    22
                ), 
                new Color(
                    64, 
                    141, 
                    23
                ), 
                new Color(
                    64, 
                    142, 
                    17
                ), 
                new Color(
                    64, 
                    142, 
                    18
                ), 
                new Color(
                    64, 
                    142, 
                    19
                ), 
                new Color(
                    64, 
                    142, 
                    20
                ), 
                new Color(
                    64, 
                    142, 
                    21
                ), 
                new Color(
                    64, 
                    142, 
                    22
                ), 
                new Color(
                    64, 
                    142, 
                    23
                ), 
                new Color(
                    64, 
                    143, 
                    17
                ), 
                new Color(
                    64, 
                    143, 
                    18
                ), 
                new Color(
                    64, 
                    143, 
                    19
                ), 
                new Color(
                    64, 
                    143, 
                    20
                ), 
                new Color(
                    64, 
                    143, 
                    21
                ), 
                new Color(
                    64, 
                    143, 
                    22
                ), 
                new Color(
                    64, 
                    143, 
                    23
                ), 
                new Color(
                    64, 
                    144, 
                    17
                ), 
                new Color(
                    64, 
                    144, 
                    18
                ), 
                new Color(
                    64, 
                    144, 
                    19
                ), 
                new Color(
                    64, 
                    144, 
                    20
                ), 
                new Color(
                    64, 
                    144, 
                    21
                ), 
                new Color(
                    64, 
                    144, 
                    22
                ), 
                new Color(
                    64, 
                    144, 
                    23
                ), 
                new Color(
                    64, 
                    145, 
                    17
                ), 
                new Color(
                    64, 
                    145, 
                    18
                ), 
                new Color(
                    64, 
                    145, 
                    19
                ), 
                new Color(
                    64, 
                    145, 
                    20
                ), 
                new Color(
                    64, 
                    145, 
                    21
                ), 
                new Color(
                    64, 
                    145, 
                    22
                ), 
                new Color(
                    64, 
                    145, 
                    23
                ), 
                new Color(
                    64, 
                    146, 
                    17
                ), 
                new Color(
                    64, 
                    146, 
                    18
                ), 
                new Color(
                    64, 
                    146, 
                    19
                ), 
                new Color(
                    64, 
                    146, 
                    20
                ), 
                new Color(
                    64, 
                    146, 
                    21
                ), 
                new Color(
                    64, 
                    146, 
                    22
                ), 
                new Color(
                    64, 
                    146, 
                    23
                ), 
                new Color(
                    64, 
                    147, 
                    17
                ), 
                new Color(
                    64, 
                    147, 
                    18
                ), 
                new Color(
                    64, 
                    147, 
                    19
                ), 
                new Color(
                    64, 
                    147, 
                    20
                ), 
                new Color(
                    64, 
                    147, 
                    21
                ), 
                new Color(
                    64, 
                    147, 
                    22
                ), 
                new Color(
                    64, 
                    147, 
                    23
                ), 
                new Color(
                    64, 
                    148, 
                    17
                ), 
                new Color(
                    64, 
                    148, 
                    18
                ), 
                new Color(
                    64, 
                    148, 
                    19
                ), 
                new Color(
                    64, 
                    148, 
                    20
                ), 
                new Color(
                    64, 
                    148, 
                    21
                ), 
                new Color(
                    64, 
                    148, 
                    22
                ), 
                new Color(
                    64, 
                    148, 
                    23
                ), 
                new Color(
                    64, 
                    149, 
                    17
                ), 
                new Color(
                    64, 
                    149, 
                    18
                ), 
                new Color(
                    64, 
                    149, 
                    19
                ), 
                new Color(
                    64, 
                    149, 
                    20
                ), 
                new Color(
                    64, 
                    149, 
                    21
                ), 
                new Color(
                    64, 
                    149, 
                    22
                ), 
                new Color(
                    64, 
                    149, 
                    23
                ), 
                new Color(
                    64, 
                    150, 
                    17
                ), 
                new Color(
                    64, 
                    150, 
                    18
                ), 
                new Color(
                    64, 
                    150, 
                    19
                ), 
                new Color(
                    64, 
                    150, 
                    20
                ), 
                new Color(
                    64, 
                    150, 
                    21
                ), 
                new Color(
                    64, 
                    150, 
                    22
                ), 
                new Color(
                    64, 
                    150, 
                    23
                ), 
                new Color(
                    64, 
                    151, 
                    17
                ), 
                new Color(
                    64, 
                    151, 
                    18
                ), 
                new Color(
                    64, 
                    151, 
                    19
                ), 
                new Color(
                    64, 
                    151, 
                    20
                ), 
                new Color(
                    64, 
                    151, 
                    21
                ), 
                new Color(
                    64, 
                    151, 
                    22
                ), 
                new Color(
                    64, 
                    151, 
                    23
                ), 
                new Color(
                    64, 
                    152, 
                    17
                ), 
                new Color(
                    64, 
                    152, 
                    18
                ), 
                new Color(
                    64, 
                    152, 
                    19
                ), 
                new Color(
                    64, 
                    152, 
                    20
                ), 
                new Color(
                    64, 
                    152, 
                    21
                ), 
                new Color(
                    64, 
                    152, 
                    22
                ), 
                new Color(
                    64, 
                    152, 
                    23
                ), 
                new Color(
                    64, 
                    153, 
                    17
                ), 
                new Color(
                    64, 
                    153, 
                    18
                ), 
                new Color(
                    64, 
                    153, 
                    19
                ), 
                new Color(
                    64, 
                    153, 
                    20
                ), 
                new Color(
                    64, 
                    153, 
                    21
                ), 
                new Color(
                    64, 
                    153, 
                    22
                ), 
                new Color(
                    64, 
                    153, 
                    23
                ), 
                new Color(
                    64, 
                    154, 
                    17
                ), 
                new Color(
                    64, 
                    154, 
                    18
                ), 
                new Color(
                    64, 
                    154, 
                    19
                ), 
                new Color(
                    64, 
                    154, 
                    20
                ), 
                new Color(
                    64, 
                    154, 
                    21
                ), 
                new Color(
                    64, 
                    154, 
                    22
                ), 
                new Color(
                    64, 
                    154, 
                    23
                ), 
                new Color(
                    65, 
                    118, 
                    17
                ), 
                new Color(
                    65, 
                    118, 
                    18
                ), 
                new Color(
                    65, 
                    118, 
                    19
                ), 
                new Color(
                    65, 
                    118, 
                    20
                ), 
                new Color(
                    65, 
                    118, 
                    21
                ), 
                new Color(
                    65, 
                    118, 
                    22
                ), 
                new Color(
                    65, 
                    118, 
                    23
                ), 
                new Color(
                    65, 
                    119, 
                    17
                ), 
                new Color(
                    65, 
                    119, 
                    18
                ), 
                new Color(
                    65, 
                    119, 
                    19
                ), 
                new Color(
                    65, 
                    119, 
                    20
                ), 
                new Color(
                    65, 
                    119, 
                    21
                ), 
                new Color(
                    65, 
                    119, 
                    22
                ), 
                new Color(
                    65, 
                    119, 
                    23
                ), 
                new Color(
                    65, 
                    120, 
                    17
                ), 
                new Color(
                    65, 
                    120, 
                    18
                ), 
                new Color(
                    65, 
                    120, 
                    19
                ), 
                new Color(
                    65, 
                    120, 
                    20
                ), 
                new Color(
                    65, 
                    120, 
                    21
                ), 
                new Color(
                    65, 
                    120, 
                    22
                ), 
                new Color(
                    65, 
                    120, 
                    23
                ), 
                new Color(
                    65, 
                    121, 
                    17
                ), 
                new Color(
                    65, 
                    121, 
                    18
                ), 
                new Color(
                    65, 
                    121, 
                    19
                ), 
                new Color(
                    65, 
                    121, 
                    20
                ), 
                new Color(
                    65, 
                    121, 
                    21
                ), 
                new Color(
                    65, 
                    121, 
                    22
                ), 
                new Color(
                    65, 
                    121, 
                    23
                ), 
                new Color(
                    65, 
                    122, 
                    17
                ), 
                new Color(
                    65, 
                    122, 
                    18
                ), 
                new Color(
                    65, 
                    122, 
                    19
                ), 
                new Color(
                    65, 
                    122, 
                    20
                ), 
                new Color(
                    65, 
                    122, 
                    21
                ), 
                new Color(
                    65, 
                    122, 
                    22
                ), 
                new Color(
                    65, 
                    122, 
                    23
                ), 
                new Color(
                    65, 
                    123, 
                    17
                ), 
                new Color(
                    65, 
                    123, 
                    18
                ), 
                new Color(
                    65, 
                    123, 
                    19
                ), 
                new Color(
                    65, 
                    123, 
                    20
                ), 
                new Color(
                    65, 
                    123, 
                    21
                ), 
                new Color(
                    65, 
                    123, 
                    22
                ), 
                new Color(
                    65, 
                    123, 
                    23
                ), 
                new Color(
                    65, 
                    124, 
                    17
                ), 
                new Color(
                    65, 
                    124, 
                    18
                ), 
                new Color(
                    65, 
                    124, 
                    19
                ), 
                new Color(
                    65, 
                    124, 
                    20
                ), 
                new Color(
                    65, 
                    124, 
                    21
                ), 
                new Color(
                    65, 
                    124, 
                    22
                ), 
                new Color(
                    65, 
                    124, 
                    23
                ), 
                new Color(
                    65, 
                    125, 
                    17
                ), 
                new Color(
                    65, 
                    125, 
                    18
                ), 
                new Color(
                    65, 
                    125, 
                    19
                ), 
                new Color(
                    65, 
                    125, 
                    20
                ), 
                new Color(
                    65, 
                    125, 
                    21
                ), 
                new Color(
                    65, 
                    125, 
                    22
                ), 
                new Color(
                    65, 
                    125, 
                    23
                ), 
                new Color(
                    65, 
                    126, 
                    17
                ), 
                new Color(
                    65, 
                    126, 
                    18
                ), 
                new Color(
                    65, 
                    126, 
                    19
                ), 
                new Color(
                    65, 
                    126, 
                    20
                ), 
                new Color(
                    65, 
                    126, 
                    21
                ), 
                new Color(
                    65, 
                    126, 
                    22
                ), 
                new Color(
                    65, 
                    126, 
                    23
                ), 
                new Color(
                    65, 
                    127, 
                    17
                ), 
                new Color(
                    65, 
                    127, 
                    18
                ), 
                new Color(
                    65, 
                    127, 
                    19
                ), 
                new Color(
                    65, 
                    127, 
                    20
                ), 
                new Color(
                    65, 
                    127, 
                    21
                ), 
                new Color(
                    65, 
                    127, 
                    22
                ), 
                new Color(
                    65, 
                    127, 
                    23
                ), 
                new Color(
                    65, 
                    128, 
                    17
                ), 
                new Color(
                    65, 
                    128, 
                    18
                ), 
                new Color(
                    65, 
                    128, 
                    19
                ), 
                new Color(
                    65, 
                    128, 
                    20
                ), 
                new Color(
                    65, 
                    128, 
                    21
                ), 
                new Color(
                    65, 
                    128, 
                    22
                ), 
                new Color(
                    65, 
                    128, 
                    23
                ), 
                new Color(
                    65, 
                    129, 
                    17
                ), 
                new Color(
                    65, 
                    129, 
                    18
                ), 
                new Color(
                    65, 
                    129, 
                    19
                ), 
                new Color(
                    65, 
                    129, 
                    20
                ), 
                new Color(
                    65, 
                    129, 
                    21
                ), 
                new Color(
                    65, 
                    129, 
                    22
                ), 
                new Color(
                    65, 
                    129, 
                    23
                ), 
                new Color(
                    65, 
                    130, 
                    17
                ), 
                new Color(
                    65, 
                    130, 
                    18
                ), 
                new Color(
                    65, 
                    130, 
                    19
                ), 
                new Color(
                    65, 
                    130, 
                    20
                ), 
                new Color(
                    65, 
                    130, 
                    21
                ), 
                new Color(
                    65, 
                    130, 
                    22
                ), 
                new Color(
                    65, 
                    130, 
                    23
                ), 
                new Color(
                    65, 
                    131, 
                    17
                ), 
                new Color(
                    65, 
                    131, 
                    18
                ), 
                new Color(
                    65, 
                    131, 
                    19
                ), 
                new Color(
                    65, 
                    131, 
                    20
                ), 
                new Color(
                    65, 
                    131, 
                    21
                ), 
                new Color(
                    65, 
                    131, 
                    22
                ), 
                new Color(
                    65, 
                    131, 
                    23
                ), 
                new Color(
                    65, 
                    132, 
                    17
                ), 
                new Color(
                    65, 
                    132, 
                    18
                ), 
                new Color(
                    65, 
                    132, 
                    19
                ), 
                new Color(
                    65, 
                    132, 
                    20
                ), 
                new Color(
                    65, 
                    132, 
                    21
                ), 
                new Color(
                    65, 
                    132, 
                    22
                ), 
                new Color(
                    65, 
                    132, 
                    23
                ), 
                new Color(
                    65, 
                    133, 
                    17
                ), 
                new Color(
                    65, 
                    133, 
                    18
                ), 
                new Color(
                    65, 
                    133, 
                    19
                ), 
                new Color(
                    65, 
                    133, 
                    20
                ), 
                new Color(
                    65, 
                    133, 
                    21
                ), 
                new Color(
                    65, 
                    133, 
                    22
                ), 
                new Color(
                    65, 
                    133, 
                    23
                ), 
                new Color(
                    65, 
                    134, 
                    17
                ), 
                new Color(
                    65, 
                    134, 
                    18
                ), 
                new Color(
                    65, 
                    134, 
                    19
                ), 
                new Color(
                    65, 
                    134, 
                    20
                ), 
                new Color(
                    65, 
                    134, 
                    21
                ), 
                new Color(
                    65, 
                    134, 
                    22
                ), 
                new Color(
                    65, 
                    134, 
                    23
                ), 
                new Color(
                    65, 
                    135, 
                    17
                ), 
                new Color(
                    65, 
                    135, 
                    18
                ), 
                new Color(
                    65, 
                    135, 
                    19
                ), 
                new Color(
                    65, 
                    135, 
                    20
                ), 
                new Color(
                    65, 
                    135, 
                    21
                ), 
                new Color(
                    65, 
                    135, 
                    22
                ), 
                new Color(
                    65, 
                    135, 
                    23
                ), 
                new Color(
                    65, 
                    136, 
                    17
                ), 
                new Color(
                    65, 
                    136, 
                    18
                ), 
                new Color(
                    65, 
                    136, 
                    19
                ), 
                new Color(
                    65, 
                    136, 
                    20
                ), 
                new Color(
                    65, 
                    136, 
                    21
                ), 
                new Color(
                    65, 
                    136, 
                    22
                ), 
                new Color(
                    65, 
                    136, 
                    23
                ), 
                new Color(
                    65, 
                    137, 
                    17
                ), 
                new Color(
                    65, 
                    137, 
                    18
                ), 
                new Color(
                    65, 
                    137, 
                    19
                ), 
                new Color(
                    65, 
                    137, 
                    20
                ), 
                new Color(
                    65, 
                    137, 
                    21
                ), 
                new Color(
                    65, 
                    137, 
                    22
                ), 
                new Color(
                    65, 
                    137, 
                    23
                ), 
                new Color(
                    65, 
                    138, 
                    17
                ), 
                new Color(
                    65, 
                    138, 
                    18
                ), 
                new Color(
                    65, 
                    138, 
                    19
                ), 
                new Color(
                    65, 
                    138, 
                    20
                ), 
                new Color(
                    65, 
                    138, 
                    21
                ), 
                new Color(
                    65, 
                    138, 
                    22
                ), 
                new Color(
                    65, 
                    138, 
                    23
                ), 
                new Color(
                    65, 
                    139, 
                    17
                ), 
                new Color(
                    65, 
                    139, 
                    18
                ), 
                new Color(
                    65, 
                    139, 
                    19
                ), 
                new Color(
                    65, 
                    139, 
                    20
                ), 
                new Color(
                    65, 
                    139, 
                    21
                ), 
                new Color(
                    65, 
                    139, 
                    22
                ), 
                new Color(
                    65, 
                    139, 
                    23
                ), 
                new Color(
                    65, 
                    140, 
                    17
                ), 
                new Color(
                    65, 
                    140, 
                    18
                ), 
                new Color(
                    65, 
                    140, 
                    19
                ), 
                new Color(
                    65, 
                    140, 
                    20
                ), 
                new Color(
                    65, 
                    140, 
                    21
                ), 
                new Color(
                    65, 
                    140, 
                    22
                ), 
                new Color(
                    65, 
                    140, 
                    23
                ), 
                new Color(
                    65, 
                    141, 
                    17
                ), 
                new Color(
                    65, 
                    141, 
                    18
                ), 
                new Color(
                    65, 
                    141, 
                    19
                ), 
                new Color(
                    65, 
                    141, 
                    20
                ), 
                new Color(
                    65, 
                    141, 
                    21
                ), 
                new Color(
                    65, 
                    141, 
                    22
                ), 
                new Color(
                    65, 
                    141, 
                    23
                ), 
                new Color(
                    65, 
                    142, 
                    17
                ), 
                new Color(
                    65, 
                    142, 
                    18
                ), 
                new Color(
                    65, 
                    142, 
                    19
                ), 
                new Color(
                    65, 
                    142, 
                    20
                ), 
                new Color(
                    65, 
                    142, 
                    21
                ), 
                new Color(
                    65, 
                    142, 
                    22
                ), 
                new Color(
                    65, 
                    142, 
                    23
                ), 
                new Color(
                    65, 
                    143, 
                    17
                ), 
                new Color(
                    65, 
                    143, 
                    18
                ), 
                new Color(
                    65, 
                    143, 
                    19
                ), 
                new Color(
                    65, 
                    143, 
                    20
                ), 
                new Color(
                    65, 
                    143, 
                    21
                ), 
                new Color(
                    65, 
                    143, 
                    22
                ), 
                new Color(
                    65, 
                    143, 
                    23
                ), 
                new Color(
                    65, 
                    144, 
                    17
                ), 
                new Color(
                    65, 
                    144, 
                    18
                ), 
                new Color(
                    65, 
                    144, 
                    19
                ), 
                new Color(
                    65, 
                    144, 
                    20
                ), 
                new Color(
                    65, 
                    144, 
                    21
                ), 
                new Color(
                    65, 
                    144, 
                    22
                ), 
                new Color(
                    65, 
                    144, 
                    23
                ), 
                new Color(
                    65, 
                    145, 
                    17
                ), 
                new Color(
                    65, 
                    145, 
                    18
                ), 
                new Color(
                    65, 
                    145, 
                    19
                ), 
                new Color(
                    65, 
                    145, 
                    20
                ), 
                new Color(
                    65, 
                    145, 
                    21
                ), 
                new Color(
                    65, 
                    145, 
                    22
                ), 
                new Color(
                    65, 
                    145, 
                    23
                ), 
                new Color(
                    65, 
                    146, 
                    17
                ), 
                new Color(
                    65, 
                    146, 
                    18
                ), 
                new Color(
                    65, 
                    146, 
                    19
                ), 
                new Color(
                    65, 
                    146, 
                    20
                ), 
                new Color(
                    65, 
                    146, 
                    21
                ), 
                new Color(
                    65, 
                    146, 
                    22
                ), 
                new Color(
                    65, 
                    146, 
                    23
                ), 
                new Color(
                    65, 
                    147, 
                    17
                ), 
                new Color(
                    65, 
                    147, 
                    18
                ), 
                new Color(
                    65, 
                    147, 
                    19
                ), 
                new Color(
                    65, 
                    147, 
                    20
                ), 
                new Color(
                    65, 
                    147, 
                    21
                ), 
                new Color(
                    65, 
                    147, 
                    22
                ), 
                new Color(
                    65, 
                    147, 
                    23
                ), 
                new Color(
                    65, 
                    148, 
                    17
                ), 
                new Color(
                    65, 
                    148, 
                    18
                ), 
                new Color(
                    65, 
                    148, 
                    19
                ), 
                new Color(
                    65, 
                    148, 
                    20
                ), 
                new Color(
                    65, 
                    148, 
                    21
                ), 
                new Color(
                    65, 
                    148, 
                    22
                ), 
                new Color(
                    65, 
                    148, 
                    23
                ), 
                new Color(
                    65, 
                    149, 
                    17
                ), 
                new Color(
                    65, 
                    149, 
                    18
                ), 
                new Color(
                    65, 
                    149, 
                    19
                ), 
                new Color(
                    65, 
                    149, 
                    20
                ), 
                new Color(
                    65, 
                    149, 
                    21
                ), 
                new Color(
                    65, 
                    149, 
                    22
                ), 
                new Color(
                    65, 
                    149, 
                    23
                ), 
                new Color(
                    65, 
                    150, 
                    17
                ), 
                new Color(
                    65, 
                    150, 
                    18
                ), 
                new Color(
                    65, 
                    150, 
                    19
                ), 
                new Color(
                    65, 
                    150, 
                    20
                ), 
                new Color(
                    65, 
                    150, 
                    21
                ), 
                new Color(
                    65, 
                    150, 
                    22
                ), 
                new Color(
                    65, 
                    150, 
                    23
                ), 
                new Color(
                    65, 
                    151, 
                    17
                ), 
                new Color(
                    65, 
                    151, 
                    18
                ), 
                new Color(
                    65, 
                    151, 
                    19
                ), 
                new Color(
                    65, 
                    151, 
                    20
                ), 
                new Color(
                    65, 
                    151, 
                    21
                ), 
                new Color(
                    65, 
                    151, 
                    22
                ), 
                new Color(
                    65, 
                    151, 
                    23
                ), 
                new Color(
                    65, 
                    152, 
                    17
                ), 
                new Color(
                    65, 
                    152, 
                    18
                ), 
                new Color(
                    65, 
                    152, 
                    19
                ), 
                new Color(
                    65, 
                    152, 
                    20
                ), 
                new Color(
                    65, 
                    152, 
                    21
                ), 
                new Color(
                    65, 
                    152, 
                    22
                ), 
                new Color(
                    65, 
                    152, 
                    23
                ), 
                new Color(
                    65, 
                    153, 
                    17
                ), 
                new Color(
                    65, 
                    153, 
                    18
                ), 
                new Color(
                    65, 
                    153, 
                    19
                ), 
                new Color(
                    65, 
                    153, 
                    20
                ), 
                new Color(
                    65, 
                    153, 
                    21
                ), 
                new Color(
                    65, 
                    153, 
                    22
                ), 
                new Color(
                    65, 
                    153, 
                    23
                ), 
                new Color(
                    65, 
                    154, 
                    17
                ), 
                new Color(
                    65, 
                    154, 
                    18
                ), 
                new Color(
                    65, 
                    154, 
                    19
                ), 
                new Color(
                    65, 
                    154, 
                    20
                ), 
                new Color(
                    65, 
                    154, 
                    21
                ), 
                new Color(
                    65, 
                    154, 
                    22
                ), 
                new Color(
                    65, 
                    154, 
                    23
                ), 
                new Color(
                    66, 
                    118, 
                    17
                ), 
                new Color(
                    66, 
                    118, 
                    18
                ), 
                new Color(
                    66, 
                    118, 
                    19
                ), 
                new Color(
                    66, 
                    118, 
                    20
                ), 
                new Color(
                    66, 
                    118, 
                    21
                ), 
                new Color(
                    66, 
                    118, 
                    22
                ), 
                new Color(
                    66, 
                    118, 
                    23
                ), 
                new Color(
                    66, 
                    119, 
                    17
                ), 
                new Color(
                    66, 
                    119, 
                    18
                ), 
                new Color(
                    66, 
                    119, 
                    19
                ), 
                new Color(
                    66, 
                    119, 
                    20
                ), 
                new Color(
                    66, 
                    119, 
                    21
                ), 
                new Color(
                    66, 
                    119, 
                    22
                ), 
                new Color(
                    66, 
                    119, 
                    23
                ), 
                new Color(
                    66, 
                    120, 
                    17
                ), 
                new Color(
                    66, 
                    120, 
                    18
                ), 
                new Color(
                    66, 
                    120, 
                    19
                ), 
                new Color(
                    66, 
                    120, 
                    20
                ), 
                new Color(
                    66, 
                    120, 
                    21
                ), 
                new Color(
                    66, 
                    120, 
                    22
                ), 
                new Color(
                    66, 
                    120, 
                    23
                ), 
                new Color(
                    66, 
                    121, 
                    17
                ), 
                new Color(
                    66, 
                    121, 
                    18
                ), 
                new Color(
                    66, 
                    121, 
                    19
                ), 
                new Color(
                    66, 
                    121, 
                    20
                ), 
                new Color(
                    66, 
                    121, 
                    21
                ), 
                new Color(
                    66, 
                    121, 
                    22
                ), 
                new Color(
                    66, 
                    121, 
                    23
                ), 
                new Color(
                    66, 
                    122, 
                    17
                ), 
                new Color(
                    66, 
                    122, 
                    18
                ), 
                new Color(
                    66, 
                    122, 
                    19
                ), 
                new Color(
                    66, 
                    122, 
                    20
                ), 
                new Color(
                    66, 
                    122, 
                    21
                ), 
                new Color(
                    66, 
                    122, 
                    22
                ), 
                new Color(
                    66, 
                    122, 
                    23
                ), 
                new Color(
                    66, 
                    123, 
                    17
                ), 
                new Color(
                    66, 
                    123, 
                    18
                ), 
                new Color(
                    66, 
                    123, 
                    19
                ), 
                new Color(
                    66, 
                    123, 
                    20
                ), 
                new Color(
                    66, 
                    123, 
                    21
                ), 
                new Color(
                    66, 
                    123, 
                    22
                ), 
                new Color(
                    66, 
                    123, 
                    23
                ), 
                new Color(
                    66, 
                    124, 
                    17
                ), 
                new Color(
                    66, 
                    124, 
                    18
                ), 
                new Color(
                    66, 
                    124, 
                    19
                ), 
                new Color(
                    66, 
                    124, 
                    20
                ), 
                new Color(
                    66, 
                    124, 
                    21
                ), 
                new Color(
                    66, 
                    124, 
                    22
                ), 
                new Color(
                    66, 
                    124, 
                    23
                ), 
                new Color(
                    66, 
                    125, 
                    17
                ), 
                new Color(
                    66, 
                    125, 
                    18
                ), 
                new Color(
                    66, 
                    125, 
                    19
                ), 
                new Color(
                    66, 
                    125, 
                    20
                ), 
                new Color(
                    66, 
                    125, 
                    21
                ), 
                new Color(
                    66, 
                    125, 
                    22
                ), 
                new Color(
                    66, 
                    125, 
                    23
                ), 
                new Color(
                    66, 
                    126, 
                    17
                ), 
                new Color(
                    66, 
                    126, 
                    18
                ), 
                new Color(
                    66, 
                    126, 
                    19
                ), 
                new Color(
                    66, 
                    126, 
                    20
                ), 
                new Color(
                    66, 
                    126, 
                    21
                ), 
                new Color(
                    66, 
                    126, 
                    22
                ), 
                new Color(
                    66, 
                    126, 
                    23
                ), 
                new Color(
                    66, 
                    127, 
                    17
                ), 
                new Color(
                    66, 
                    127, 
                    18
                ), 
                new Color(
                    66, 
                    127, 
                    19
                ), 
                new Color(
                    66, 
                    127, 
                    20
                ), 
                new Color(
                    66, 
                    127, 
                    21
                ), 
                new Color(
                    66, 
                    127, 
                    22
                ), 
                new Color(
                    66, 
                    127, 
                    23
                ), 
                new Color(
                    66, 
                    128, 
                    17
                ), 
                new Color(
                    66, 
                    128, 
                    18
                ), 
                new Color(
                    66, 
                    128, 
                    19
                ), 
                new Color(
                    66, 
                    128, 
                    20
                ), 
                new Color(
                    66, 
                    128, 
                    21
                ), 
                new Color(
                    66, 
                    128, 
                    22
                ), 
                new Color(
                    66, 
                    128, 
                    23
                ), 
                new Color(
                    66, 
                    129, 
                    17
                ), 
                new Color(
                    66, 
                    129, 
                    18
                ), 
                new Color(
                    66, 
                    129, 
                    19
                ), 
                new Color(
                    66, 
                    129, 
                    20
                ), 
                new Color(
                    66, 
                    129, 
                    21
                ), 
                new Color(
                    66, 
                    129, 
                    22
                ), 
                new Color(
                    66, 
                    129, 
                    23
                ), 
                new Color(
                    66, 
                    130, 
                    17
                ), 
                new Color(
                    66, 
                    130, 
                    18
                ), 
                new Color(
                    66, 
                    130, 
                    19
                ), 
                new Color(
                    66, 
                    130, 
                    20
                ), 
                new Color(
                    66, 
                    130, 
                    21
                ), 
                new Color(
                    66, 
                    130, 
                    22
                ), 
                new Color(
                    66, 
                    130, 
                    23
                ), 
                new Color(
                    66, 
                    131, 
                    17
                ), 
                new Color(
                    66, 
                    131, 
                    18
                ), 
                new Color(
                    66, 
                    131, 
                    19
                ), 
                new Color(
                    66, 
                    131, 
                    20
                ), 
                new Color(
                    66, 
                    131, 
                    21
                ), 
                new Color(
                    66, 
                    131, 
                    22
                ), 
                new Color(
                    66, 
                    131, 
                    23
                ), 
                new Color(
                    66, 
                    132, 
                    17
                ), 
                new Color(
                    66, 
                    132, 
                    18
                ), 
                new Color(
                    66, 
                    132, 
                    19
                ), 
                new Color(
                    66, 
                    132, 
                    20
                ), 
                new Color(
                    66, 
                    132, 
                    21
                ), 
                new Color(
                    66, 
                    132, 
                    22
                ), 
                new Color(
                    66, 
                    132, 
                    23
                ), 
                new Color(
                    66, 
                    133, 
                    17
                ), 
                new Color(
                    66, 
                    133, 
                    18
                ), 
                new Color(
                    66, 
                    133, 
                    19
                ), 
                new Color(
                    66, 
                    133, 
                    20
                ), 
                new Color(
                    66, 
                    133, 
                    21
                ), 
                new Color(
                    66, 
                    133, 
                    22
                ), 
                new Color(
                    66, 
                    133, 
                    23
                ), 
                new Color(
                    66, 
                    134, 
                    17
                ), 
                new Color(
                    66, 
                    134, 
                    18
                ), 
                new Color(
                    66, 
                    134, 
                    19
                ), 
                new Color(
                    66, 
                    134, 
                    20
                ), 
                new Color(
                    66, 
                    134, 
                    21
                ), 
                new Color(
                    66, 
                    134, 
                    22
                ), 
                new Color(
                    66, 
                    134, 
                    23
                ), 
                new Color(
                    66, 
                    135, 
                    17
                ), 
                new Color(
                    66, 
                    135, 
                    18
                ), 
                new Color(
                    66, 
                    135, 
                    19
                ), 
                new Color(
                    66, 
                    135, 
                    20
                ), 
                new Color(
                    66, 
                    135, 
                    21
                ), 
                new Color(
                    66, 
                    135, 
                    22
                ), 
                new Color(
                    66, 
                    135, 
                    23
                ), 
                new Color(
                    66, 
                    136, 
                    17
                ), 
                new Color(
                    66, 
                    136, 
                    18
                ), 
                new Color(
                    66, 
                    136, 
                    19
                ), 
                new Color(
                    66, 
                    136, 
                    20
                ), 
                new Color(
                    66, 
                    136, 
                    21
                ), 
                new Color(
                    66, 
                    136, 
                    22
                ), 
                new Color(
                    66, 
                    136, 
                    23
                ), 
                new Color(
                    66, 
                    137, 
                    17
                ), 
                new Color(
                    66, 
                    137, 
                    18
                ), 
                new Color(
                    66, 
                    137, 
                    19
                ), 
                new Color(
                    66, 
                    137, 
                    20
                ), 
                new Color(
                    66, 
                    137, 
                    21
                ), 
                new Color(
                    66, 
                    137, 
                    22
                ), 
                new Color(
                    66, 
                    137, 
                    23
                ), 
                new Color(
                    66, 
                    138, 
                    17
                ), 
                new Color(
                    66, 
                    138, 
                    18
                ), 
                new Color(
                    66, 
                    138, 
                    19
                ), 
                new Color(
                    66, 
                    138, 
                    20
                ), 
                new Color(
                    66, 
                    138, 
                    21
                ), 
                new Color(
                    66, 
                    138, 
                    22
                ), 
                new Color(
                    66, 
                    138, 
                    23
                ), 
                new Color(
                    66, 
                    139, 
                    17
                ), 
                new Color(
                    66, 
                    139, 
                    18
                ), 
                new Color(
                    66, 
                    139, 
                    19
                ), 
                new Color(
                    66, 
                    139, 
                    20
                ), 
                new Color(
                    66, 
                    139, 
                    21
                ), 
                new Color(
                    66, 
                    139, 
                    22
                ), 
                new Color(
                    66, 
                    139, 
                    23
                ), 
                new Color(
                    66, 
                    140, 
                    17
                ), 
                new Color(
                    66, 
                    140, 
                    18
                ), 
                new Color(
                    66, 
                    140, 
                    19
                ), 
                new Color(
                    66, 
                    140, 
                    20
                ), 
                new Color(
                    66, 
                    140, 
                    21
                ), 
                new Color(
                    66, 
                    140, 
                    22
                ), 
                new Color(
                    66, 
                    140, 
                    23
                ), 
                new Color(
                    66, 
                    141, 
                    17
                ), 
                new Color(
                    66, 
                    141, 
                    18
                ), 
                new Color(
                    66, 
                    141, 
                    19
                ), 
                new Color(
                    66, 
                    141, 
                    20
                ), 
                new Color(
                    66, 
                    141, 
                    21
                ), 
                new Color(
                    66, 
                    141, 
                    22
                ), 
                new Color(
                    66, 
                    141, 
                    23
                ), 
                new Color(
                    66, 
                    142, 
                    17
                ), 
                new Color(
                    66, 
                    142, 
                    18
                ), 
                new Color(
                    66, 
                    142, 
                    19
                ), 
                new Color(
                    66, 
                    142, 
                    20
                ), 
                new Color(
                    66, 
                    142, 
                    21
                ), 
                new Color(
                    66, 
                    142, 
                    22
                ), 
                new Color(
                    66, 
                    142, 
                    23
                ), 
                new Color(
                    66, 
                    143, 
                    17
                ), 
                new Color(
                    66, 
                    143, 
                    18
                ), 
                new Color(
                    66, 
                    143, 
                    19
                ), 
                new Color(
                    66, 
                    143, 
                    20
                ), 
                new Color(
                    66, 
                    143, 
                    21
                ), 
                new Color(
                    66, 
                    143, 
                    22
                ), 
                new Color(
                    66, 
                    143, 
                    23
                ), 
                new Color(
                    66, 
                    144, 
                    17
                ), 
                new Color(
                    66, 
                    144, 
                    18
                ), 
                new Color(
                    66, 
                    144, 
                    19
                ), 
                new Color(
                    66, 
                    144, 
                    20
                ), 
                new Color(
                    66, 
                    144, 
                    21
                ), 
                new Color(
                    66, 
                    144, 
                    22
                ), 
                new Color(
                    66, 
                    144, 
                    23
                ), 
                new Color(
                    66, 
                    145, 
                    17
                ), 
                new Color(
                    66, 
                    145, 
                    18
                ), 
                new Color(
                    66, 
                    145, 
                    19
                ), 
                new Color(
                    66, 
                    145, 
                    20
                ), 
                new Color(
                    66, 
                    145, 
                    21
                ), 
                new Color(
                    66, 
                    145, 
                    22
                ), 
                new Color(
                    66, 
                    145, 
                    23
                ), 
                new Color(
                    66, 
                    146, 
                    17
                ), 
                new Color(
                    66, 
                    146, 
                    18
                ), 
                new Color(
                    66, 
                    146, 
                    19
                ), 
                new Color(
                    66, 
                    146, 
                    20
                ), 
                new Color(
                    66, 
                    146, 
                    21
                ), 
                new Color(
                    66, 
                    146, 
                    22
                ), 
                new Color(
                    66, 
                    146, 
                    23
                ), 
                new Color(
                    66, 
                    147, 
                    17
                ), 
                new Color(
                    66, 
                    147, 
                    18
                ), 
                new Color(
                    66, 
                    147, 
                    19
                ), 
                new Color(
                    66, 
                    147, 
                    20
                ), 
                new Color(
                    66, 
                    147, 
                    21
                ), 
                new Color(
                    66, 
                    147, 
                    22
                ), 
                new Color(
                    66, 
                    147, 
                    23
                ), 
                new Color(
                    66, 
                    148, 
                    17
                ), 
                new Color(
                    66, 
                    148, 
                    18
                ), 
                new Color(
                    66, 
                    148, 
                    19
                ), 
                new Color(
                    66, 
                    148, 
                    20
                ), 
                new Color(
                    66, 
                    148, 
                    21
                ), 
                new Color(
                    66, 
                    148, 
                    22
                ), 
                new Color(
                    66, 
                    148, 
                    23
                ), 
                new Color(
                    66, 
                    149, 
                    17
                ), 
                new Color(
                    66, 
                    149, 
                    18
                ), 
                new Color(
                    66, 
                    149, 
                    19
                ), 
                new Color(
                    66, 
                    149, 
                    20
                ), 
                new Color(
                    66, 
                    149, 
                    21
                ), 
                new Color(
                    66, 
                    149, 
                    22
                ), 
                new Color(
                    66, 
                    149, 
                    23
                ), 
                new Color(
                    66, 
                    150, 
                    17
                ), 
                new Color(
                    66, 
                    150, 
                    18
                ), 
                new Color(
                    66, 
                    150, 
                    19
                ), 
                new Color(
                    66, 
                    150, 
                    20
                ), 
                new Color(
                    66, 
                    150, 
                    21
                ), 
                new Color(
                    66, 
                    150, 
                    22
                ), 
                new Color(
                    66, 
                    150, 
                    23
                ), 
                new Color(
                    66, 
                    151, 
                    17
                ), 
                new Color(
                    66, 
                    151, 
                    18
                ), 
                new Color(
                    66, 
                    151, 
                    19
                ), 
                new Color(
                    66, 
                    151, 
                    20
                ), 
                new Color(
                    66, 
                    151, 
                    21
                ), 
                new Color(
                    66, 
                    151, 
                    22
                ), 
                new Color(
                    66, 
                    151, 
                    23
                ), 
                new Color(
                    66, 
                    152, 
                    17
                ), 
                new Color(
                    66, 
                    152, 
                    18
                ), 
                new Color(
                    66, 
                    152, 
                    19
                ), 
                new Color(
                    66, 
                    152, 
                    20
                ), 
                new Color(
                    66, 
                    152, 
                    21
                ), 
                new Color(
                    66, 
                    152, 
                    22
                ), 
                new Color(
                    66, 
                    152, 
                    23
                ), 
                new Color(
                    66, 
                    153, 
                    17
                ), 
                new Color(
                    66, 
                    153, 
                    18
                ), 
                new Color(
                    66, 
                    153, 
                    19
                ), 
                new Color(
                    66, 
                    153, 
                    20
                ), 
                new Color(
                    66, 
                    153, 
                    21
                ), 
                new Color(
                    66, 
                    153, 
                    22
                ), 
                new Color(
                    66, 
                    153, 
                    23
                ), 
                new Color(
                    66, 
                    154, 
                    17
                ), 
                new Color(
                    66, 
                    154, 
                    18
                ), 
                new Color(
                    66, 
                    154, 
                    19
                ), 
                new Color(
                    66, 
                    154, 
                    20
                ), 
                new Color(
                    66, 
                    154, 
                    21
                ), 
                new Color(
                    66, 
                    154, 
                    22
                ), 
                new Color(
                    66, 
                    154, 
                    23
                ), 
                new Color(
                    67, 
                    118, 
                    17
                ), 
                new Color(
                    67, 
                    118, 
                    18
                ), 
                new Color(
                    67, 
                    118, 
                    19
                ), 
                new Color(
                    67, 
                    118, 
                    20
                ), 
                new Color(
                    67, 
                    118, 
                    21
                ), 
                new Color(
                    67, 
                    118, 
                    22
                ), 
                new Color(
                    67, 
                    118, 
                    23
                ), 
                new Color(
                    67, 
                    119, 
                    17
                ), 
                new Color(
                    67, 
                    119, 
                    18
                ), 
                new Color(
                    67, 
                    119, 
                    19
                ), 
                new Color(
                    67, 
                    119, 
                    20
                ), 
                new Color(
                    67, 
                    119, 
                    21
                ), 
                new Color(
                    67, 
                    119, 
                    22
                ), 
                new Color(
                    67, 
                    119, 
                    23
                ), 
                new Color(
                    67, 
                    120, 
                    17
                ), 
                new Color(
                    67, 
                    120, 
                    18
                ), 
                new Color(
                    67, 
                    120, 
                    19
                ), 
                new Color(
                    67, 
                    120, 
                    20
                ), 
                new Color(
                    67, 
                    120, 
                    21
                ), 
                new Color(
                    67, 
                    120, 
                    22
                ), 
                new Color(
                    67, 
                    120, 
                    23
                ), 
                new Color(
                    67, 
                    121, 
                    17
                ), 
                new Color(
                    67, 
                    121, 
                    18
                ), 
                new Color(
                    67, 
                    121, 
                    19
                ), 
                new Color(
                    67, 
                    121, 
                    20
                ), 
                new Color(
                    67, 
                    121, 
                    21
                ), 
                new Color(
                    67, 
                    121, 
                    22
                ), 
                new Color(
                    67, 
                    121, 
                    23
                ), 
                new Color(
                    67, 
                    122, 
                    17
                ), 
                new Color(
                    67, 
                    122, 
                    18
                ), 
                new Color(
                    67, 
                    122, 
                    19
                ), 
                new Color(
                    67, 
                    122, 
                    20
                ), 
                new Color(
                    67, 
                    122, 
                    21
                ), 
                new Color(
                    67, 
                    122, 
                    22
                ), 
                new Color(
                    67, 
                    122, 
                    23
                ), 
                new Color(
                    67, 
                    123, 
                    17
                ), 
                new Color(
                    67, 
                    123, 
                    18
                ), 
                new Color(
                    67, 
                    123, 
                    19
                ), 
                new Color(
                    67, 
                    123, 
                    20
                ), 
                new Color(
                    67, 
                    123, 
                    21
                ), 
                new Color(
                    67, 
                    123, 
                    22
                ), 
                new Color(
                    67, 
                    123, 
                    23
                ), 
                new Color(
                    67, 
                    124, 
                    17
                ), 
                new Color(
                    67, 
                    124, 
                    18
                ), 
                new Color(
                    67, 
                    124, 
                    19
                ), 
                new Color(
                    67, 
                    124, 
                    20
                ), 
                new Color(
                    67, 
                    124, 
                    21
                ), 
                new Color(
                    67, 
                    124, 
                    22
                ), 
                new Color(
                    67, 
                    124, 
                    23
                ), 
                new Color(
                    67, 
                    125, 
                    17
                ), 
                new Color(
                    67, 
                    125, 
                    18
                ), 
                new Color(
                    67, 
                    125, 
                    19
                ), 
                new Color(
                    67, 
                    125, 
                    20
                ), 
                new Color(
                    67, 
                    125, 
                    21
                ), 
                new Color(
                    67, 
                    125, 
                    22
                ), 
                new Color(
                    67, 
                    125, 
                    23
                ), 
                new Color(
                    67, 
                    126, 
                    17
                ), 
                new Color(
                    67, 
                    126, 
                    18
                ), 
                new Color(
                    67, 
                    126, 
                    19
                ), 
                new Color(
                    67, 
                    126, 
                    20
                ), 
                new Color(
                    67, 
                    126, 
                    21
                ), 
                new Color(
                    67, 
                    126, 
                    22
                ), 
                new Color(
                    67, 
                    126, 
                    23
                ), 
                new Color(
                    67, 
                    127, 
                    17
                ), 
                new Color(
                    67, 
                    127, 
                    18
                ), 
                new Color(
                    67, 
                    127, 
                    19
                ), 
                new Color(
                    67, 
                    127, 
                    20
                ), 
                new Color(
                    67, 
                    127, 
                    21
                ), 
                new Color(
                    67, 
                    127, 
                    22
                ), 
                new Color(
                    67, 
                    127, 
                    23
                ), 
                new Color(
                    67, 
                    128, 
                    17
                ), 
                new Color(
                    67, 
                    128, 
                    18
                ), 
                new Color(
                    67, 
                    128, 
                    19
                ), 
                new Color(
                    67, 
                    128, 
                    20
                ), 
                new Color(
                    67, 
                    128, 
                    21
                ), 
                new Color(
                    67, 
                    128, 
                    22
                ), 
                new Color(
                    67, 
                    128, 
                    23
                ), 
                new Color(
                    67, 
                    129, 
                    17
                ), 
                new Color(
                    67, 
                    129, 
                    18
                ), 
                new Color(
                    67, 
                    129, 
                    19
                ), 
                new Color(
                    67, 
                    129, 
                    20
                ), 
                new Color(
                    67, 
                    129, 
                    21
                ), 
                new Color(
                    67, 
                    129, 
                    22
                ), 
                new Color(
                    67, 
                    129, 
                    23
                ), 
                new Color(
                    67, 
                    130, 
                    17
                ), 
                new Color(
                    67, 
                    130, 
                    18
                ), 
                new Color(
                    67, 
                    130, 
                    19
                ), 
                new Color(
                    67, 
                    130, 
                    20
                ), 
                new Color(
                    67, 
                    130, 
                    21
                ), 
                new Color(
                    67, 
                    130, 
                    22
                ), 
                new Color(
                    67, 
                    130, 
                    23
                ), 
                new Color(
                    67, 
                    131, 
                    17
                ), 
                new Color(
                    67, 
                    131, 
                    18
                ), 
                new Color(
                    67, 
                    131, 
                    19
                ), 
                new Color(
                    67, 
                    131, 
                    20
                ), 
                new Color(
                    67, 
                    131, 
                    21
                ), 
                new Color(
                    67, 
                    131, 
                    22
                ), 
                new Color(
                    67, 
                    131, 
                    23
                ), 
                new Color(
                    67, 
                    132, 
                    17
                ), 
                new Color(
                    67, 
                    132, 
                    18
                ), 
                new Color(
                    67, 
                    132, 
                    19
                ), 
                new Color(
                    67, 
                    132, 
                    20
                ), 
                new Color(
                    67, 
                    132, 
                    21
                ), 
                new Color(
                    67, 
                    132, 
                    22
                ), 
                new Color(
                    67, 
                    132, 
                    23
                ), 
                new Color(
                    67, 
                    133, 
                    17
                ), 
                new Color(
                    67, 
                    133, 
                    18
                ), 
                new Color(
                    67, 
                    133, 
                    19
                ), 
                new Color(
                    67, 
                    133, 
                    20
                ), 
                new Color(
                    67, 
                    133, 
                    21
                ), 
                new Color(
                    67, 
                    133, 
                    22
                ), 
                new Color(
                    67, 
                    133, 
                    23
                ), 
                new Color(
                    67, 
                    134, 
                    17
                ), 
                new Color(
                    67, 
                    134, 
                    18
                ), 
                new Color(
                    67, 
                    134, 
                    19
                ), 
                new Color(
                    67, 
                    134, 
                    20
                ), 
                new Color(
                    67, 
                    134, 
                    21
                ), 
                new Color(
                    67, 
                    134, 
                    22
                ), 
                new Color(
                    67, 
                    134, 
                    23
                ), 
                new Color(
                    67, 
                    135, 
                    17
                ), 
                new Color(
                    67, 
                    135, 
                    18
                ), 
                new Color(
                    67, 
                    135, 
                    19
                ), 
                new Color(
                    67, 
                    135, 
                    20
                ), 
                new Color(
                    67, 
                    135, 
                    21
                ), 
                new Color(
                    67, 
                    135, 
                    22
                ), 
                new Color(
                    67, 
                    135, 
                    23
                ), 
                new Color(
                    67, 
                    136, 
                    17
                ), 
                new Color(
                    67, 
                    136, 
                    18
                ), 
                new Color(
                    67, 
                    136, 
                    19
                ), 
                new Color(
                    67, 
                    136, 
                    20
                ), 
                new Color(
                    67, 
                    136, 
                    21
                ), 
                new Color(
                    67, 
                    136, 
                    22
                ), 
                new Color(
                    67, 
                    136, 
                    23
                ), 
                new Color(
                    67, 
                    137, 
                    17
                ), 
                new Color(
                    67, 
                    137, 
                    18
                ), 
                new Color(
                    67, 
                    137, 
                    19
                ), 
                new Color(
                    67, 
                    137, 
                    20
                ), 
                new Color(
                    67, 
                    137, 
                    21
                ), 
                new Color(
                    67, 
                    137, 
                    22
                ), 
                new Color(
                    67, 
                    137, 
                    23
                ), 
                new Color(
                    67, 
                    138, 
                    17
                ), 
                new Color(
                    67, 
                    138, 
                    18
                ), 
                new Color(
                    67, 
                    138, 
                    19
                ), 
                new Color(
                    67, 
                    138, 
                    20
                ), 
                new Color(
                    67, 
                    138, 
                    21
                ), 
                new Color(
                    67, 
                    138, 
                    22
                ), 
                new Color(
                    67, 
                    138, 
                    23
                ), 
                new Color(
                    67, 
                    139, 
                    17
                ), 
                new Color(
                    67, 
                    139, 
                    18
                ), 
                new Color(
                    67, 
                    139, 
                    19
                ), 
                new Color(
                    67, 
                    139, 
                    20
                ), 
                new Color(
                    67, 
                    139, 
                    21
                ), 
                new Color(
                    67, 
                    139, 
                    22
                ), 
                new Color(
                    67, 
                    139, 
                    23
                ), 
                new Color(
                    67, 
                    140, 
                    17
                ), 
                new Color(
                    67, 
                    140, 
                    18
                ), 
                new Color(
                    67, 
                    140, 
                    19
                ), 
                new Color(
                    67, 
                    140, 
                    20
                ), 
                new Color(
                    67, 
                    140, 
                    21
                ), 
                new Color(
                    67, 
                    140, 
                    22
                ), 
                new Color(
                    67, 
                    140, 
                    23
                ), 
                new Color(
                    67, 
                    141, 
                    17
                ), 
                new Color(
                    67, 
                    141, 
                    18
                ), 
                new Color(
                    67, 
                    141, 
                    19
                ), 
                new Color(
                    67, 
                    141, 
                    20
                ), 
                new Color(
                    67, 
                    141, 
                    21
                ), 
                new Color(
                    67, 
                    141, 
                    22
                ), 
                new Color(
                    67, 
                    141, 
                    23
                ), 
                new Color(
                    67, 
                    142, 
                    17
                ), 
                new Color(
                    67, 
                    142, 
                    18
                ), 
                new Color(
                    67, 
                    142, 
                    19
                ), 
                new Color(
                    67, 
                    142, 
                    20
                ), 
                new Color(
                    67, 
                    142, 
                    21
                ), 
                new Color(
                    67, 
                    142, 
                    22
                ), 
                new Color(
                    67, 
                    142, 
                    23
                ), 
                new Color(
                    67, 
                    143, 
                    17
                ), 
                new Color(
                    67, 
                    143, 
                    18
                ), 
                new Color(
                    67, 
                    143, 
                    19
                ), 
                new Color(
                    67, 
                    143, 
                    20
                ), 
                new Color(
                    67, 
                    143, 
                    21
                ), 
                new Color(
                    67, 
                    143, 
                    22
                ), 
                new Color(
                    67, 
                    143, 
                    23
                ), 
                new Color(
                    67, 
                    144, 
                    17
                ), 
                new Color(
                    67, 
                    144, 
                    18
                ), 
                new Color(
                    67, 
                    144, 
                    19
                ), 
                new Color(
                    67, 
                    144, 
                    20
                ), 
                new Color(
                    67, 
                    144, 
                    21
                ), 
                new Color(
                    67, 
                    144, 
                    22
                ), 
                new Color(
                    67, 
                    144, 
                    23
                ), 
                new Color(
                    67, 
                    145, 
                    17
                ), 
                new Color(
                    67, 
                    145, 
                    18
                ), 
                new Color(
                    67, 
                    145, 
                    19
                ), 
                new Color(
                    67, 
                    145, 
                    20
                ), 
                new Color(
                    67, 
                    145, 
                    21
                ), 
                new Color(
                    67, 
                    145, 
                    22
                ), 
                new Color(
                    67, 
                    145, 
                    23
                ), 
                new Color(
                    67, 
                    146, 
                    17
                ), 
                new Color(
                    67, 
                    146, 
                    18
                ), 
                new Color(
                    67, 
                    146, 
                    19
                ), 
                new Color(
                    67, 
                    146, 
                    20
                ), 
                new Color(
                    67, 
                    146, 
                    21
                ), 
                new Color(
                    67, 
                    146, 
                    22
                ), 
                new Color(
                    67, 
                    146, 
                    23
                ), 
                new Color(
                    67, 
                    147, 
                    17
                ), 
                new Color(
                    67, 
                    147, 
                    18
                ), 
                new Color(
                    67, 
                    147, 
                    19
                ), 
                new Color(
                    67, 
                    147, 
                    20
                ), 
                new Color(
                    67, 
                    147, 
                    21
                ), 
                new Color(
                    67, 
                    147, 
                    22
                ), 
                new Color(
                    67, 
                    147, 
                    23
                ), 
                new Color(
                    67, 
                    148, 
                    17
                ), 
                new Color(
                    67, 
                    148, 
                    18
                ), 
                new Color(
                    67, 
                    148, 
                    19
                ), 
                new Color(
                    67, 
                    148, 
                    20
                ), 
                new Color(
                    67, 
                    148, 
                    21
                ), 
                new Color(
                    67, 
                    148, 
                    22
                ), 
                new Color(
                    67, 
                    148, 
                    23
                ), 
                new Color(
                    67, 
                    149, 
                    17
                ), 
                new Color(
                    67, 
                    149, 
                    18
                ), 
                new Color(
                    67, 
                    149, 
                    19
                ), 
                new Color(
                    67, 
                    149, 
                    20
                ), 
                new Color(
                    67, 
                    149, 
                    21
                ), 
                new Color(
                    67, 
                    149, 
                    22
                ), 
                new Color(
                    67, 
                    149, 
                    23
                ), 
                new Color(
                    67, 
                    150, 
                    17
                ), 
                new Color(
                    67, 
                    150, 
                    18
                ), 
                new Color(
                    67, 
                    150, 
                    19
                ), 
                new Color(
                    67, 
                    150, 
                    20
                ), 
                new Color(
                    67, 
                    150, 
                    21
                ), 
                new Color(
                    67, 
                    150, 
                    22
                ), 
                new Color(
                    67, 
                    150, 
                    23
                ), 
                new Color(
                    67, 
                    151, 
                    17
                ), 
                new Color(
                    67, 
                    151, 
                    18
                ), 
                new Color(
                    67, 
                    151, 
                    19
                ), 
                new Color(
                    67, 
                    151, 
                    20
                ), 
                new Color(
                    67, 
                    151, 
                    21
                ), 
                new Color(
                    67, 
                    151, 
                    22
                ), 
                new Color(
                    67, 
                    151, 
                    23
                ), 
                new Color(
                    67, 
                    152, 
                    17
                ), 
                new Color(
                    67, 
                    152, 
                    18
                ), 
                new Color(
                    67, 
                    152, 
                    19
                ), 
                new Color(
                    67, 
                    152, 
                    20
                ), 
                new Color(
                    67, 
                    152, 
                    21
                ), 
                new Color(
                    67, 
                    152, 
                    22
                ), 
                new Color(
                    67, 
                    152, 
                    23
                ), 
                new Color(
                    67, 
                    153, 
                    17
                ), 
                new Color(
                    67, 
                    153, 
                    18
                ), 
                new Color(
                    67, 
                    153, 
                    19
                ), 
                new Color(
                    67, 
                    153, 
                    20
                ), 
                new Color(
                    67, 
                    153, 
                    21
                ), 
                new Color(
                    67, 
                    153, 
                    22
                ), 
                new Color(
                    67, 
                    153, 
                    23
                ), 
                new Color(
                    67, 
                    154, 
                    17
                ), 
                new Color(
                    67, 
                    154, 
                    18
                ), 
                new Color(
                    67, 
                    154, 
                    19
                ), 
                new Color(
                    67, 
                    154, 
                    20
                ), 
                new Color(
                    67, 
                    154, 
                    21
                ), 
                new Color(
                    67, 
                    154, 
                    22
                ), 
                new Color(
                    67, 
                    154, 
                    23
                ), 
                new Color(
                    68, 
                    118, 
                    17
                ), 
                new Color(
                    68, 
                    118, 
                    18
                ), 
                new Color(
                    68, 
                    118, 
                    19
                ), 
                new Color(
                    68, 
                    118, 
                    20
                ), 
                new Color(
                    68, 
                    118, 
                    21
                ), 
                new Color(
                    68, 
                    118, 
                    22
                ), 
                new Color(
                    68, 
                    118, 
                    23
                ), 
                new Color(
                    68, 
                    119, 
                    17
                ), 
                new Color(
                    68, 
                    119, 
                    18
                ), 
                new Color(
                    68, 
                    119, 
                    19
                ), 
                new Color(
                    68, 
                    119, 
                    20
                ), 
                new Color(
                    68, 
                    119, 
                    21
                ), 
                new Color(
                    68, 
                    119, 
                    22
                ), 
                new Color(
                    68, 
                    119, 
                    23
                ), 
                new Color(
                    68, 
                    120, 
                    17
                ), 
                new Color(
                    68, 
                    120, 
                    18
                ), 
                new Color(
                    68, 
                    120, 
                    19
                ), 
                new Color(
                    68, 
                    120, 
                    20
                ), 
                new Color(
                    68, 
                    120, 
                    21
                ), 
                new Color(
                    68, 
                    120, 
                    22
                ), 
                new Color(
                    68, 
                    120, 
                    23
                ), 
                new Color(
                    68, 
                    121, 
                    17
                ), 
                new Color(
                    68, 
                    121, 
                    18
                ), 
                new Color(
                    68, 
                    121, 
                    19
                ), 
                new Color(
                    68, 
                    121, 
                    20
                ), 
                new Color(
                    68, 
                    121, 
                    21
                ), 
                new Color(
                    68, 
                    121, 
                    22
                ), 
                new Color(
                    68, 
                    121, 
                    23
                ), 
                new Color(
                    68, 
                    122, 
                    17
                ), 
                new Color(
                    68, 
                    122, 
                    18
                ), 
                new Color(
                    68, 
                    122, 
                    19
                ), 
                new Color(
                    68, 
                    122, 
                    20
                ), 
                new Color(
                    68, 
                    122, 
                    21
                ), 
                new Color(
                    68, 
                    122, 
                    22
                ), 
                new Color(
                    68, 
                    122, 
                    23
                ), 
                new Color(
                    68, 
                    123, 
                    17
                ), 
                new Color(
                    68, 
                    123, 
                    18
                ), 
                new Color(
                    68, 
                    123, 
                    19
                ), 
                new Color(
                    68, 
                    123, 
                    20
                ), 
                new Color(
                    68, 
                    123, 
                    21
                ), 
                new Color(
                    68, 
                    123, 
                    22
                ), 
                new Color(
                    68, 
                    123, 
                    23
                ), 
                new Color(
                    68, 
                    124, 
                    17
                ), 
                new Color(
                    68, 
                    124, 
                    18
                ), 
                new Color(
                    68, 
                    124, 
                    19
                ), 
                new Color(
                    68, 
                    124, 
                    20
                ), 
                new Color(
                    68, 
                    124, 
                    21
                ), 
                new Color(
                    68, 
                    124, 
                    22
                ), 
                new Color(
                    68, 
                    124, 
                    23
                ), 
                new Color(
                    68, 
                    125, 
                    17
                ), 
                new Color(
                    68, 
                    125, 
                    18
                ), 
                new Color(
                    68, 
                    125, 
                    19
                ), 
                new Color(
                    68, 
                    125, 
                    20
                ), 
                new Color(
                    68, 
                    125, 
                    21
                ), 
                new Color(
                    68, 
                    125, 
                    22
                ), 
                new Color(
                    68, 
                    125, 
                    23
                ), 
                new Color(
                    68, 
                    126, 
                    17
                ), 
                new Color(
                    68, 
                    126, 
                    18
                ), 
                new Color(
                    68, 
                    126, 
                    19
                ), 
                new Color(
                    68, 
                    126, 
                    20
                ), 
                new Color(
                    68, 
                    126, 
                    21
                ), 
                new Color(
                    68, 
                    126, 
                    22
                ), 
                new Color(
                    68, 
                    126, 
                    23
                ), 
                new Color(
                    68, 
                    127, 
                    17
                ), 
                new Color(
                    68, 
                    127, 
                    18
                ), 
                new Color(
                    68, 
                    127, 
                    19
                ), 
                new Color(
                    68, 
                    127, 
                    20
                ), 
                new Color(
                    68, 
                    127, 
                    21
                ), 
                new Color(
                    68, 
                    127, 
                    22
                ), 
                new Color(
                    68, 
                    127, 
                    23
                ), 
                new Color(
                    68, 
                    128, 
                    17
                ), 
                new Color(
                    68, 
                    128, 
                    18
                ), 
                new Color(
                    68, 
                    128, 
                    19
                ), 
                new Color(
                    68, 
                    128, 
                    20
                ), 
                new Color(
                    68, 
                    128, 
                    21
                ), 
                new Color(
                    68, 
                    128, 
                    22
                ), 
                new Color(
                    68, 
                    128, 
                    23
                ), 
                new Color(
                    68, 
                    129, 
                    17
                ), 
                new Color(
                    68, 
                    129, 
                    18
                ), 
                new Color(
                    68, 
                    129, 
                    19
                ), 
                new Color(
                    68, 
                    129, 
                    20
                ), 
                new Color(
                    68, 
                    129, 
                    21
                ), 
                new Color(
                    68, 
                    129, 
                    22
                ), 
                new Color(
                    68, 
                    129, 
                    23
                ), 
                new Color(
                    68, 
                    130, 
                    17
                ), 
                new Color(
                    68, 
                    130, 
                    18
                ), 
                new Color(
                    68, 
                    130, 
                    19
                ), 
                new Color(
                    68, 
                    130, 
                    20
                ), 
                new Color(
                    68, 
                    130, 
                    21
                ), 
                new Color(
                    68, 
                    130, 
                    22
                ), 
                new Color(
                    68, 
                    130, 
                    23
                ), 
                new Color(
                    68, 
                    131, 
                    17
                ), 
                new Color(
                    68, 
                    131, 
                    18
                ), 
                new Color(
                    68, 
                    131, 
                    19
                ), 
                new Color(
                    68, 
                    131, 
                    20
                ), 
                new Color(
                    68, 
                    131, 
                    21
                ), 
                new Color(
                    68, 
                    131, 
                    22
                ), 
                new Color(
                    68, 
                    131, 
                    23
                ), 
                new Color(
                    68, 
                    132, 
                    17
                ), 
                new Color(
                    68, 
                    132, 
                    18
                ), 
                new Color(
                    68, 
                    132, 
                    19
                ), 
                new Color(
                    68, 
                    132, 
                    20
                ), 
                new Color(
                    68, 
                    132, 
                    21
                ), 
                new Color(
                    68, 
                    132, 
                    22
                ), 
                new Color(
                    68, 
                    132, 
                    23
                ), 
                new Color(
                    68, 
                    133, 
                    17
                ), 
                new Color(
                    68, 
                    133, 
                    18
                ), 
                new Color(
                    68, 
                    133, 
                    19
                ), 
                new Color(
                    68, 
                    133, 
                    20
                ), 
                new Color(
                    68, 
                    133, 
                    21
                ), 
                new Color(
                    68, 
                    133, 
                    22
                ), 
                new Color(
                    68, 
                    133, 
                    23
                ), 
                new Color(
                    68, 
                    134, 
                    17
                ), 
                new Color(
                    68, 
                    134, 
                    18
                ), 
                new Color(
                    68, 
                    134, 
                    19
                ), 
                new Color(
                    68, 
                    134, 
                    20
                ), 
                new Color(
                    68, 
                    134, 
                    21
                ), 
                new Color(
                    68, 
                    134, 
                    22
                ), 
                new Color(
                    68, 
                    134, 
                    23
                ), 
                new Color(
                    68, 
                    135, 
                    17
                ), 
                new Color(
                    68, 
                    135, 
                    18
                ), 
                new Color(
                    68, 
                    135, 
                    19
                ), 
                new Color(
                    68, 
                    135, 
                    20
                ), 
                new Color(
                    68, 
                    135, 
                    21
                ), 
                new Color(
                    68, 
                    135, 
                    22
                ), 
                new Color(
                    68, 
                    135, 
                    23
                ), 
                new Color(
                    68, 
                    136, 
                    17
                ), 
                new Color(
                    68, 
                    136, 
                    18
                ), 
                new Color(
                    68, 
                    136, 
                    19
                ), 
                new Color(
                    68, 
                    136, 
                    20
                ), 
                new Color(
                    68, 
                    136, 
                    21
                ), 
                new Color(
                    68, 
                    136, 
                    22
                ), 
                new Color(
                    68, 
                    136, 
                    23
                ), 
                new Color(
                    68, 
                    137, 
                    17
                ), 
                new Color(
                    68, 
                    137, 
                    18
                ), 
                new Color(
                    68, 
                    137, 
                    19
                ), 
                new Color(
                    68, 
                    137, 
                    20
                ), 
                new Color(
                    68, 
                    137, 
                    21
                ), 
                new Color(
                    68, 
                    137, 
                    22
                ), 
                new Color(
                    68, 
                    137, 
                    23
                ), 
                new Color(
                    68, 
                    138, 
                    17
                ), 
                new Color(
                    68, 
                    138, 
                    18
                ), 
                new Color(
                    68, 
                    138, 
                    19
                ), 
                new Color(
                    68, 
                    138, 
                    20
                ), 
                new Color(
                    68, 
                    138, 
                    21
                ), 
                new Color(
                    68, 
                    138, 
                    22
                ), 
                new Color(
                    68, 
                    138, 
                    23
                ), 
                new Color(
                    68, 
                    139, 
                    17
                ), 
                new Color(
                    68, 
                    139, 
                    18
                ), 
                new Color(
                    68, 
                    139, 
                    19
                ), 
                new Color(
                    68, 
                    139, 
                    20
                ), 
                new Color(
                    68, 
                    139, 
                    21
                ), 
                new Color(
                    68, 
                    139, 
                    22
                ), 
                new Color(
                    68, 
                    139, 
                    23
                ), 
                new Color(
                    68, 
                    140, 
                    17
                ), 
                new Color(
                    68, 
                    140, 
                    18
                ), 
                new Color(
                    68, 
                    140, 
                    19
                ), 
                new Color(
                    68, 
                    140, 
                    20
                ), 
                new Color(
                    68, 
                    140, 
                    21
                ), 
                new Color(
                    68, 
                    140, 
                    22
                ), 
                new Color(
                    68, 
                    140, 
                    23
                ), 
                new Color(
                    68, 
                    141, 
                    17
                ), 
                new Color(
                    68, 
                    141, 
                    18
                ), 
                new Color(
                    68, 
                    141, 
                    19
                ), 
                new Color(
                    68, 
                    141, 
                    20
                ), 
                new Color(
                    68, 
                    141, 
                    21
                ), 
                new Color(
                    68, 
                    141, 
                    22
                ), 
                new Color(
                    68, 
                    141, 
                    23
                ), 
                new Color(
                    68, 
                    142, 
                    17
                ), 
                new Color(
                    68, 
                    142, 
                    18
                ), 
                new Color(
                    68, 
                    142, 
                    19
                ), 
                new Color(
                    68, 
                    142, 
                    20
                ), 
                new Color(
                    68, 
                    142, 
                    21
                ), 
                new Color(
                    68, 
                    142, 
                    22
                ), 
                new Color(
                    68, 
                    142, 
                    23
                ), 
                new Color(
                    68, 
                    143, 
                    17
                ), 
                new Color(
                    68, 
                    143, 
                    18
                ), 
                new Color(
                    68, 
                    143, 
                    19
                ), 
                new Color(
                    68, 
                    143, 
                    20
                ), 
                new Color(
                    68, 
                    143, 
                    21
                ), 
                new Color(
                    68, 
                    143, 
                    22
                ), 
                new Color(
                    68, 
                    143, 
                    23
                ), 
                new Color(
                    68, 
                    144, 
                    17
                ), 
                new Color(
                    68, 
                    144, 
                    18
                ), 
                new Color(
                    68, 
                    144, 
                    19
                ), 
                new Color(
                    68, 
                    144, 
                    20
                ), 
                new Color(
                    68, 
                    144, 
                    21
                ), 
                new Color(
                    68, 
                    144, 
                    22
                ), 
                new Color(
                    68, 
                    144, 
                    23
                ), 
                new Color(
                    68, 
                    145, 
                    17
                ), 
                new Color(
                    68, 
                    145, 
                    18
                ), 
                new Color(
                    68, 
                    145, 
                    19
                ), 
                new Color(
                    68, 
                    145, 
                    20
                ), 
                new Color(
                    68, 
                    145, 
                    21
                ), 
                new Color(
                    68, 
                    145, 
                    22
                ), 
                new Color(
                    68, 
                    145, 
                    23
                ), 
                new Color(
                    68, 
                    146, 
                    17
                ), 
                new Color(
                    68, 
                    146, 
                    18
                ), 
                new Color(
                    68, 
                    146, 
                    19
                ), 
                new Color(
                    68, 
                    146, 
                    20
                ), 
                new Color(
                    68, 
                    146, 
                    21
                ), 
                new Color(
                    68, 
                    146, 
                    22
                ), 
                new Color(
                    68, 
                    146, 
                    23
                ), 
                new Color(
                    68, 
                    147, 
                    17
                ), 
                new Color(
                    68, 
                    147, 
                    18
                ), 
                new Color(
                    68, 
                    147, 
                    19
                ), 
                new Color(
                    68, 
                    147, 
                    20
                ), 
                new Color(
                    68, 
                    147, 
                    21
                ), 
                new Color(
                    68, 
                    147, 
                    22
                ), 
                new Color(
                    68, 
                    147, 
                    23
                ), 
                new Color(
                    68, 
                    148, 
                    17
                ), 
                new Color(
                    68, 
                    148, 
                    18
                ), 
                new Color(
                    68, 
                    148, 
                    19
                ), 
                new Color(
                    68, 
                    148, 
                    20
                ), 
                new Color(
                    68, 
                    148, 
                    21
                ), 
                new Color(
                    68, 
                    148, 
                    22
                ), 
                new Color(
                    68, 
                    148, 
                    23
                ), 
                new Color(
                    68, 
                    149, 
                    17
                ), 
                new Color(
                    68, 
                    149, 
                    18
                ), 
                new Color(
                    68, 
                    149, 
                    19
                ), 
                new Color(
                    68, 
                    149, 
                    20
                ), 
                new Color(
                    68, 
                    149, 
                    21
                ), 
                new Color(
                    68, 
                    149, 
                    22
                ), 
                new Color(
                    68, 
                    149, 
                    23
                ), 
                new Color(
                    68, 
                    150, 
                    17
                ), 
                new Color(
                    68, 
                    150, 
                    18
                ), 
                new Color(
                    68, 
                    150, 
                    19
                ), 
                new Color(
                    68, 
                    150, 
                    20
                ), 
                new Color(
                    68, 
                    150, 
                    21
                ), 
                new Color(
                    68, 
                    150, 
                    22
                ), 
                new Color(
                    68, 
                    150, 
                    23
                ), 
                new Color(
                    68, 
                    151, 
                    17
                ), 
                new Color(
                    68, 
                    151, 
                    18
                ), 
                new Color(
                    68, 
                    151, 
                    19
                ), 
                new Color(
                    68, 
                    151, 
                    20
                ), 
                new Color(
                    68, 
                    151, 
                    21
                ), 
                new Color(
                    68, 
                    151, 
                    22
                ), 
                new Color(
                    68, 
                    151, 
                    23
                ), 
                new Color(
                    68, 
                    152, 
                    17
                ), 
                new Color(
                    68, 
                    152, 
                    18
                ), 
                new Color(
                    68, 
                    152, 
                    19
                ), 
                new Color(
                    68, 
                    152, 
                    20
                ), 
                new Color(
                    68, 
                    152, 
                    21
                ), 
                new Color(
                    68, 
                    152, 
                    22
                ), 
                new Color(
                    68, 
                    152, 
                    23
                ), 
                new Color(
                    68, 
                    153, 
                    17
                ), 
                new Color(
                    68, 
                    153, 
                    18
                ), 
                new Color(
                    68, 
                    153, 
                    19
                ), 
                new Color(
                    68, 
                    153, 
                    20
                ), 
                new Color(
                    68, 
                    153, 
                    21
                ), 
                new Color(
                    68, 
                    153, 
                    22
                ), 
                new Color(
                    68, 
                    153, 
                    23
                ), 
                new Color(
                    68, 
                    154, 
                    17
                ), 
                new Color(
                    68, 
                    154, 
                    18
                ), 
                new Color(
                    68, 
                    154, 
                    19
                ), 
                new Color(
                    68, 
                    154, 
                    20
                ), 
                new Color(
                    68, 
                    154, 
                    21
                ), 
                new Color(
                    68, 
                    154, 
                    22
                ), 
                new Color(
                    68, 
                    154, 
                    23)}, canvas); // norm xmas colors
    }

    public void onMouseClick(Location p) {
    }
}