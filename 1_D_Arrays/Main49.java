import java.util.*;
public class Main49{
    static void main(int n,long arr[]){
        int max = 0;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > 0){
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 0;
            }
        }
        System.out.println(max);
        
        // for(int i = 0 ; i < n ; i++){
        //     for(int j =i ; j < n ; j++){
        //         int count = 0;
        //         for(int k = i ; k <= j ; k++){
        //             // System.out.print(arr[k] +" ");
        //             if(arr[k] > 0){
        //                 count++;
        //             }
        //             else{
        //                 count = 0;
        //             }
        //         }
        //         max = Math.max(max,count);
        //         // System.out.println();
        //     }
        // }
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextLong();
        }
        main(n , arr);
        sc.close();
    }
}