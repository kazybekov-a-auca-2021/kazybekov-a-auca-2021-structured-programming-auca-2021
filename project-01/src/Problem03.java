import processing.core.*;

public class Problem03 extends PApplet {
    static final float RECT_WIDTH = 500;
    static final float RECT_HEIGHT = 100;

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

        fill(0, 0, 100);
        ellipse(mouseX, mouseY, 100, 100);

        Object[][] info = {
                {"Java", 1995, 2},
                {"Kotlin", 2011, 11},
                {"Scala", 2004, 20}
        };

        for (int i = 0; i < info.length; i++) {
            float rectTopLeftX = width / 2f - RECT_WIDTH / 2f;
            float rectTopLeftY = RECT_HEIGHT + i * RECT_HEIGHT;

            fill(0, 0, 255);
            rect(rectTopLeftX, rectTopLeftY, RECT_WIDTH, RECT_HEIGHT);

            if (mouseX >= rectTopLeftX && mouseX <= rectTopLeftX + RECT_WIDTH && mouseY >= rectTopLeftY && mouseY <= rectTopLeftY + RECT_HEIGHT) {
                fill(255, 255, 0);
                text("Year: " + info[i][1] + " PYPL Index: " + info[i][2], width / 2f, height - height / 10f);
                fill(255, 0, 0);
            } else {
                fill(255, 255, 255);
            }
            text(info[i][0] + " Programming Language", rectTopLeftX + RECT_WIDTH / 2f, rectTopLeftY + RECT_HEIGHT / 2f);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}