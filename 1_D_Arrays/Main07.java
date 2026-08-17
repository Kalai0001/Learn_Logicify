import java.util.Scanner;
public class Main07{
    public static long ans(int n,long arr[]){
    
        long sum=0;
        
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        double average=(double)sum/n;
        
        return Math.round(average);
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