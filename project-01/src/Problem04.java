import processing.core.*;

public class Problem04 extends PApplet {

    float circleX, circleY, circleR;
    float foodX, foodY, foodR;
    float a, b, c, d;

    int score;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(10);
        textSize(50);
        score = -1;
        circleX = width / 4f + 25;
        circleY = height / 4f + 25;
        circleR = 50f;
        foodX = circleX;
        foodY = circleY;
        foodR = circleR;

        a = circleX;
        b = width / 4f + 775;

        c = circleY;
        d = height / 4f + 475;
    }

    public void draw() {
        fill(0, 0, 0, 50);
        rect(0, 0, width, height);
        noStroke();
        fill(0, 255, 0);
        text("Game: Yellow Circles using Arrow Buttons", width / 2f - 430, height / 6f);
        text("Score: " + score, width / 2f - 100, height - 50);
        stroke(0, 0, 255);
        fill(0, 0, 255);

        for (int i = 0; i <= 500; i += 50) {
            fill(0, 0, 255);
            line(width / 4f, height / 4f + i, width / 4f + 800f, height / 4f + i);
        }
        for (int i = 0; i <= 800; i += 50) {
            fill(0, 0, 255);
            line(width / 4f + i, height / 4f, width / 4f + i, height / 4f + 500);
        }

        noStroke();
        frameRate(10);
        fill(255, 0, 0);
        circle(circleX, circleY, circleR);

        if (key == CODED) {
            switch (keyCode) {
                case UP -> circleY -=  circleR;
                case DOWN -> circleY +=  circleR;
                case LEFT -> circleX -=  circleR;
                case RIGHT -> circleX +=  circleR;
            }
        }

        if (circleX <= (width / 4f)) {
            circleX = a;
        }
        if (circleX >= (width / 4f + 800)) {
            circleX = b;
        }
        if (circleY <= (height / 4f + 25)) {
            circleY = c;
        }
        if (circleY >= (height / 4f + 500)) {
            circleY = d;
        }

        fill(255, 255, 0);
        circle(foodX,foodY,foodR);
        if (circleY == foodY && circleX == foodX) {
            foodX = foodX + foodR + 100 * ((int) random(0, 20));
            foodY = foodY + foodR + 100 * ((int) random(0, 20));
            foodX = foodX + foodR - 100 * ((int) random(0, 20));
            foodY = foodY + foodR - 100 * ((int) random(0, 20));
            score++;
        }

        if (foodX <= (width / 4f)) {
            foodX = a;
        }
        if (foodX >= (width / 4f + 800)) {
            foodX = b;
        }
        if (foodY <= height / 4f + 25) {
            foodY = c;
        }
        if (foodY >= (height / 4f + 500)) {
            foodY = d;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}