import processing.core.PApplet;

public class Problem05 extends PApplet {

    final int MAX_NUMBER = 16;

    float radius = 0;
    float alpha = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(2);
        noStroke();
    }

    public void draw() {
        background(0, 0, 0);
        alpha = 100;
        radius = min(width, height) / 2f;
        for (int i = 1; i <= MAX_NUMBER; i++) {
            fill(255, 0, 0, alpha);
            circle(width / 2f, height / 2f, radius);
            radius += 35;
            alpha -= 5;
        }
        noLoop();
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }
}
