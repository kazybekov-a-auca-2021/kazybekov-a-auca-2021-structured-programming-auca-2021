import java.util.Scanner;

public class URI1180 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] set = new int[n];

        for (int i = 0; i < n; i++) {
            set[i] = scan.nextInt();
        }

        System.out.printf("Menor valor: %d\n",set[getIndexOfMin(set,n)]);
        System.out.printf("Posicao: %d\n", getIndexOfMin(set,n));
    }

    public static int getIndexOfMin(int[] set, int n){
        int min = set[0];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if(set[i]<min){
                min = set[i];
                index = i;
            }
        }
        return index;
    }
}
