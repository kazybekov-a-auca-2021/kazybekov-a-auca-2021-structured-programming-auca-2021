import java.util.Scanner;

public class URI1156 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double s = 1, even = 2;
        for (int i = 3; i <= 39 ; i+=2) {
            s+=i/even;
            even*=2;
        }
        System.out.printf("%.2f\n",s);
    }
}
