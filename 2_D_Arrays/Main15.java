import java.util.Scanner;
public class Main15{
    static void main(int r,int c,long arr[][]){
        
        long ans = Long.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < r; i++){
            long count = 0;
            for(int j = 0; j < c; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(count > ans){
                ans = count;
                index = i;
            }
        }
        System.out.printf("%d",index);
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