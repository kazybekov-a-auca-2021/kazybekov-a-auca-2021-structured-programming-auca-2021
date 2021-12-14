import java.util.Scanner;

public class URI1150 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        int z;
        do {
            z = scan.nextInt();
        } while (z <= x);

        int counter = 1;
        int temp = x;
        do {
            counter++;
            x += (temp + 1);
            temp++;
        } while (x < z);
        System.out.println(counter);
    }
}
