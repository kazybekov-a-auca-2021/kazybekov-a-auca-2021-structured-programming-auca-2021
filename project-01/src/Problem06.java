import processing.core.*;

public class Problem06 extends PApplet {
    static final float R_WIDTH = 200;
    static final float R_HEIGHT = 50;

    float alpha, beta, gamma;
    float red, green, blue, radius;
    float sunR, venusR, earthR, moonR;
    float rectX, rectY;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        alpha = random(0, 2 * PI);
        beta = random(0, 2 * PI);
        gamma = random(0, 2 * PI);

        textSize(30);
        textAlign(CENTER, CENTER);
    }

    public void draw() {
        background(0, 0, 0);

        radius = 5;
        red = 0;
        green = 0;
        blue = 0;
        sunR = 250;
        venusR = 100;
        earthR = 100;
        moonR = 50;

        String[] planets = {"Sun", "Venus", "Earth", "Moon"};

        for (int i = 0; i < planets.length; i++) {
            rectX = width / 2f + 550f - R_WIDTH / 2f;
            rectY = R_HEIGHT + i * R_HEIGHT;
            fill(0, 0, 255);
            stroke(255, 255, 255);
            rect(rectX, rectY, R_WIDTH, R_HEIGHT);

            if (mouseX >= rectX && mouseX <= rectX + R_WIDTH
                    && mouseY >= rectY && mouseY <= rectY + R_HEIGHT) {
                noFill();
                stroke(255, 0, 0);
                strokeWeight(1);
                switch (i){
                    case 0 -> circle(width/2f, height/2f, 250);
                    case 1 -> circle(width/2f,height/2f,360);
                    case 2 -> circle(width/2f,height/2f,680);
                }

                fill(255, 0, 0);
            } else {
                fill(255, 255, 255);
            }
            text(planets[i], rectX + R_WIDTH / 2f, rectY + R_HEIGHT / 2f);
        }
        float x = width/2f +550f - R_WIDTH/2f;
        float y = R_HEIGHT;
        pushMatrix();

        translate(width / 2f, height / 2f);

        noStroke();
        for (int i = 1; i <= 50; i++) {
            fill(red, green, 0);
            circle(0, 0, sunR);
            red += radius;
            green += radius;
            sunR -= radius;
        }

        noStroke();
        rotate(alpha);
        alpha += 0.01f;
        green = 0;
        fill(0, 0, 0);
        circle(180, 0, venusR);
        for (int i = 1; i <= 25; i++) {
            fill(0, green, blue);
            circle(180, 0, venusR);
            green += radius;
            blue += radius;
            venusR -= 4;
        }
        if (mouseX>=x && mouseX<=x+R_WIDTH){
            if (mouseY>=y+R_HEIGHT && mouseY<=y+2*R_HEIGHT){
                noFill();
                stroke(255,0,0);
                strokeWeight(1);
                circle(180,0,90);
            }
        }

        noStroke();
        rotate(beta);
        beta+=0.01f;
        blue = 0;
        for (int i = 0; i < 70; i++) {
            fill(0,0,blue);
            circle(340,0,earthR);
            blue+=radius;
            earthR -= 1;
        }
        if (mouseX>=x && mouseX<=x+R_WIDTH){
            if (mouseY>=y+2*R_HEIGHT && mouseY<=y+3*R_HEIGHT){
                noFill();
                stroke(255,0,0);
                strokeWeight(2);
                circle(340,0,80);
            }
        }
        noStroke();
        translate(340,0);
        rotate(gamma);
        gamma+=0.03f;
        red = 0; green = 0; blue = 0;
        for (int i = 0; i < 30; i++) {
            fill(red,green,blue);
            circle(80,0,moonR);
            red+=radius;
            green+=radius;
            blue+=5;
            moonR-=1;
        }
        if (mouseX>=x && mouseX<=x+R_WIDTH){
            if (mouseY>=y+3*R_HEIGHT && mouseY<=y+4*R_HEIGHT){
                noFill();
                stroke(255,0,0);
                strokeWeight(2);
                circle(0, 0, 160);
                circle(80, 0, 45);
            }
        }
        popMatrix();

    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}