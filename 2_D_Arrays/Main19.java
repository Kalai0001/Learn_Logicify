import java.util.*;
public class Main19{
    static void main(int r,int c,long arr[][],long target){
        
        long newarr[] = new long[r * c];
        int a = 0;
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                newarr[a++] = arr[i][j];
            }
        }
        
        Arrays.sort(newarr);
        long count = 1;
        for(int i = 0; i < a; i++){
            if(count == target){
                System.out.print(newarr[i]);
                return;
            }
            count++;
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