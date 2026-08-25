
import java.util.Scanner;
public class Main14{
    static void main(int r,int c,long arr[][]){
        
        long ans1 = Long.MAX_VALUE;
        for(int i = 0; i < r; i++){
            long minsum = 0;
            for(int j = 0; j < c; j++){
                minsum = minsum + arr[i][j];
            }
            if(minsum < ans1){
                ans1 = minsum;
            }
        }
        long ans2 = Long.MIN_VALUE;
        for(int i = 0; i < c; i++){
            long maxsum = 0;
            for(int j = 0; j < r; j++){
                maxsum = maxsum + arr[j][i];
            }
            if(maxsum > ans2){
                ans2 = maxsum;
            }
        }
        System.out.printf("%d %d",ans1,ans2);
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