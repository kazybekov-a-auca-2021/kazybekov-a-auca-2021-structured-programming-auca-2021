import java.util.Scanner;

public class URI1827 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        try {
            while (scan.hasNextLine()){
                n = scan.nextInt();
                int[][] set = new int[n][n];
                grid(n,set);
            }
        } catch (Exception e){
            System.exit(1);
        }

    }

    public static void grid(int n, int[][] set){
        int inner = n/3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(n%2!=0){
                    if (i==(n-1)/2 && j==(n-1)/2){
                        set[i][j] = 4;
                    } else if (i==j){
                        set[i][j] = 2;
                    } else if(j==n-i-1){
                        set[i][j] = 3;
                    } else {
                        set[i][j] = 0;
                    }
                } else {
                    if((i >inner || i<n-inner) && j>inner && j<n-inner ){
                        set[i][j] = 1;
                    } else if(i==(n-1)/2 || i==(n-1)/2+1){
                        if(j==(n-1)/2 || j==(n-1)/2+1){
                            set[i][j] = 4;
                        }
                    } else if (i==j){
                        set[i][j] = 2;
                    } else if(j==n-i-1){
                        set[i][j] = 3;
                    } else {
                        set[i][j] = 0;
                    }
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(set[i][j]);
            }
            System.out.println();
        }

        System.out.println();
    }
}
