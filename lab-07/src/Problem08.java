import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] set = new double[10];

        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < set.length; i++) {
            set[i] = scan.nextDouble();
        }

        System.out.printf("The smallest element is in the %d position of the set", indexSmallestElement(set));
    }

    public static int indexSmallestElement(double[] set) {
        double min = set[0];
        int index = 0;

        for (int i = 0; i < set.length; i++) {
            if (set[i] < min) {
                index = i;
            }
        }
        return index;
    }
}
