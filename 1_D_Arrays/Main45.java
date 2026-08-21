import java.util.Scanner;
public class Main45{
    static void main(int n,long arr1[],long arr2[]){
        int count = 0;
        for(int i = 0; i < n; i++){
            int flag = 0;
            for(int j = 0; j < n; j++){
                if(arr1[i] > arr2[j]){
                    flag = 1;
                }
            }
            if(flag == 1){
                count++;
            }
        }
        
        System.out.printf("%d",count);
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr1[] = new long[n];
        
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextLong();
        }
        
        long arr2[] = new long[n];
        
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextLong();
        }
        main(n,arr1,arr2);
        sc.close();
    }
}