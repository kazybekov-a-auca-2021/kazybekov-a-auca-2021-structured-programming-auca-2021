import processing.core.*;

public class Problem04 extends PApplet {

    final float FIELD = 700;

    float rectX, rectY;

    float circleX, circleY, circleR;
    float amount = 20;

    public void settings() {
        fullScreen();
    }

    public void setup() {

        frameRate(10);
        rectX = width / 2f - width / 4.65f;
        rectY = height / 2f - height / 3.0f;
        circleR = FIELD/amount;
        circleX = rectX + circleR;
        circleY = rectY + circleR;

        amount = 12;
    }

    public void draw() {
        fill(0,0,0,50);
        rect(0,0,width,height);

        noFill();
        stroke(0,0,255);
        rect(rectX,rectY,FIELD,FIELD);

        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                float w = rectX + i * FIELD / amount;
                float l = rectY + j * FIELD / amount;

                square(w, l, FIELD / amount);
            }
        }

        fill(255,0,0);
        circle(circleX,circleY,circleR);
        if (key == CODED){
            switch (keyCode){
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