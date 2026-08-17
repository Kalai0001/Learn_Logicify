
import java.util.*;
public class Main15{
    static void ans(long arr[],long first,long last){
        
        for(int i=0;i<arr.length;i++){
            if(i==0){
                arr[i]=first;
            }
            if(i==arr.length-1){
                arr[i]=last;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long first=sc.nextLong();
        long last=sc.nextLong();
        ans(arr,first,last);
        
        sc.close();
    }
}