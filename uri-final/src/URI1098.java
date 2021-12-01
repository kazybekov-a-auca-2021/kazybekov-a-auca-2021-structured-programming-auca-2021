public class URI1098 {
    public static void main(String[] args) {
        double k = 1, l = 2, m = 3;
        for (double i = 0; i <= 2; i += 0.2) {
            if((i==0.0) || (i==1.0) || (i==2.0)) {
                System.out.printf("I=%.0f J=%.0f\n", i, k);
                System.out.printf("I=%.0f J=%.0f\n", i, l);
                System.out.printf("I=%.0f J=%.0f\n", i, m);
            } else {
                System.out.printf("I=%.1f J=%.1f\n", i, k);
                System.out.printf("I=%.1f J=%.1f\n", i, l);
                System.out.printf("I=%.1f J=%.1f\n", i, m);
            }
            k += 0.2;
            l += 0.2;
            m += 0.2;
        }
    }
}
