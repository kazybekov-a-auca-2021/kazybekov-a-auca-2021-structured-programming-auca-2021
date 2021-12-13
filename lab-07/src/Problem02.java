import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Month: ");
        int month = scan.nextInt();
        System.out.print("Year: ");
        int year = scan.nextInt();
    }

    public static int numberOfDays(int month, int year){
        if(month == 2 && (year%400==0 || (year%4==0 && year%100!=0))){
            return 29;
        }

        int days = 0;
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 2 -> days = 28;
            case 4, 6, 9, 11 -> days =30;
        }

        return days;
    }
}
