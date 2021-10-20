import java.util.Scanner;

public class URI1045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble();
        double max = a;
        if(b>max) max=b;
        if(c>max) max=c;
        double min = a;
        if(b<min) min=b;
        if(c<min) min=c;
        double mid = 0;
        if((a>=b && a<=c) || (a>=c && a<=b)) mid = a;
        if((b>=a && b<=c) || (b>=c && b<=a)) mid = b;
        if((c>=b && c<=a) || (c>=a && c<=b)) mid = c;
        a = max; b = mid; c = min;
        double ato = a*a , bto = b*b, cto = c*c;
        if(a>=b+c) System.out.println("NAO FORMA TRIANGULO");
        else if(ato==(bto+cto)) System.out.println("TRIANGULO RETANGULO");
        else if(ato>(bto+cto)) System.out.println("TRIANGULO OBTUSANGULO");
        else if(ato<(bto+cto)) System.out.println("TRIANGULO ACUTANGULO");
        if(a==b && a==c) System.out.println("TRIANGULO EQUILATERO");
        if((a==b && a!=c) || (a==c && a!=b) || (b==c && b!=a)) System.out.println("TRIANGULO ISOSCELES");
    }
}
