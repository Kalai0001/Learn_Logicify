import java.util.Scanner;
public class Main11{
    static void main(int r,int c,long arr[][]){
        
        for(int i = 0; i < r; i++){
            long max = Long.MIN_VALUE;
            for(int j = 0; j < c; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.print(max + " ");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        long arr[][] = new long[r][c];
        for(int i = 0 ;i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextLong();
            }
        }
        main(r,c,arr);
        sc.close();
    }
}