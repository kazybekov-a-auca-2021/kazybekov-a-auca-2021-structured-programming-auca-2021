import processing.core.*;

public class Problem02 extends PApplet {

    float x = 0;
    float y = 0;
    float dx = 0;
    float dy = 0;

    float x1 = 0;
    float y1 = 0;
    float dx1 = 0;
    float dy1 = 0;

    float x2 = 0;
    float y2 = 0;
    float dx2 = 0;
    float dy2 = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2f;
        y = height / 2f;
        dx = random(-20f,20f);
        dy = random(-20f,20f);

        x1 = width / 2f;
        y1 = height / 2f;
        dx1 = dx + 1;
        dy1 = dy + 1;

        x2 = width / 2f;
        y2 = height / 2f;
        dx2 = dx;
        dy2 = dy;
    }

    public void draw() {
        background(0, 0, 0);
        fill(255,0,0);
        circle(x, y, 50);
        fill(0,255,0);
        circle(x1, y1, 50);
        fill(0,0,255);
        circle(x2, y2, 50);
        x += dx;
        y += dy;
        x1 += dx1;
        y1 += dy1;
        x2 += dx2;
        y2 += dy2;

        if (x >= width) {
            x = width - 1;
            dx = -dx;
        }
        if (x < 0) {
            x = 0;
            dx = -dx;
        }
        if (y >= height) {
            y = height - 1;
            dy = -dy;
        }
        if (y < 0) {
            y = 0;
            dy = -dy;
        }

        if (x1 >= width) {
            x1 = width - 1;
            dx1 = -dx1;
        }
        if (x1 < 0) {
            x1 = 0;
            dx1 = -dx1;
        }
        if (y1 >= height) {
            y1 = height - 1;
            dy1 = -dy1;
        }
        if (y1 < 0) {
            y1 = 0;
            dy1 = -dy1;
        }

        if (x2 >= width) {
            x2 = width - 1;
            dx2 = -dx2;
        }
        if (x2 < 0) {
            x2 = 0;
            dx2 = -dx2;
        }
        if (y2 >= height) {
            y2 = height - 1;
            dy2 = -dy2;
        }
        if (y2 < 0) {
            y2 = 0;
            dy2 = -dy2;
        }

    }


    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}