import java.util.Scanner;

public class URI1040 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat(), b = scan.nextFloat(), c = scan.nextFloat(), d = scan.nextFloat();
        float media = (float) ((a * 2.0 + b * 3.0 + c * 4.0 + d * 1.0) / 10);
        System.out.printf("Media: %.1f\n", media);
        if (media >= 7.0) System.out.println("Aluno aprovado.");
        else if (media < 5.0) System.out.println("Aluno reprovado.");
        else {
            System.out.println("Aluno em exame.");
            float examScore = (float) (media + 1.0);
            System.out.printf("Nota do exame: %.1f\n", examScore);
            float finalMedia = (float) ((media + examScore) / 2.0);
            if (finalMedia >= 5.0) System.out.println("Aluno aprovado.");
            else System.out.println("Aluno reprovado.");
            System.out.printf("Media final: %.1f\n", finalMedia);
        }
    }
}
