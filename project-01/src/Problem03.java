import processing.core.*;

public class Problem03 extends PApplet {
    static final float RECT_WIDTH = 500;
    static final float RECT_HEIGHT = 300;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(30);
        textAlign(CENTER);
        textSize(30);
    }

    public void draw() {
        background(0, 0, 0);

        float rectTopLeftX = width / 2f - RECT_WIDTH / 2f;
        float rectTopLeftY = height / 4f - RECT_HEIGHT / 2f;

        fill(0, 0, 255, 90);
        stroke(0, 0, 255, 100);
        rect(rectTopLeftX, rectTopLeftY, RECT_WIDTH, RECT_HEIGHT);

        if (mouseX >= rectTopLeftX && mouseX <= rectTopLeftX + RECT_WIDTH && mouseY >= rectTopLeftY && mouseY <= rectTopLeftY + RECT_HEIGHT / 3f) {
            fill(255, 0, 0);
        } else {
            fill(255, 255, 255);
        }
        text("Java Programming Language", rectTopLeftX + RECT_WIDTH / 2f, rectTopLeftY + RECT_HEIGHT / 6f);

        fill(0, 0, 0);
        line(rectTopLeftX, rectTopLeftY + (RECT_HEIGHT / 3f), rectTopLeftX + RECT_WIDTH, rectTopLeftY + (RECT_HEIGHT / 3f));

        if (mouseX >= rectTopLeftX && mouseX <= rectTopLeftX + RECT_WIDTH &&
                mouseY >= rectTopLeftY + (RECT_HEIGHT / 3f) && mouseY <= rectTopLeftY + (RECT_HEIGHT / 3f) + RECT_HEIGHT / 3f) {
            fill(255, 0, 0);
        } else {
            fill(255, 255, 255);
        }
        text("Kotlin Programming Language", rectTopLeftX + RECT_WIDTH / 2f, rectTopLeftY + RECT_HEIGHT / 2f);

        fill(0, 0, 0);
        line(rectTopLeftX, rectTopLeftY + 2 * (RECT_HEIGHT / 3f), rectTopLeftX + RECT_WIDTH, rectTopLeftY + 2 * (RECT_HEIGHT / 3f));

        if (mouseX >= rectTopLeftX && mouseX <= rectTopLeftX + RECT_WIDTH &&
                mouseY >= rectTopLeftY + 2 * (RECT_HEIGHT / 3f) && mouseY <= rectTopLeftY + 2 * (RECT_HEIGHT / 3f) + RECT_HEIGHT / 3f) {
            fill(255, 0, 0);
        } else {
            fill(255, 255, 255);
        }
        text("Scala Programming Language", rectTopLeftX + RECT_WIDTH / 2f, rectTopLeftY + 5 * RECT_HEIGHT / 6f);

        fill(0, 0, 100);
        ellipse(mouseX, mouseY, 1, 1);


        if (mouseX >= rectTopLeftX && mouseX <= rectTopLeftX + RECT_WIDTH && mouseY >= rectTopLeftY && mouseY <= rectTopLeftY + RECT_HEIGHT / 3f) {
            fill(255, 255, 255);
            text("Year: 1995. PYPL Index: 2", width / 2f, height - height / 10f);
        } else if (mouseX >= rectTopLeftX && mouseX <= rectTopLeftX + RECT_WIDTH &&
                mouseY >= rectTopLeftY + (RECT_HEIGHT / 3f) && mouseY <= rectTopLeftY + (RECT_HEIGHT / 3f) + RECT_HEIGHT / 3f) {
            fill(255, 255, 255);
            text("Year: 2011. PYPL Index: 11", width / 2f, height - height / 10f);
        } else if (mouseX >= rectTopLeftX && mouseX <= rectTopLeftX + RECT_WIDTH &&
                mouseY >= rectTopLeftY + 2 * (RECT_HEIGHT / 3f) && mouseY <= rectTopLeftY + 2 * (RECT_HEIGHT / 3f) + RECT_HEIGHT / 3f) {
            fill(255, 255, 255);
            text("Year: 2004. PYPL Index: 20", width / 2f, height - height / 10f);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}