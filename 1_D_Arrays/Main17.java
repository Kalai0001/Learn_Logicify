import java.util.*;
public class Main17{
    static void ans(long arr[],long divisor){
        long ans[]=new long[arr.length];
        for(int i=0;i<arr.length;i++){
            long num=arr[i]/divisor;
            
            ans[i]=num;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    
    }
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long divisor=sc.nextLong();
        ans(arr,divisor);
        
        sc.close();
    }
}