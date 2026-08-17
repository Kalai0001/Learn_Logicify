import java.util.*;
public class Main18{
    static void ans(long arr[],long remove){
        int flag = 0;
        int a=0;
        long ans[]=new long[100];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==remove){
                flag=1;
            }
            else{
                ans[a++]=arr[i];
            }
        }
        for(int i=0;i<a;i++){
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
        long remove=sc.nextLong();
        ans(arr,remove);
        
        sc.close();
    }
}