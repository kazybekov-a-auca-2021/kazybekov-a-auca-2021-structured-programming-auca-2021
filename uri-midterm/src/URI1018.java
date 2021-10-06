import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int banknote = scan.nextInt();
        System.out.println(banknote);
        if(banknote>=100) System.out.println(banknote/100 + " nota(s) de R$ 100,00");
        else System.out.println(0 + " nota(s) de R$ 100,00");
        banknote=banknote%100;
        if(banknote>=50) System.out.println(banknote/50 + " nota(s) de R$ 50,00");
        else System.out.println(0 + " nota(s) de R$ 50,00");
        banknote=banknote%50;
        if(banknote>=20) System.out.println(banknote/20 + " nota(s) de R$ 20,00");
        else System.out.println(0 + " nota(s) de R$ 20,00");
        banknote=banknote%20;
        if(banknote>=10) System.out.println(banknote/10 + " nota(s) de R$ 10,00");
        else System.out.println(0 + " nota(s) de R$ 10,00");
        banknote=banknote%10;
        if(banknote>=5) System.out.println(banknote/5 + " nota(s) de R$ 5,00");
        else System.out.println(0 + " nota(s) de R$ 5,00");
        banknote=banknote%5;
        if(banknote>=2) System.out.println(banknote/2 + " nota(s) de R$ 2,00");
        else System.out.println(0 + " nota(s) de R$ 2,00");
        banknote=banknote%2;
        if(banknote>=1) System.out.println(banknote/1 + " nota(s) de R$ 1,00");
        else System.out.println(0 + " nota(s) de R$ 1,00");
    }
}
