import java.util.*;
public class Main13{
    static void main(int r,int c,long arr[][]){
        
        long lowermax = Long.MIN_VALUE;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c && j <= i; j++){
                lowermax = Math.max(lowermax, arr[i][j]);
            }
        }

        // System.out.println(lowermax);
        
        long uppermin = Long.MAX_VALUE;
        for(int i = 0; i < r; i++){
            for(int j = i + 1; j < c; j++){
                uppermin = Math.min(uppermin, arr[i][j]);
            }
        }
        
        // System.out.println(uppermin);
        
        long ans = lowermax * uppermin;
        
        System.out.println(ans);
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