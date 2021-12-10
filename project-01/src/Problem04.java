import processing.core.*;

public class Problem04 extends PApplet {

    float circleX, circleY, circleR;

    float columns, rows, scale;

    public void settings() {fullScreen();    }

    public void setup() {
        circleR = height/20f;
        circleX = circleR/2f;
        circleY = circleR/2f;

        scale = height/20f;
        columns = width/scale;
        rows = height/scale;

    }

    public void draw() {

        fill(0,0,0,100);
        noStroke();
        for (float x = 0; x < columns; x++) {
            for (float y = 0; y < rows; y++) {
                rect((x * scale) + 1, (y * scale) + 1, scale - 2, scale - 2);
            }
        }


        fill(255,0,0);
        circle(circleX,circleY,circleR);

        if (key == CODED){
            switch (keyCode){
                case UP:
                    circleY-=2*circleR;
                    break;
                case DOWN:
                    circleY+=2*circleR;
                    break;
                case LEFT:
                    circleX-=2*circleR;
                    break;
                case RIGHT:
                    circleX+=2*circleR;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}