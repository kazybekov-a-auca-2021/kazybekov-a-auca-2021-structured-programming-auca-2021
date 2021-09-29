import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double salary = scan.nextDouble(), hours = scan.nextDouble();
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", (salary*hours));
    }
}
