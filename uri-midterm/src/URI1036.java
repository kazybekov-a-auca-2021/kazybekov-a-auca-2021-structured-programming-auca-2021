import java.util.Scanner;

public class URI1036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble(), b = scan.nextDouble() , c = scan.nextDouble();
        double dis = (b*b)-(4.0*a*c);
        if(dis<0 || a==0) System.out.println("Impossivel calcular");
        else{
            dis = Math.sqrt(dis);
            double r1 = (-b+dis)/(2.0*a);
            double r2 = (-b-dis)/(2.0*a);
            System.out.printf("R1 = %.5f%nR2 = %.5f%n",r1,r2);
        }
    }
}
