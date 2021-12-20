import java.util.Scanner;

public class URI1179 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] initial = new int[15];
        int[] evenSet = new int[15];
        int[] oddSet = new int[15];

        int even = 0, odd = 0;
        for (int i = 0; i < 15; i++) {
            initial[i] = scan.nextInt();
            if (initial[i] % 2 == 0) {
                evenSet[even] = initial[i];
                even++;
            } else {
                oddSet[odd] = initial[i];
                odd++;
            }

            if (even == 5){
                print("par[%d] = %d\n",evenSet,5);
                even = 0;
            }
            if (odd == 5){
                print("impar[%d] = %d\n",oddSet,5);
                odd = 0;
            }
            if (i == 14){
                print("impar[%d] = %d\n",oddSet,odd);
                print("par[%d] = %d\n",evenSet,even);
            }
        }
    }

    public static void print(String text, int[] set, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf(text, j, set[i]);
            j++;
        }
    }

}
