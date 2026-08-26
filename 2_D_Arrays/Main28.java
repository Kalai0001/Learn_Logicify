import java.util.Scanner;
public class Main28{
    static void main(int r,int c,long arr[][]){
        
        long firstrow = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                firstrow = firstrow + arr[i][j];
            }
            break;
        }
        
        long rightdiagonal = 0;
        for(int i = 1;i < r - 1; i++){
            rightdiagonal = rightdiagonal + arr[i][c - i - 1];
        }
        
        long lastrow = 0;
        for(int i = r - 1; i < r; i++){
            for(int j = 0; j < c; j++){
                lastrow = lastrow + arr[i][j];
            }
            break;
        }
        
        long z_ans = firstrow + rightdiagonal + lastrow;
        System.out.printf("%d",z_ans);
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