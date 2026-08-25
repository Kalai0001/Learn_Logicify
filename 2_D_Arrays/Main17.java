import java.util.Scanner;
public class Main17{
    static void main(int r,int c,long arr[][]){
        
        long leftdiagonal = 0;
        for(int i = 0 ; i < r && i < c; i++){
            leftdiagonal = leftdiagonal + arr[i][i];
        }
        
        long rightdiagonal = 0;
        for(int i = 0 ; i < r && i < c; i++){
            rightdiagonal = rightdiagonal + arr[i][c - i - 1];
        }
        
        long ans = Math.abs(leftdiagonal - rightdiagonal);
        
        System.out.printf("%d",ans);
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