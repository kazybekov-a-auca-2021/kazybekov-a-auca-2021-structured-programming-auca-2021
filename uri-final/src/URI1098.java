public class URI1098 {
    public static void main(String[] args) {
        double k = 1, l = 2, m = 3;
        for (double i = 0; i <= 20; i += 2) {
            if((i/10==0.0) || (i/10==1.0) || (i/10==2.0)) {
                System.out.printf("I=%.0f J=%.0f\n", i/10, k);
                System.out.printf("I=%.0f J=%.0f\n", i/10, l);
                System.out.printf("I=%.0f J=%.0f\n", i/10, m);
            } else {
                System.out.printf("I=%.1f J=%.1f\n", i/10, k);
                System.out.printf("I=%.1f J=%.1f\n", i/10, l);
                System.out.printf("I=%.1f J=%.1f\n", i/10, m);
            }
            k += 0.2;
            l += 0.2;
            m += 0.2;
        }
    }
}
