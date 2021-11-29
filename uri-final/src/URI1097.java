public class URI1097 {
    public static void main(String[] args) {
        int k = 7, l = 6, m = 5;
        for (int i = 1; i <= 9; i += 2) {
            System.out.printf("I=%d J=%d\n", i, k);
            System.out.printf("I=%d J=%d\n", i, l);
            System.out.printf("I=%d J=%d\n", i, m);
            k += 2;
            l += 2;
            m += 2;
        }
    }
}
