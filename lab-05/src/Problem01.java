import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double sum = n, amount = 0;
        while (n!=0){
            n = scan.nextDouble();
            sum+=n;
            amount++;
        }
        if (sum!=0){
            double average = sum/amount;
            System.out.printf("The arithmetic mean is %.1f\n",average);
        } else {
            System.out.println("Nothing to calculate");
        }
    }
}
