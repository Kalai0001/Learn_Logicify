import java.util.Scanner;
public class Main30{
    static void main(int r,int c,long arr[][]){
        boolean flag = true;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] != arr[j][i]){
                    flag = false;
                    System.out.printf("No");
                    return;
                }
            }
        }
        if(flag){
            System.out.printf("Yes");
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