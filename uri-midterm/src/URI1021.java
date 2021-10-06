import java.util.Scanner;

public class URI1021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double banknote = scan.nextDouble();
        double l = banknote;
        int bank = (int)l;
        System.out.println("NOTAS:");
        if(bank>=100) System.out.println(bank/100 + " nota(s) de R$ 100.00");
        else System.out.println(0 + " nota(s) de R$ 100.00");
        bank=bank%100;
        if(bank>=50) System.out.println(bank/50 + " nota(s) de R$ 50.00");
        else System.out.println(0 + " nota(s) de R$ 50.00");
        bank=bank%50;
        if(bank>=20) System.out.println(bank/20 + " nota(s) de R$ 20.00");
        else System.out.println(0 + " nota(s) de R$ 20.00");
        bank=bank%20;
        if(bank>=10) System.out.println(bank/10 + " nota(s) de R$ 10.00");
        else System.out.println(0 + " nota(s) de R$ 10.00");
        bank=bank%10;
        if(bank>=5) System.out.println(bank/5 + " nota(s) de R$ 5.00");
        else System.out.println(0 + " nota(s) de R$ 5.00");
        bank=bank%5;
        if(bank>=2) System.out.println(bank/2 + " nota(s) de R$ 2.00");
        else System.out.println(0 + " nota(s) de R$ 2.00");
    }
}
