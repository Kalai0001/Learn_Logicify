import java.util.Scanner;

public class Main06 {
    
    static void main(int r, int c, long arr[][]) {

        int z = r + c - 1;
        int a = c - 1;
        int b = 1;
        
        for (int i = 0; i < z; i++) {

            if (i < c) {
                int k = a;
                for (int j = 0; j <= i && j < r; j++) {
                    System.out.print(arr[j][k] + " ");
                    k++;
                }
                a--;
            }
            else{
                int k = b;
                for (int j = 0; j < c && k < r; j++) {
                    System.out.print(arr[k][j] + " ");
                    k++;
                }
                b++;
            }
            System.out.println();
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        long arr[][] = new long[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextLong();
            }
        }
        main(r, c, arr);
        sc.close();
    }
}