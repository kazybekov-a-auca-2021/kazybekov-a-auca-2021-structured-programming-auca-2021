import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dias = scan.nextInt();
        int anos = dias/365; dias%=365;
        int mes = dias/30; dias%=30;
        System.out.println(anos + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
        //Lower Point
    }
}
