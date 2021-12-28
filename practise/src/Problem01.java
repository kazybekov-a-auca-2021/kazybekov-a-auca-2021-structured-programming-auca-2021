import processing.core.PApplet;


public class Problem01 extends PApplet {

    static final float MAX_SIZE = 140;
    static final float MIN_SIZE = 10;

    static String MESSAGE = "Hello, Processing!!!";

    float messageSize, range;

    int red, green, blue;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        messageSize = MIN_SIZE;
        range = MAX_SIZE;
        textAlign(CENTER, CENTER);
        red = 255;
        green = 0;
        blue = 0;
    }

    public void draw() {
        background(0, 0, 0);
        text(MESSAGE, width / 2f, height / 2f);
        fill(red, green, blue);
        textSize(messageSize);
        if (messageSize < range) {
            messageSize += 2;
        } else if (messageSize > MIN_SIZE) {
            messageSize -= 2;
            range -= 2;
        } else {
            range = MAX_SIZE;
            if (red == 255) {
                green = 255;
                red = 0;
            } else if (green == 255) {
                green = 0;
                blue = 255;
            } else {
                blue = 0;
                red = 255;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }
}
