import java.util.Scanner;
public class Main07{
    static void main(int r,int c,long arr[][]){
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i % 2 == 0){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print(arr[i][c - 1 - j]+" ");
                }
            }
            System.out.println();
        }
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