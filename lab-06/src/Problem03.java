import processing.core.*;

public class Problem03 extends PApplet {

    final int NUMBER_OF_STARTS = 8;

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        frameRate(30);
    }

    public void draw() {
        background(0, 0, 0);
        noLoop();
        drawStar(width / 2f, height / 2f, height / 3f, 255, 0, 0);
        drawStar(width / 6f, height / 6f, height / 8f, 255, 255, 0);
        drawStar(width - width / 6f, height / 6f, height / 8f, 255, 255, 0);
        drawStar(width / 6f, height - height / 6f, height / 8f, 255, 255, 0);
        drawStar(width - width / 6f, height - height / 6f, height / 8f, 255, 255, 0);

    }

    private void drawStar(float centerX, float centerY, float r, float red, float green, float blue) {
        pushMatrix();

        float alpha = 0;
        float dAlpha = 2 * PI / NUMBER_OF_STARTS;

        translate(centerX, centerY);
        stroke(red, green, blue);

        float prevX = 0;
        float prevY = 0;
        for (int i = 0; i < NUMBER_OF_STARTS + 1; i++) {
            float curR = r;
            if (i % 2 == 1) {
                curR /= 4;
            }
            float x = curR * cos(alpha);
            float y = curR * sin(alpha);
            line(0, 0, x, y);


            line(prevX, prevY, x, y);
            prevX = x;
            prevY = y;
            alpha += dAlpha;
        }

        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}