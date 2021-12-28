import processing.core.PApplet;

public class Problem04 extends PApplet {

    static final float ROW = 800;
    static final float COLUMN = 500;

    float circleX, circleY, radius;
    float foodX, foodY;

    int score;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(10f);
        textSize(50);
        textAlign(CENTER, CENTER);
        score = 0;
        radius = 50f;
        circleX = width / 4f + radius / 2f;
        circleY = height / 4f + radius / 2f;
        foodX = circleX + radius + 100 * ((int) random(0, radius));
        foodY = circleY + radius + 100 * ((int) random(0, radius));
        foodX = foodX + radius - 100 * ((int) random(0, radius));
        foodY = foodY + radius - 100 * ((int) random(0, radius));
    }

    public void draw() {
        fill(0, 0, 0, 50);
        rect(0, 0, width, height);
        noStroke();

        fill(0, 255, 0);
        text("Eat yellow circles to gain points", width / 2f, height / 8f);
        text("Score: " + score, width / 2f, height - height / 10f);

        stroke(0, 0, 255);
        fill(0, 0, 255);
        for (int i = 0; i <= COLUMN; i += 50) {
            fill(0, 0, 255);
            line(width / 4f, height / 4f + i, width / 4f + ROW, height / 4f + i);
        }
        for (int i = 0; i <= ROW; i += 50) {
            fill(0, 0, 255);
            line(width / 4f + i, height / 4f, width / 4f + i, height / 4f + COLUMN);
        }

        noStroke();
        fill(255, 0, 0);
        circle(circleX, circleY, radius);

        if (key == CODED) {
            switch (keyCode) {
                case UP -> circleY -= radius;
                case DOWN -> circleY += radius;
                case LEFT -> circleX -= radius;
                case RIGHT -> circleX += radius;
            }
        }

        if (circleX <= width / 4f) {
            circleX = width / 4f + radius / 2f;
        } else if (circleX >= width / 4f + ROW) {
            circleX = width / 4f + ROW - radius / 2f;
        }
        if (circleY <= height / 4f) {
            circleY = height / 4f + radius / 2f;
        } else if (circleY >= height / 4f + COLUMN) {
            circleY = height / 4f + COLUMN - radius / 2f;
        }

        fill(255, 255, 0);
        circle(foodX, foodY, radius);

        if (circleX == foodX && circleY == foodY) {
            foodX = foodX + radius + 100 * ((int) random(0, radius));
            foodY = foodY + radius + 100 * ((int) random(0, radius));
            foodX = foodX + radius - 100 * ((int) random(0, radius));
            foodY = foodY + radius - 100 * ((int) random(0, radius));
            score++;
        }

        if (foodX <= width / 4f) {
            foodX = width / 4f + radius / 2f;
        } else if (foodX >= width / 4f + ROW) {
            foodX = width / 4f + ROW - radius / 2f;
        }
        if (foodY <= height / 4f) {
            foodY = height / 4f + radius / 2f;
        } else if (foodY >= height / 4f + COLUMN) {
            foodY = height / 4f + COLUMN - radius / 2f;
        }
    }


    public static void main(String[] args) {
        PApplet.main("Problem04");
    }
}
