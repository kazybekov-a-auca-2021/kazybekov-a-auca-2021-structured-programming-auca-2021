public class Problem09 {
    public static void main(String[] args) {
        double pi , pi1;
        double initial = (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        pi = 4 * initial;
        pi1 = 4 * (initial + (1.0/13));
        System.out.println(pi + " " + pi1);
    }
}