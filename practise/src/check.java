import processing.core.*;

public class check extends PApplet {
    static final float RECT_WIDTH = 200;
    static final float RECT_HEIGHT = 50;
    float green, red, blue;
    float alpha, beta, gamma;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        alpha = 1;
        beta = 0;
        gamma = 0;
    }

    public void draw() {
        background(0, 0, 0);
        red = 0;
        green = 0;
        blue = 0;

        int radiusDiff = 5;
        int Sun = 250; //radius
        int Venus = 100;
        int Earth = 120;
        int Moon = 40;

        float rectTopLeftX = width / 2f + 450f;
        float rectTopLeftY = height / 2f - 350f;

        fill(0, 0, 255);
        rect(rectTopLeftX, rectTopLeftY, RECT_WIDTH, RECT_HEIGHT);
        fill(255, 255, 255);
        textSize(25f);
        text("Sun", rectTopLeftX + 80f, rectTopLeftY + 30f);

        fill(0, 0, 255);
        stroke(0);
        rect(rectTopLeftX, rectTopLeftY + 50f, RECT_WIDTH, RECT_HEIGHT);
        fill(255, 255, 255);
        textSize(25f);
        text("Venus", rectTopLeftX + 70f, rectTopLeftY + 80f);

        fill(0, 0, 255);
        stroke(0);
        rect(rectTopLeftX, rectTopLeftY + 100f, RECT_WIDTH, RECT_HEIGHT);
        fill(255, 255, 255);
        textSize(25f);
        text("Earth", rectTopLeftX + 75f, rectTopLeftY + 130f);

        fill(0, 0, 255);
        stroke(0);
        rect(rectTopLeftX, rectTopLeftY + 150f, RECT_WIDTH, RECT_HEIGHT);
        fill(255, 255, 255);
        textSize(25f);
        text("Moon", rectTopLeftX + 75f, rectTopLeftY + 180f);

        if (rectTopLeftX <= mouseX && mouseX <= rectTopLeftX + RECT_WIDTH &&
                rectTopLeftY<= mouseY && mouseY <= rectTopLeftY + RECT_HEIGHT) {
            fill(255, 0, 0);
            textSize(25f);
            text("Sun", rectTopLeftX + 80f, rectTopLeftY + 30f);
            noFill();
            stroke(255, 0, 0);
            strokeWeight(1);
            circle(width / 2f, height / 2f, 255);
        } else if (rectTopLeftX <= mouseX && mouseX <= rectTopLeftX + RECT_WIDTH &&
                rectTopLeftY + 50f <= mouseY && mouseY <= rectTopLeftY + 50f + RECT_HEIGHT) {
            fill(255, 0, 0);
            textSize(25f);
            text("Venus", rectTopLeftX + 70f, rectTopLeftY + 80f);
            noFill();
            stroke(255, 0, 0);
            strokeWeight(1);
            circle(width / 2f, height / 2f, 350 );
        } else if (rectTopLeftX <= mouseX && mouseX <= rectTopLeftX + RECT_WIDTH &&
                rectTopLeftY + 105f <= mouseY && mouseY <= rectTopLeftY + 105f + RECT_HEIGHT) {
            fill(255, 0, 0);
            textSize(25f);
            text("Earth", rectTopLeftX + 75f, rectTopLeftY + 130f);
            noFill();
            stroke(255, 0, 0);
            strokeWeight(1);
            circle(width / 2f, height / 2f, 670);
        } else if (rectTopLeftX<= mouseX && mouseX <= rectTopLeftX + RECT_WIDTH &&
                rectTopLeftY + 145f <= mouseY && mouseY <= rectTopLeftY + 145f + RECT_HEIGHT) {
            fill(255, 0, 0);
            textSize(25f);
            text("Moon", rectTopLeftX + 75f, rectTopLeftY + 180f);
        }

        pushMatrix();
        translate(width / 2f, height / 2f);
        //sun
        noStroke();
        for (int i = 1; i <= 50; i++) {
            fill(red, green, 0);
            circle(0, 0, Sun);
            red += radiusDiff;
            green += radiusDiff;
            Sun -= radiusDiff;
        }
        //venus
        noStroke();
        rotate(alpha);
        alpha += 0.01;
        float blue2 = 0, green2 = 0;
        fill(0,0 , 0);
        circle(180, 0, 100);
        for (int i = 1; i <= 25; i++) {
            fill(0, green2 , blue2);
            circle(180, 0, Venus);
            green2 += radiusDiff;
            blue2 += radiusDiff;
            Venus -= 3;
        }
        if (rectTopLeftX + 75f <= mouseX && mouseX <= rectTopLeftX + 75f + RECT_WIDTH)

        if (rectTopLeftX + 75f <= mouseX && mouseX <= rectTopLeftX + 75f + RECT_WIDTH &&
                rectTopLeftY + 50f <= mouseY && mouseY <= rectTopLeftY + 50f + RECT_HEIGHT) {
            noFill();
            stroke(255, 0, 0);
            strokeWeight(1);
            circle(180, 0, 90);
        }
        //earth
        noStroke();
        rotate(beta);
        beta += 0.01;
        float blue3 = 0;
        noStroke();
        for (int i = 1; i <= 70; i++) {
            fill(0, 0, blue3);
            circle(340, 0, Earth);
            blue3 += radiusDiff;
            Earth -= 1;
        }
        if (rectTopLeftX + 75f <= mouseX && mouseX <= rectTopLeftX + 75f + RECT_WIDTH &&
                rectTopLeftY + 100f <= mouseY && mouseY <= rectTopLeftY + 100f + RECT_HEIGHT) {
            noFill();
            stroke(255, 0, 0);
            strokeWeight(1);
            circle(340, 0, 120);
        }
        //moon
        pushMatrix();
        translate(340, 0);
        float red4 = 0, green4 = 0, blue4 = 0;
        rotate(gamma);
        gamma += 0.02f;
        noStroke();
        for (int i = 0; i <= 30; i++) {
            fill(red4, green4, blue4);
            circle(80, 0, Moon);
            red4 += radiusDiff;
            green4 += radiusDiff;
            blue4 += 5;
            Moon -= 1;
        }
        if (rectTopLeftX <= mouseX && mouseX <= rectTopLeftX + RECT_WIDTH &&
                rectTopLeftY + 150f <= mouseY && mouseY <= rectTopLeftY + 150f + RECT_HEIGHT) {
            noFill();
            stroke(255, 0, 0);
            strokeWeight(1);
            circle(0, 0, 160);
            circle(80, 0, 45);
        }
        popMatrix();
        popMatrix();
    }
    public static void main(String[] args) {
        PApplet.main("check");
    }
}