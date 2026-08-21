import java.util.Scanner;
public class Main50{
    static void main(int n,long arr[],long target){
        int flag = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] + arr[j] == target && i!=j){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 1){
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
        long target = sc.nextLong();
        main(n,arr,target);
        sc.close();
    }
}