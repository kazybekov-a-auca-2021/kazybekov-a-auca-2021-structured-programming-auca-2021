import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A four-digit integer? ");
        int n = scan.nextInt();
        int a = n/1000;
        n%=1000;
        int b = n/100;
        n%=100;
        int c = n/10;
        n%=10;
        int sum = a+b+c+n;
        System.out.println("The sum of all digits is " + sum);
    }
}
