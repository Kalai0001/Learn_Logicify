
import java.util.*;
public class Main13{
    static void ans(long arr[],int element){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.print(i);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.print(-1);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        int element=sc.nextInt();
        
        ans(arr,element);
        
        sc.close();
    }
}