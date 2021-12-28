import processing.core.PApplet;


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

        Object[][] desk = {
                {"Java", 1995, 2},
                {"Kotlin", 2011, 11},
                {"Scala", 2004, 20}
        };
        fill(0,0,100);
        ellipse(mouseX, mouseY, 100, 100);

        for (int i = 0; i < desk.length; i++) {
            float rectX = width / 2f - RECT_WIDTH / 2f;
            float rectY = height/10f + i * RECT_HEIGHT;

            fill(0, 0, 255);
            rect(rectX, rectY, RECT_WIDTH, RECT_HEIGHT);

            if (mouseX >= rectX && mouseX <= rectX + RECT_WIDTH
                    && mouseY >= rectY && mouseY <= rectY + RECT_HEIGHT) {
                fill(255, 255, 0);
                text("Year: " + desk[i][1] + "PYPL Index: " + desk[i][2], width / 2f, height - height / 10f);
                fill(255, 0, 0);
            } else {
                fill(255, 255, 255);
            }
            text(desk[i][0] + " Programming Language", rectX + RECT_WIDTH / 2f, rectY + RECT_HEIGHT / 2f);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}
