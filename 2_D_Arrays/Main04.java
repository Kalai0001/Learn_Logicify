import java.util.Scanner;
public class Main04{
    static void main(int r,int c,long arr[][]){
        int z = r + c - 1;
        int num = 1;

        for (int i = 0; i < z; i++) {
            int x = i;
            if (i < r) {
                for (int j = 0; j <= i && j < c; j++) {
                    System.out.print(arr[x][j] + " ");
                    x--;
                }
            }
            else{
                int k = i - num;
                for(int j = num; j < c ; j++){
                    System.out.print(arr[k][j] + " ");
                    k--;
                }
                num++;
                
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        long arr[][] = new long[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j< c; j++){
                arr[i][j] = sc.nextLong();
            }
        }
        main(r,c,arr);
        sc.close();
    }
}