import java.util.Scanner;

public class Problem03 {
    public static void main (String[] args) {
        //code
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
