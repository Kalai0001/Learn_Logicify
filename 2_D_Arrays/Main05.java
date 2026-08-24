import java.util.Scanner;

public class Main05 {
    static void main(int r, int c, long arr[][]) {

        int z = r + c - 1;
        int num = 1;
        for (int i = 0; i < z; i++) {
            int x = i;
            if (i < c) {
                for (int j = 0; j <= i && j < r; j++) {
                    System.out.print(arr[j][x] + " ");
                    x--;
                }
            }
            else{
                int y = c- 1;
                for(int j = num; j < r && y >= 0; j++){
                    System.out.print(arr[j][y] + " ");
                    y--;
                }
                num++;
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