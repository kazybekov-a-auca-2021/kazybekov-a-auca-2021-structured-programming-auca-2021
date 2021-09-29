import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        r = r*r;
        double pi = 3.14159;
        pi = pi*r;
        pi = Math.round((pi*10000.0))/10000.0;
        System.out.println("A=" + fourFloat(pi));
    }
    public static String fourFloat(double pi){
        String s = Double.toString(pi);
        String s1 = "";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        if(s1.charAt(1)=='.') s=s+"000";
        if(s1.charAt(2)=='.') s=s+"00";
        if(s1.charAt(3)=='.') s=s+"0";

        return s;
    }
}
