import processing.core.*;

public class Problem04 extends PApplet {

    int numberOfCircle = (int)(Math.random()*10);

    int x = 0, y = 0, radius = 0;
    int r = 0, g = 0, b = 0;

    public void settings() {
       fullScreen();
    }

    public void setup() {
        x = 0;
        y = 0;
        radius = 0;
        r = 0;
        g = 0;
        b = 0;
    }

    public void draw() {
        background(0,0,0);
        x = (int)(Math.random()*1920);
        y = (int)(Math.random()*1080);
        radius = (int)(Math.random()*100);
        circle(x,y,radius);
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");

    }

}