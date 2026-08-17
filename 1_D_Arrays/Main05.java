import java.util.Scanner;
public class Main05{
    public static long ans(int n,long arr[]){
        long max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
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