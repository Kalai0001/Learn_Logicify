import java.util.Scanner;
public class Main23{
    static void main(int r1,int c1,long arr1[][],int r2,int c2,long arr2[][]){
        
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                long sum = 0;
                for(int k = 0; k < c1; k++){
                    sum = sum + arr1[i][k] * arr2[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        long arr1[][] = new long[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                arr1[i][j] = sc.nextLong();
            }
        }
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        long arr2[][] = new long[r2][c2];
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                arr2[i][j] = sc.nextLong();
            }
        }
        main(r1,c1,arr1,r2,c2,arr2);
        sc.close();
    }
}