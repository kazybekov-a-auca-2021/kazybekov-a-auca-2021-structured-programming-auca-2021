import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = scan.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = scan.nextInt();

        elapsedDays %= 7;
        int future = today + elapsedDays;
        String t = "", f = "";

        //Setting today
        if (today == 0) {
            t = "Sunday";
        } else if (today == 1) {
            t = "Monday";
        } else if (today == 2) {
            t = "Tuesday";
        } else if (today == 3) {
            t = "Wednesday";
        } else if (today == 4) {
            t = "Thursday";
        } else if (today == 5) {
            t = "Friday";
        } else if (today == 6) {
            t = "Saturday";
        }

        //Setting future weekday
        if (future == 0) {
            f = "Sunday";
        } else if (future == 1) {
            f = "Monday";
        } else if (future == 2) {
            f = "Tuesday";
        } else if (future == 3) {
            f = "Wednesday";
        } else if (future == 4) {
            f = "Thursday";
        } else if (future == 5) {
            f = "Friday";
        } else if (future == 6) {
            f = "Saturday";
        }

        System.out.printf("Today is %s and the future day is %s", t, f);
    }
}
