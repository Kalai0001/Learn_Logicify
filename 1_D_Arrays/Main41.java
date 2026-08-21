import java.util.*;
public class Main41{
    static void main(int n,long arr[]){
        
        Arrays.sort(arr);
        
        long target = arr[1] - arr[0];
        
        int flag = 0;
        
        for(int i = 1; i < n; i++){
            if(arr[i] - arr[i-1] != target){
                flag = 1;
                break;
            }
        }
        
        if(flag == 0){
            System.out.printf("Yes");
        }
        else{
            System.out.printf("No");
        }
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