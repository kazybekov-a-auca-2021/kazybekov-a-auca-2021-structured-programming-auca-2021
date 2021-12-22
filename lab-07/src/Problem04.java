import java.util.Random;

public class Problem04{
    static final int NUM_SHUFFLE_MOVES = 500;
    static Random rnd = new Random();
    static int[][] gameBoard = new int[4][4];
    static int emptyRow, emptyCol;

    public static void main(String[] args) {
        initBoard();
        shuffleBoard();
        printBoard();
    }
    private static void shuffleBoard(){
        int nMove = 0;
        while (nMove<=NUM_SHUFFLE_MOVES){
            int dir = rnd.nextInt(4);
            int dc = 0;
            int dr = 0;
            switch (dir) {
                case 0 -> dr = -1;
                case 1 -> dc = 1;
                case 2 -> dr = 1;
                case 3 -> dc = -1;
            }
            if (emptyRow+dr>= 0 && emptyRow+dr<4 && emptyCol+dc>=0 && emptyCol+dc<4){
                gameBoard[emptyRow][emptyCol] = gameBoard[emptyRow+dr][emptyCol+dc];
                emptyRow += dr;
                emptyCol += dc;
                gameBoard[emptyRow][emptyCol] = 16;
                nMove++;
            }
        }
    }

    private static void initBoard(){
        int num = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gameBoard[i][j] = num;
                num++;
            }
        }
        emptyCol = 3;
        emptyRow = 3;
    }

    private static void printBoard(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gameBoard[i][j] == 16) continue;
                System.out.printf("%3d",gameBoard[i][j]);
            }
            System.out.println();
        }
    }
}