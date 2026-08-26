import java.util.Scanner;
public class Main22{
    static void main(int r,int c,long arr1[][],long arr2[][]){
        long ans[][] = new long[r][c];
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                ans[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        long arr1[][] = new long[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr1[i][j] = sc.nextLong();
            }
        }
        long arr2[][] = new long[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr2[i][j] = sc.nextLong();
            }
        }
        main(r,c,arr1,arr2);
        sc.close();
    }
}