import processing.core.*;

public class Problem04 extends PApplet {

    float circleX, circleY, circleR;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        circleX = width/2f;
        circleY = height/2f;
        circleR = height/20f;
        frameRate(5);
    }

    public void draw() {
        fill(0,0,0,50);
        rect(0,0,width,height);

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