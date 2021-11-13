import java.util.Scanner;

public class URI1071 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        if(a==b){
            System.out.println(0);
        } else {
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (a < 0) {
                a += 1;
            } else {
                a -= 1;
            }
            int sum = 0;
            for (int i = a; i < b; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}
