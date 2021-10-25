import processing.core.*;
import java.util.Random;
public class Problem01 extends PApplet {
    Random random = new Random();
    static float MIN_SIZE = 10;
    static float MAX_SIZE = 144;
    static int UPPER_BOUND = 255;
    static String MESSAGE = "Hello, Processing!!!";
    float messageSize;
    int red, green , blue;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        messageSize = MIN_SIZE;
        red = 0;
        green = 0;
        blue = 0;
    }

    public void draw() {
        background(0, 0, 0);
        textSize(messageSize);
        textAlign(CENTER,CENTER);
        fill(red,green,blue);
        text(MESSAGE,width/2f,height/2f);
        if(messageSize<MAX_SIZE) {
            messageSize+=1;
            int nR = random.nextInt(UPPER_BOUND);
            int nG = random.nextInt(UPPER_BOUND);
            int nB = random.nextInt(UPPER_BOUND);
            if(red+nR<=255) red+=nR;
            else red=0;
            if(green+nG<=255) green+=nG;
            else green=0;
            if(blue+nB<=255) blue+=nB;
            else blue=0;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}