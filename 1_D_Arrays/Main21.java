import java.util.Scanner;
public class Main21{
    static void main(int n,long arr[]){
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        long sum = min + max;
        
        System.out.print(sum);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        main(n,arr);
        sc.close();
    }
}