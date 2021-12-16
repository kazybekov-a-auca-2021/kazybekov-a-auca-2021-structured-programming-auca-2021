import processing.core.*;

import javax.swing.*;

public class Problem05 extends PApplet {

    final static float DESK_SIZE = 750;
    float radius;
    float textPosX, textPosY;
    float rectX, rectY;

    int row, column;
    String color;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(30);
        textPosX = width / 2f - width / 9f;
        textPosY = height / 2f - height / 2.3f;
        rectX = width / 2f - width / 4f;
        rectY = height / 2f - height / 2.5f;
        color = "White";
        row = 1;
        column = 5;

        try {
            String strRadius = JOptionPane.showInputDialog("Enter the board' size [4,12]: ");
            radius = Float.parseFloat(strRadius);
        } catch (NumberFormatException e) {
            JOptionPane.showInputDialog(null, "Incorrect input");
            System.exit(1);
        }

        if (radius < 4 || radius > 12) {
            JOptionPane.showInputDialog(null, "Incorrect Number");
            System.exit(1);
        }
    }

    public void draw() {
        background(0, 0, 0);
        fill(255, 255, 0);
        text("Row: " + row + ", Column: " + column + ",  Color: " + color, textPosX, textPosY);

        fill(0, 0, 0);
        stroke(192, 192, 192);
        rect(rectX, rectY, DESK_SIZE, DESK_SIZE);


        for (int i = 0; i < radius; i++) {
            for (int j = 0; j < radius; j++) {
                if ((i+j) % 2 == 0) {
                    fill(255, 255, 255);
                } else {
                    fill(1, 50, 32);
                }
                float w = rectX + i * DESK_SIZE / radius;
                float l = rectY + j * DESK_SIZE / radius;
                if (mouseX > w && mouseY > l && mouseX < w + DESK_SIZE / radius && mouseY < l + DESK_SIZE / radius) {
                    row = i;
                    column = j;
                    if ((i + j) % 2 != 0) {
                        color = "Dark-Green";
                    } else {
                        color = "White";
                    }
                    noFill();
                    square(w,l,DESK_SIZE/radius);
                }
                square(rectX + i * DESK_SIZE / radius, rectY + j * DESK_SIZE / radius, DESK_SIZE / radius);
            }
        }
        fill(255, 0, 0);
        ellipse(mouseX, mouseY, 1, 1);
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}