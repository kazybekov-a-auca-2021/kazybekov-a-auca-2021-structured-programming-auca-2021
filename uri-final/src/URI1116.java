import java.util.Scanner;

public class URI1116 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();

            if(y==0){
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f\n",x/y);
            }
        }
    }
}
