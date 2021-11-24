import processing.core.PApplet;

public class Problem05 extends PApplet {

    final int MAX_NUMBER = 14;

    int radius = 0, alpha = 0;

    public void settings() {
        size(800,800);
    }

    public void setup() {
        background(0,0,0);
        alpha = 100;
        radius = 5;
        for (int i = 1; i <= MAX_NUMBER; i++) {
            fill(255,0,0,alpha);
            circle(width/2f,height/2f,radius);
            radius+=35;
            alpha-=5;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }
}
