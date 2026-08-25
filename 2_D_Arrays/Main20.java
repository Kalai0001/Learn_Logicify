import java.util.*;
public class Main20{
    static void main(int r,int c,long arr1[][],long arr2[][]){
        
        boolean flag = true;
        for(int i =0; i< r; i++){
            for(int j = 0; j <c; j++){
                if(arr1[i][j] != arr2[i][j]){
                    flag = false;
                    System.out.printf("Not Equal");
                    return;
                }
            }
        }
        
        if(flag){
            System.out.printf("Equal");
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