public class URI1155 {
    public static void main(String[] args) {
        double s = 1;
        for (double i = 2; i <= 100; i++) {
            s+=1.0/i;
        }
        System.out.printf("%.2f\n",s);
    }
}
