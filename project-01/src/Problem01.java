import processing.core.*;

import java.util.Random;

public class Problem01 extends PApplet {
    Random random = new Random();

    static float MIN_SIZE = 10;
    static float MAX_SIZE = 146;

    static String MESSAGE = "Hello, Processing!!!";

    float messageSize;
    int red, green, blue;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        messageSize = MIN_SIZE;
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
        if (messageSize < MAX_SIZE-1) {
            messageSize += 1;
        }
        else if(messageSize>MIN_SIZE+1){
            messageSize -= 1;
            MAX_SIZE-=1;
        }
        else {
            MAX_SIZE=146;
            if(red==255) {green = 255; red=0;}
            else if(green==255) {blue = 255; green=0;}
            else if(blue==255) {red=255; blue=0;}
        }
    }
    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}