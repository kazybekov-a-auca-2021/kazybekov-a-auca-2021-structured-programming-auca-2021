import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = (int) (Math.random() * 13) + 1;
        int s = (int) (Math.random() * 4) + 1;

        String rank;
        String suit = "";
        rank = String.valueOf(r);

        switch (r) {
            case 1:
                rank = "Ace";
                break;
            case 11:
                rank = "Jack";
                break;
            case 12:
                rank = "Queen";
                break;
            case 13:
                rank = "King";
                break;
        }
        switch (s) {
            case 1:
                suit = "Clubs";
                break;
            case 2:
                suit = "Diamonds";
                break;
            case 3:
                suit = "Hearts";
                break;
            case 4:
                suit = "Spades";
                break;
        }

        System.out.printf("The card you picked is %s of %s", rank, suit);
    }
}
