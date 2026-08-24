import java.util.Scanner;
public class Main10{
    static void main(int r,int c,long arr[][]){
        long max = Long.MIN_VALUE;
        int r1 = 0;
        int c1 = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    r1 = i;
                    c1 = j;
                }
            }
        }
        System.out.printf("%d %d %d",max,r1,c1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        long arr[][] = new long[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextLong();
            }
        }
        main(r,c,arr);
        sc.close();
    }
}