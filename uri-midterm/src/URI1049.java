import java.util.Scanner;

public class URI1049 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String kingdom = scan.nextLine();
        String group = scan.nextLine();
        String type = scan.nextLine();

        if (kingdom.equals("vertebrado")) {
            if (group.equals("ave")) {
                if (type.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (type.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (group.equals("inseto")) {
                if (type.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (type.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
