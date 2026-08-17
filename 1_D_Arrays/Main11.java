import java.util.*;
public class Main11{
    static void ans(long arr[],int index){
        for(int i=0;i<arr.length;i++){
            if(i==index){
                System.out.print(arr[i]);
                break;
            }
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        int index=sc.nextInt();
        
        ans(arr,index);
        
        sc.close();
    }
}