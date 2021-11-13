import java.util.Scanner;

public class URI1051 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double value = scan.nextDouble();
        if(value<=2000.0){
            System.out.println("Isento");
        } else if(value>2000.0 && value<=3000.0){
            System.out.printf("R$ %.2f\n",value*0.08);
        } else if(value>3000.0 && value<=4500.0){
            double in = 1000*0.08;
            double next = (value-3000.0)*0.18;
            System.out.printf("R$ %.2f\n",next+in);
        } else {
            double in = 1500 *0.18;
            double next = (value-4500.0)*0.28;
            System.out.printf("R$ %.2f\n",next+in);
        }
    }
}
