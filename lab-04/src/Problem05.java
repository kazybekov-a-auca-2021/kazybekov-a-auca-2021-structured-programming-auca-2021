import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Year? ");
        int year = scan.nextInt();
        System.out.print("Month? ");
        int month = scan.nextInt();
        boolean days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            if (month == 2) {
                System.out.println("Number of days: 29");
            } else if (days) {
                System.out.println("Number of days: 31");
            } else {
                System.out.println("Number of days: 30");
            }
        } else {
            if (month == 2) {
                System.out.println("Number of days: 28");
            } else if (days) {
                System.out.println("Number of days: 31");
            } else {
                System.out.println("Number of days: 30");
            }
        }
    }
}
