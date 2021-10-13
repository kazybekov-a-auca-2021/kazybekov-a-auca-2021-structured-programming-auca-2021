import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Length in inches? ");
        double in = scan.nextDouble();
        double cmL = in*2.54;
        System.out.printf("%.0f in. = %.2f cm.%n",in,cmL);
    }
}
