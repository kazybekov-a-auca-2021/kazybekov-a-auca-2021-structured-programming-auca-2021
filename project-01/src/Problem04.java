import processing.core.*;

public class Problem04 extends PApplet {

    float circleX, circleY, circleR;

    float columns, rows, scale;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        circleR = height / 20f;
        circleX = circleR / 2f;
        circleY = circleR / 2f;

        scale = height / 20f;
        columns = width / scale;
        rows = height / scale;
        frameRate(10);

    }

    public void draw() {

        fill(0, 0, 0, 100);
        noStroke();



        fill(255, 0, 0);
        circle(circleX, circleY, circleR);

        if (key == CODED) {
            switch (keyCode) {
                case UP -> circleY -= 2 * circleR;
                case DOWN -> circleY += 2 * circleR;
                case LEFT -> circleX -= 2 * circleR;
                case RIGHT -> circleX += 2 * circleR;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}