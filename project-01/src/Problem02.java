import processing.core.*;

public class Problem02 extends PApplet {

    float x = 0;
    float y = 0;
    float dx = 0;
    float dy = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x=width/2f;
        y=height/2f;
        dx = random(-20f,20f);
        dy = random(-20f,20f);
    }

    public void draw() {
        background(0, 0, 0);
        fill(255,0,0);
        circle(x,y,50);
        x+=dx;
        y+=dy;
        if(x>=width){
            x=width-1;
            dx=-dx;
        }
        if (x<0){
            x = 0;
            dx = -dx;
        }
        if(y>=height){
            y=height-1;
            dy=-dy;
        }
        if (y<0){
            y = 0;
            dy = -dy;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}