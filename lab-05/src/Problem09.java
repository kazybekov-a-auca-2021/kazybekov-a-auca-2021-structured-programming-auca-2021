import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = scan.nextLine();
        String newOne = word;
        int wordLength = word.length();

        if (wordLength % 2 != 0) {
            word = word.substring(0, wordLength / 2) + word.substring(wordLength / 2 + 1, wordLength);
            wordLength -= 1;
        }

        String firstHalf = "", secondHalf = "";
        for (int i = 0; i < wordLength / 2; i++) {
            firstHalf += word.charAt(i);
        }
        for (int i = wordLength - 1; i >= wordLength / 2; i--) {
            secondHalf += word.charAt(i);
        }

        if (firstHalf.equals(secondHalf)) {
            System.out.printf("%s is a palindrome", newOne);
        } else {
            System.out.printf("%s is not a palindrome", newOne);
        }
    }
}