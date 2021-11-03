import processing.core.*;

public class Problem02 extends PApplet {

    float x = 0;
    float y = 0;
    float dx = 0;
    float dy = 0;
    float a = 0;
    float b = 0;
    float da = 0;
    float db = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2f;
        y = height / 2f;
        a = width / 2f;
        b = height / 2f;
        dx = random(-20f, 20f);
        dy = random(-20f, 20f);
        da = dx;
        db = dy;
    }

    public void draw() {
        background(0, 0, 0);
        fill(255,0,0);
        circle(x, y, 50);
        fill(0,255,0);
        circle(a, b, 50);
        x += dx;
        y += dy;
        if (x >= width) {
            x = width - 1;
            a = width - 1;
            dx = -dx;
        }
        if (x < 0) {
            x = 0;
            a = 0;
            dx = -dx;
        }
        if (y >= height) {
            y = height - 1;
            b = height - 1;
            dy = -dy;
        }
        if (y < 0) {
            y = 0;
            b = 0;
            dy = -dy;
        }
        a += dx;
        b += dy;
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}