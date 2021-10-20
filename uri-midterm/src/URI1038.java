import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int code = scan.nextInt();
        double amount = scan.nextDouble();
        switch(code){
            case 1:
                System.out.printf("Total: R$ %.2f\n", amount*4.00);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", amount*4.50);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", amount*5.00);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", amount*2.00);
                break;
            default:
                System.out.printf("Total: R$ %.2f\n", amount*1.50);
                break;
        }
    }
}
