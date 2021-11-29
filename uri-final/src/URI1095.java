public class URI1095 {
    public static void main(String[] args) {
        int i = 1, j = 60;
        System.out.printf("I=%d J=%d\n",i,j);
        do {
            i+=3;
            j-=5;
            System.out.printf("I=%d J=%d\n",i,j);
        } while (j!=0);
    }
}
