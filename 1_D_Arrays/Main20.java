
import java.util.*;
public class Main20{
    static void ans(int n,long arr[]){
        long max=Long.MIN_VALUE;;
        int k=0;
        
        int rotated = 0;
        
        long sortingarr[]=new long[n];
        for(int i=0;i<n;i++){
            sortingarr[i]=arr[i];
        }
        
        Arrays.sort(sortingarr);
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
                if(i==arr.length-1){
                    k=0;
                    rotated = 0;
                }
                else{
                  k=i+1;
                  rotated = 1;
                }
            }
        }
        
        if(rotated == 0){
            System.out.print("No");
            return;
        }
        
        long newarr[]=new long[n];
        int a=0;
        for(int j=k;j<n;j++){
            newarr[a++]=arr[j];
            // System.out.print(newarr[i]+" ");
        }
        
        for(int j=0;j<k;j++){
            newarr[a++]=arr[j];
            // System.out.print(newarr[i]+" ");
        }
        
        
        int flag=0;
        for(int j=0;j<n;j++){
            if(sortingarr[j]!=newarr[j]){
                flag=1;
                break;
            }
        }
        
        if(flag==0){
            System.out.print("Yes");
            return;
        }
        else{
            System.out.print("No");
        }
        // System.out.print("No");
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        ans(n,arr);
        sc.close();
    }
}
