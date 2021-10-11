import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 year in seconds is 31536000");
        int amountOfSeconds = 31536000;
        int birth = 31536000/7;
        int death = 31536000/13;
        int immigrant = 31536000/45;

        int firstYear = 312032486;
        System.out.println("First year: " + firstYear);
        System.out.println();
        int secondYear = firstYear+birth-death+immigrant;
        System.out.println("Second year: " + secondYear);
        System.out.println("Population grew for " + (secondYear-firstYear));
        System.out.println();
        int thirdYear = secondYear+birth-death+immigrant;
        System.out.println("Third year: " + thirdYear);
        System.out.println("Population grew for " + (thirdYear-secondYear));
        System.out.println();
        int fourthYear = thirdYear+birth-death+immigrant;
        System.out.println("Fourth year: " + fourthYear);
        System.out.println("Population grew for " + (fourthYear-thirdYear));
        System.out.println();
        int fifthYear = fourthYear+birth-death+immigrant;
        System.out.println("Fifth year: " + fifthYear);
        System.out.println("Population grew for " + (fifthYear-fourthYear));
    }
}
