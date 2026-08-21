
import java.util.*;
public class Main42{
    static void main(int n,long arr[]){
        
      
        long max = 0;
        
        for(int i = 0; i < n; i++){
            long count = 1;
            for(int j = i + 1; j < n; j++){
                count++;
                if(arr[i] == arr[j]){
                    max = Math.max(max,count);
                }
            }
        }
        System.out.print(max);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }
        main(n,arr);
        sc.close();
    }
}