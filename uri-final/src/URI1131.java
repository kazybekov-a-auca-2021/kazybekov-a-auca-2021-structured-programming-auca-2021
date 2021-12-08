import java.util.Scanner;

public class URI1131 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inter, gremio, check, total = 0, i = 0, g = 0, equal = 0;

        do {
            inter = scan.nextInt();
            gremio = scan.nextInt();
            if (inter == gremio) {
                equal++;
            } else if (inter > gremio) {
                i++;
            } else {
                g++;
            }
            check = scan.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");
            total++;
        } while (check != 2);

        System.out.printf("%d grenais\n", total);
        System.out.printf("Inter:%d\n", i);
        System.out.printf("Gremio:%d\n", g);
        System.out.printf("Empates:%d\n", equal);
        if (equal == total) {
            System.out.println("Não houve vencedor");
        } else if (i > g) {
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Gremio venceu mais");
        }
    }
}
