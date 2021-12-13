import java.util.Scanner;

public class Problem02 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            try {
                int month = readNumber("Month: ", "Incorrect message of the month", 1, 12);
                int year = readNumber("Year: ", "Incorrect message of the year", 1, 1000000);
                int days = numberOfDays(month, year);
                System.out.println("Number of days: " + days);
            } catch (Exception e) {
                System.out.println("Out of my job.");
                break;
            }
        }
    }

    public static int readNumber(String message, String error, int start, int finish) {
        System.out.print(message);

        int res = scan.nextInt();

        if (res < start || res > finish) {
            System.out.println(error);
            System.exit(1);
        }

        return res;
    }


    public static int numberOfDays(int month, int year) {

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int fin = days[month - 1];
        if (leapYear(year) && month == 2) {
            fin++;
        }
        return fin;
    }

    public static boolean leapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
