import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Your coordinate: ");
        int userPoint = scan.nextInt();

        int first = (int) (Math.random() * 200) - 100;
        System.out.println("Coordinate of the first point: " + first);

        int second = (int) (Math.random() * 200) - 100;
        System.out.println("Coordinate of the second point: " + second);

        first = abs(userPoint - first);
        second = abs(userPoint - second);

        if (first < second) {
            System.out.printf("1st point is closer. Distance %d", first);
        } else {
            System.out.printf("2nd point is closer. Distance %d", second);
        }

    }

    public static int abs(int x) {
        if (x < 0) {
            x = -x;
        }
        return x;
    }
}
