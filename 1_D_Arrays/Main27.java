import java.util.Scanner;
public class Main27{
    static void main(int n,long arr[]){
        long fh[]=new long[n];
        long sh[]=new long[n];
        int a=0;
        int b=0;
        
        
        if(n%2==0){
            int z1=n/2 - 1;
            for(int i=0;i<=z1;i++){
                fh[a++]=arr[i];
            }
        }
        else{
            int z1=(n/2)-1;
            for(int i=0;i<=z1;i++){
                fh[a++]=arr[i];
            }
        }
        
        if(n%2==0){
            int z2=n/2;
            for(int i=arr.length-1;i>=z2;i--){
                sh[b++]=arr[i];
            }
        }
        else{
            int z2=n/2;
            for(int i=arr.length-1;i>=z2;i--){
                sh[b++]=arr[i];
            }
        }
        
        long newarr[]=new long[n];
        
        for(int i=0;i<a;i++){
            newarr[i]=fh[i];
        }
        
        for(int i=0;i<b;i++){
            newarr[i+a]=sh[i];
        }
        
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        main(n,arr);
        sc.close();
    }
}