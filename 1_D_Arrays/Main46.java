import java.util.*;
public class Main46{
    static void main(int n,long arr[],long diff){
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n ; j++){
                if(Math.abs(arr[i] - arr[j]) == diff){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }
        long diff = sc.nextLong();
        main(n,arr,diff);
        sc.close();
    }
}