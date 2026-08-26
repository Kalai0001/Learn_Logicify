import java.util.Scanner;
public class Main25{
    static void main(int r,int c,long arr[][]){
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                for(int k = 0; k < j; k++){
                    if(arr[i][j] < arr[i][k]){
                        long tmp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = tmp;
                    }
                }
            }
        }
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        long arr[][] = new long[r][c];
        for(int i = 0; i< r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextLong();
            }
        }
        main(r,c,arr);
        sc.close();
    }
}