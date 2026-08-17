import java.util.Scanner;
public class Main06{
    public static long ans(int n,long arr[]){
        long min=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long res=ans(n,arr);
        
        System.out.print(res);
        
        sc.close();
    }
}