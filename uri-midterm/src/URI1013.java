import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        int max = (a+b+(Math.abs(a-b)))/2;
        max = (max+c+(Math.abs(max-c)))/2;
        System.out.println(max + " eh o maior");
    }
}
