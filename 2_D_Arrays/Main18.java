import java.util.Scanner;
public class Main18{
    static void main(int r,int c,long arr[][],long target){
        
        boolean flag = false;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] == target){
                    System.out.println(i +" "+ j);
                    flag = true;
                    return;
                }
            }
        }
        if(flag){
            System.out.print(-1);
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
        long target = sc.nextLong();
        main(r,c,arr,target);
        sc.close();
    }
}