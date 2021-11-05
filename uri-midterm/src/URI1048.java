import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salary = scan.nextDouble();

        if (salary > 0 && salary <= 400.0) {
            double newSalary = salary * 0.15 + salary;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", salary * 0.15);
            System.out.println("Em percentual: 15 %");
        } else if (salary > 400 && salary <= 800) {
            double newSalary = salary * 0.12 + salary;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", salary * 0.12);
            System.out.println("Em percentual: 12 %");
        } else if (salary > 800 && salary <= 1200) {
            double newSalary = salary * 0.10 + salary;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", salary * 0.10);
            System.out.println("Em percentual: 10 %");
        } else if (salary > 1200 && salary <= 2000) {
            double newSalary = salary * 0.07 + salary;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", salary * 0.07);
            System.out.println("Em percentual: 7 %");
        } else {
            double newSalary = salary * 0.04 + salary;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", salary * 0.04);
            System.out.println("Em percentual: 4 %");
        }
    }
}
