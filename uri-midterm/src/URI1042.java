import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        int max = a;
        if(b>max) max=b;
        if(c>max) max=c;
        int min = a;
        if(b<min) min=b;
        if(c<min) min=c;
        int mid = 0;
        if(max>a && min<a) mid=a;
        if(max>b && min<b) mid=b;
        if(max>c && min<c) mid=c;
        System.out.println(min+"\n"+mid+"\n"+max);
        System.out.println();
        System.out.println(a+"\n"+b+"\n"+c);
    }
}
