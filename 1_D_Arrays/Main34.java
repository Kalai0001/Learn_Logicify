import java.util.Scanner;
public class Main34{
    static void main(int n,long arr[]){
        
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i + 1;j<n;j++){
                if(arr[i] > arr[j]){
                    System.out.printf("%d %d\n",arr[i],arr[j]);
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        main(n,arr);
        sc.close();
    }
}