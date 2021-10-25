import java.util.Scanner;

public class URI1046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt(), end = scan.nextInt();
        if(start==end) System.out.println("O JOGO DUROU 24 HORA(S)");
        else if(start<end) System.out.println("O JOGO DUROU "+(end-start)+" HORA(S)");
        else System.out.println("O JOGO DUROU "+(24-start+end)+" HORA(S)");
    }
}
