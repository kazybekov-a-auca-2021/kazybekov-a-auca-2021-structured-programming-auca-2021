import java.util.Scanner;

public class URI1047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h1 = scan.nextInt();
        int m1 = scan.nextInt();
        int h2 = scan.nextInt();
        int m2 = scan.nextInt();

        int totalHours = h2-h1;
        if (totalHours<=0){
            totalHours = 24+totalHours;
        }

        int totalMinutes = m2-m1;
        if (totalMinutes<0){
            totalMinutes = 60+totalMinutes;
            totalHours-=1;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",totalHours,totalMinutes);
    }
}