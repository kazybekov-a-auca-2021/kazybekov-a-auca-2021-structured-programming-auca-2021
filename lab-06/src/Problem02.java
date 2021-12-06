import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Year: ");
        int year = scan.nextInt();

        System.out.print("Month: ");
        int month = scan.nextInt();

        System.out.println("Number of days: " + getDaysOfMonth(year, month));

    }

    public static int getDaysOfMonth(int year, int month) {
        if (isLeapYear(year) && month == 2) {
            return 29;
        }

        if (month == 2) {
            return 28;
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }

        return 30;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
