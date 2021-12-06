import processing.core.*;

public class Problem03 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(30);
        textSize(40);
    }

    public void draw() {
        background(0, 0, 0);

        fill(255, 255, 0);
        text("mouseX" + mouseX, width / 2f, height / 2f);
        text("mouseY: " + mouseY, width / 2f, height / 2f + height / 30f);

        fill(0, 0, 255);
        ellipse(mouseX, mouseY, 100, 100);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}