import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] set = new int[10];

        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < set.length; i++) {
            set[i] = scan.nextInt();
        }

        int length = eliminateDuplicates(set);

        for (int i = 0; i < length; i++) {
            System.out.print(set[i] + " ");
        }
    }

    public static int eliminateDuplicates(int[] set) {

        sorting(set);

        int[] temp = new int[set.length];
        int t = 0;

        for (int i = 0; i < set.length - 1; i++) {
            if (set[i] != set[i + 1]) {
                temp[t++] = set[i];
            }
        }
        temp[t++] = set[set.length - 1];

        if (t >= 0) System.arraycopy(temp, 0, set, 0, t);

        return t;
    }

    public static int[] sorting(int[] set) {

        for (int i = 0; i < set.length; i++) {
            int min = set[i], index = i;
            for (int j = i; j < set.length; j++) {
                if (set[j] < min) {
                    min = set[j];
                    index = j;
                }
            }
            set[index] = set[i];
            set[i] = min;
        }
        return set;
    }
}
// 0 1 3 5 9