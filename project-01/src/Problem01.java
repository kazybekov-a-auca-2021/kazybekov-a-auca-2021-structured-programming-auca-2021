import processing.core.*;

public class Problem01 extends PApplet {

    static float MIN_SIZE = 10;
    static float MAX_SIZE = 90;

    static String MESSAGE = "Hello, Processing!!!";

    float messageSize, range;
    int red, green, blue;

    public void settings() {
        size(700, 700);
    }

    public void setup() {
        messageSize = MIN_SIZE;
        range = MAX_SIZE;
        red = 255;
        green = 0;
        blue = 0;
    }

    public void draw() {
        background(0, 0, 0);
        textSize(messageSize);
        textAlign(CENTER, CENTER);
        fill(red, green, blue);
        text(MESSAGE, width / 2f, height / 2f);

        if (messageSize < range - 1) {
            messageSize += 2;
        } else if (messageSize > MIN_SIZE + 1) {
            messageSize -= 2;
            range -= 2;
        } else {
            range = 90;
            if (red == 255) {
                green = 255;
                red = 0;
            } else if (green == 255) {
                blue = 255;
                green = 0;
            } else {
                red = 255;
                blue = 0;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}