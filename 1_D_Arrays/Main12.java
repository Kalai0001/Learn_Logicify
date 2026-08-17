import java.util.*;
public class Main12{
    static void ans(long arr[]){
        
        System.out.print(arr[0]+" ");
        System.out.print(arr[arr.length-1]);
    
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        
        ans(arr);
        
        sc.close();
    }
}