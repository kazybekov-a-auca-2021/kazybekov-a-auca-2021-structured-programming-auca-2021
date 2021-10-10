import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("a    a^2    a^3");
        for(int i=1;i<=n;i++){
            System.out.println(i+"    "+pow(i,2)+"      "+pow(i,3));
        }
    }
    public static int pow(int n, int amount){
        int pow = 1;
        for(int i=1;i<=amount;i++){
            pow*=n;
        }
        return pow;
    }
}
