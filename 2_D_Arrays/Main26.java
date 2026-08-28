import java.util.Scanner;
public class Main26{
    static void main(int r,int c,long arr[][]){
        
        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                for(int k = 0; k < j; k++){
                    if(arr[j][i] < arr[k][i]){
                        long tmp = arr[j][i];
                        arr[j][i] = arr[k][i];
                        arr[k][i] = tmp;
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
