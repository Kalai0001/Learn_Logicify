import java.util.Scanner;
public class Main16{
    static void main(int r,int c,long arr[][]){
        int n = Math.min(r,c);
        long leftdiagonal = 0;
        for(int i = 0 ; i < r && i < c; i++){
            leftdiagonal = leftdiagonal + arr[i][i];
        }
        
        long rightdiagonal = 0;
        for(int i = 0 ; i < r && i < c; i++){
            rightdiagonal = rightdiagonal + arr[i][c - i - 1];
        }
        
        // if(rightdiagonal == 0){
        //     System.out.printf("-1 -1");
        //     return;
        // }
        long quotient = leftdiagonal / rightdiagonal;
        long remainder  = leftdiagonal % rightdiagonal;
        
        System.out.printf("%d %d",quotient,remainder);
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