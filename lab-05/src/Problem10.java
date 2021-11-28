public class Problem10 {
    public static void main(String[] args) {

        System.out.println("The first 50 prime numbers are");
        int number = 2, amount = 0;
        while (amount != 50) {
            int dividers = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    dividers++;
                }
            }
            if (dividers == 2) {
                System.out.print(number + " ");
                amount++;
                if (amount % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }
}
