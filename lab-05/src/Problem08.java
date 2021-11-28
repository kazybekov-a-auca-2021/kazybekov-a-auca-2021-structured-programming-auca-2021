public class Problem08 {
    public static void main(String[] args) {
        System.out.println("                 Multiplication Table      ");
        System.out.print("    ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("   " + i);
        }
        System.out.println("\n________________________________________");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d",j*i);
            }
            System.out.println();
        }
    }
}
