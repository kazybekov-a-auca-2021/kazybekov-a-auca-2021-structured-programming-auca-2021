import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = scan.nextInt();
        int hours = minutes/60;
        int days = hours/24;
        int years = days/365;
        days%=365;
        System.out.printf("%d minutes is approximately %d years and %d days%n",minutes,years,days);
    }
}
