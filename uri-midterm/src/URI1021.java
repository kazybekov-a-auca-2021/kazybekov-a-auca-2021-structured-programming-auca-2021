import java.util.Scanner;

public class URI1021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        int n = (int)number;
        number = number-(double)n;
        System.out.println("NOTAS:");
        if(n>=100) System.out.println(n/100 + " nota(s) de R$ 100.00");
        else System.out.println("0 nota(s) de R$ 100.00");
        n%=100;
        if(n>=50) System.out.println(n/50 + " nota(s) de R$ 50.00");
        else System.out.println("0 nota(s) de R$ 50.00");
        n%=50;
        if(n>=20) System.out.println(n/20 + " nota(s) de R$ 20.00");
        else System.out.println("0 nota(s) de R$ 20.00");
        n%=20;
        if(n>=10) System.out.println(n/10 + " nota(s) de R$ 10.00");
        else System.out.println("0 nota(s) de R$ 10.00");
        n%=10;
        if(n>=5) System.out.println(n/5 + " nota(s) de R$ 5.00");
        else System.out.println("0 nota(s) de R$ 5.00");
        n%=5;
        if(n>=2) System.out.println(n/2 + " nota(s) de R$ 2.00");
        else System.out.println("0 nota(s) de R$ 2.00");
        n%=2;
        number+=(double)n;
        number=twoFloat(number);
        System.out.println("MOEDAS:");
        if(number>=1) System.out.println((int)number/1 + " moeda(s) de R$ 1.00");
        else System.out.println("0 moeda(s) de R$ 1.00");
        number%=1;
        number=twoFloat(number);
        if(number>=0.5) System.out.println((int)(number/0.5) + " moeda(s) de R$ 0.50");
        else System.out.println("0 moeda(s) de R$ 0.50");
        number%=0.5;
        number=twoFloat(number);
        if(number>=0.25) System.out.println((int)(number/0.25) + " moeda(s) de R$ 0.25");
        else System.out.println("0 moeda(s) de R$ 0.25");
        number%=0.25;
        number=twoFloat(number);
        if(number>=0.1) System.out.println((int)(number/0.1) + " moeda(s) de R$ 0.10");
        else System.out.println("0 moeda(s) de R$ 0.10");
        number%=0.1;
        number=twoFloat(number);
        if(number>=0.05) System.out.println((int)(number/0.05) + " moeda(s) de R$ 0.05");
        else System.out.println("0 moeda(s) de R$ 0.05");
        number%=0.05;
        number=twoFloat(number);
        if(number>=0.01) System.out.println((int)(number/0.01) + " moeda(s) de R$ 0.01");
        else System.out.println("0 moeda(s) de R$ 0.01");
    }
    public static Double twoFloat(double a){
        String s = String.format("%.2f", a);
        a = Double.parseDouble(s);
        return a;
    }
}
