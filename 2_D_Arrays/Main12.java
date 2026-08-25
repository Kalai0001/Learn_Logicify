import java.util.Scanner;
public class Main12{
    static void main(int r,int c,long arr[][]){
        
        for(int i = 0; i < c; i++){
            long min = Long.MAX_VALUE;
            for(int j = 0; j < r; j++){
                if(arr[j][i] < min){
                    min = arr[j][i];
                }
            }
            System.out.print(min + " ");
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