import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sec = scan.nextInt();
        int hour = sec/3600; sec%=3600;
        int minutes = sec/60; sec%=60;
        System.out.println(hour+":"+minutes+":"+sec);
    }
}
