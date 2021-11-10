import java.util.Scanner;

public class URI1060 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        for(int i=1;i<=6;i++){
            double number = scan.nextDouble();
            if(number>0){
                count++;
            }
        }
        System.out.println(count + " valores positivos");
    }
}
