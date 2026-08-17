import java.util.*;
public class Main19{
    static void ans(long arr1[],long arr2[]){
        
        int a=0;
        long newarr[]=new long[100];
        int c1=0;
        for(int i=0;i<arr1.length;i++){
            newarr[a++]=arr1[i];
            c1++;
        }
        int c2=0;
        
        for(int i=0;i<arr2.length;i++){
            newarr[a+i]=arr2[i];
            c2++;
        }
        int z=c1+c2;
        
        for(int i=0;i<z;i++){
            for(int j=i + 1;j<z;j++){
                if(newarr[i]>newarr[j]){
                    long temp=newarr[i];
                    newarr[i]=newarr[j];
                    newarr[j]=temp;
                }
            }
        }
        long ans=0;
        int k=z/2;
        if(z%2==0){
            long mid1=newarr[k];
            long mid2=newarr[k - 1];
            
            ans=(mid1+mid2)/2;
        }
        else{
            long mid=newarr[k];
            
            ans=mid;
        }
        
        System.out.print(ans);
        
        
        
        // for(int i=0;i<z;i++){
        //     System.out.print(newarr[i]+" ");
        // }
    
    }
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr1[]=new long[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextLong();
        }
        
        long arr2[]=new long[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextLong();
        }
    
        ans(arr1,arr2);
        
        sc.close();
    }
}