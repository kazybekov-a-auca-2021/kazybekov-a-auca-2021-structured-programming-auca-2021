import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[101];

        int number = scan.nextInt();

        arr[number]++;
        int sum = number , amount = 1;

        while (number>=0){
            number = scan.nextInt();
            arr[number]++;
            sum+=number;
            amount++;
        }

        int average = sum/amount;


    }
}
