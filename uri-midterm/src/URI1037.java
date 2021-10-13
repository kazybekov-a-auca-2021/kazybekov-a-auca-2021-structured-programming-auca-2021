import java.util.Scanner;

public class URI1037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        if(n>=0 && n<=25.0) System.out.println("Intervalo [0,25]");
        else if(n>25.0 && n<=50.0) System.out.println("Intervalo (25,50]");
        else if(n>50.0 && n<=75.0) System.out.println("Intervalo (50,75]");
        else if(n>75.0 && n<=100.0) System.out.println("Intervalo (75,100]");
        else System.out.println("Fora de intervalo");
    }
}
