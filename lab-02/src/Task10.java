import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();
        int seconds = 31536000*years;
        int birth = seconds/7;
        int death = seconds/13;
        int immigrant = seconds/45;
        int result = 312032486+birth-death+immigrant;
        System.out.printf("The population in %d years is %d",years,result);
    }
}
