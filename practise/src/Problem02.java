import processing.core.PApplet;


public class Problem02 extends PApplet {

    float x, y, r;
    float dx, dy;

    float a, b;
    float da, db;

    float c, d;
    float dc,dd;

    float cur;
    int count;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2f;
        y = height / 2f;
        r = 50f;
        dx = random(-20f,20f);
        dy = random(-20f,20f);
        a = x;
        b = y;
        da = dx;
        db = dy;
        c = a;
        d = b;
        dc = da;
        dd = dy;
        cur = dx;
        count = 0;
    }

    public void draw() {
        background(0, 0, 0);
        fill(255,0, 0);
        circle(x, y, r);
        fill(0, 255, 0);
        circle(a, b, r);
        fill(0,0,255);
        circle(c,d,r);
        x += dx;
        y += dy;
        count++;

        if (x >= width) {
            x = width - 1;
            dx = -dx;
        }
        if (x < 0) {
            x = 0;
            dx = -dx;
        }
        if (y >= height) {
            y = height - 1;
            dy = -dy;
        }
        if (y < 0) {
            y = 0;
            dy = -dy;
        }

        if (a >= width) {
            a = width - 1;
            da = -da;
        }
        if (a < 0) {
            a = 0;
            da = -da;
        }
        if (b >= height) {
            b = height - 1;
            db = -db;
        }
        if (b < 0) {
            b = 0;
            db = -db;
        }

        if (c >= width) {
            c = width - 1;
            dc = -dc;
        }
        if (c < 0) {
            c = 0;
            dc = -dc;
        }
        if (d >= height) {
            d = height - 1;
            dd = -dd;
        }
        if (d < 0) {
            d = 0;
            dd = -dd;
        }

        if (count>=r/10){
            a+=da;
            b+=db;
        }
        if (count>=r/5){
            c+=dc;
            d+=dd;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }
}
