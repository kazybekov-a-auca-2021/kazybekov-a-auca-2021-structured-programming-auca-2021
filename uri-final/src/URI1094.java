import java.util.Scanner;

public class URI1094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfTests = scan.nextInt();
        double rabbit = 0, rat = 0, frog = 0, all = 0;

        for (int i = 0; i < numberOfTests; i++) {
            double amountOfAnimals = scan.nextInt();
            char animal = scan.next().charAt(0);
            if (animal == 'C') {
                rabbit += amountOfAnimals;
            } else if (animal == 'R') {
                rat += amountOfAnimals;
            } else if (animal == 'S') {
                frog += amountOfAnimals;
            }
            all += amountOfAnimals;
        }

        System.out.printf("Total: %.0f cobaias%n", all);
        System.out.printf("Total de coelhos: %.0f%n", rabbit);
        System.out.printf("Total de ratos: %.0f%n", rat);
        System.out.printf("Total de sapos: %.0f%n", frog);
        rabbit = (rabbit * 100.0) / all;
        rat = (rat * 100.0) / all;
        frog = (frog * 100.0) / all;
        System.out.printf("Percentual de coelhos: %.2f %%\n", rabbit);
        System.out.printf("Percentual de ratos: %.2f %%\n", rat);
        System.out.printf("Percentual de sapos: %.2f %%\n", frog);
    }
}
