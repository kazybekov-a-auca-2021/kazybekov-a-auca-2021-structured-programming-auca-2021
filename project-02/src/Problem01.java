import processing.core.PApplet;

public class Problem01 extends PApplet {
    static final int DESK_SIZE = 400;

    float x, y, w, h;
    int squares, square_size, moves;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2f - width / 8f;
        y = height / 4f;
        squares = 4;
        square_size = DESK_SIZE / squares;
        moves = 0;
        textAlign(CENTER, CENTER);
    }

    public void draw() {
        background(0, 0, 0);
        fill(255, 255, 0);
        textSize(70);
        text("Game 15", width / 2f, height / 10f);
        textSize(50);
        text("Moves: " + moves, width / 2f + width / 3f, height / 2f);
        textSize(60);
        text("Start/Restart: Enter", width / 2f, height - height / 10f);
        fill(0, 0, 0);
        stroke(200, 200, 200);
        square(x, y, DESK_SIZE);

        for (int i = 0; i < squares; i++) {
            for (int j = 0; j < squares; j++) {
                w = x + i * square_size;
                h = y + j * square_size;
                fill(0, 0, 255);
                square(w, h, square_size);
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }
}
