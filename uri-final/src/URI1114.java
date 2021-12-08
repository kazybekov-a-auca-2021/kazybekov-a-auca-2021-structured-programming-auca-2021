import java.util.Scanner;

public class URI1114 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        do {
            n = scan.nextInt();
            if (n != 2002) {
                System.out.println("Senha Invalida");
            } else {
                System.out.println("Acesso Permitido");
            }
        } while (n != 2002);
    }
}
