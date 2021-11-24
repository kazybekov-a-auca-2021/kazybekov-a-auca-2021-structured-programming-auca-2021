public class Problem07 {
    public static void main(String[] args) {

        int n = 0;
        int sum = 0;

        while (n <= 50) {
            n++;
            sum += n;
            if (sum > 300) {
                break;
            }
        }
        System.out.printf("The number is %d\n", n);
        System.out.printf("The sum is %d", sum);

        n = 0;
        sum = 0;

        while (n <= 50) {
            n++;
            sum += n;
            if (n == 8 || n == 9) {
                continue;
            }
        }
        System.out.printf("The number is %d", n);
        System.out.printf("The sum is %d", sum);
    }
}
