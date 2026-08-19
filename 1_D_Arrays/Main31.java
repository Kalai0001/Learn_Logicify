import java.util.*;
public class Main31{
    static void main(int n,long arr[],long k){
        
        int count1 = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                count1++;
            }
        }
        
       
        int ans=Integer.MAX_VALUE;
        
        for(int i = 0;i<=n-count1;i++){
            int count2=0; 
            for(int j=0;j<count1;j++){
                if(arr[i + j] > k){
                    count2++;
                }
            }
            ans = Math.min(ans,count2);
        }
        
        System.out.println(ans + 1);
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        long k = sc.nextLong();
        main(n,arr,k);
        sc.close();
    }
}