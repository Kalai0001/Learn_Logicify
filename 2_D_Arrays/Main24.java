import java.util.Scanner;
public class Main24{
    static void main(int r1,int c1,long arr1[][],long target){
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                arr1[i][j] = target * arr1[i][j];
            }
        }
        
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                System.out.print(arr1[i][j] + " ");
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
        long target = sc.nextLong();
        main(r1,c1,arr1,target);
        sc.close();
    }
}