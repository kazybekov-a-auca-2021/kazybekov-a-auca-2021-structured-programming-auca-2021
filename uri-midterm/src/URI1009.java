import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        double inSalary = scan.nextDouble(), sales = scan.nextDouble();
        double finalSalary = inSalary+(sales*0.15);
        System.out.printf("TOTAL = R$ %.2f\n",finalSalary);
    }
}
