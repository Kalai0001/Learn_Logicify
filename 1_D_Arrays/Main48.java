import java.util.Scanner;
public class Main48{
    static void main(int n1,int n2,long arr1[],long arr2[]){
        
        long arr[] = new long[100];
        int a = 0;
        
        for(int i = 0; i < n1; i++){
            int flag = 0;
            for(int j = 0; j < n2; j++){
                if(arr1[i] == arr2[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                arr[a++] = arr1[i];
            }
        }
        
        for(int i = 0; i < a; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        long arr1[] = new long[n1];
        long arr2[] = new long[n2];
        
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextLong();
        }
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextLong();
        }
        
        main(n1,n2,arr1,arr2);
        sc.close();
    }
}
