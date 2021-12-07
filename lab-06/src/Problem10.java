public class Problem10 {
    public static void main(String[] args) {
        double n = 20;
        sumSeries(n);
    }

    public static void sumSeries(double n) {
        System.out.println("   i          m(i)");
        System.out.println("_____________________");
        for (double i = 1; i <= n; i++) {
            double sum = 0.0;
            for (double j = 1; j <= i; j++) {
                sum += j / (j + 1);
            }
            System.out.printf("%4.0f          %.4f\n", i, sum);
        }
    }
}
