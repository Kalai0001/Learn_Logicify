import java.util.Scanner;
public class Main25{
    static void main(int n,long arr[]){
        long rev[]=new long[n];
        int a=0;
        for(int i=arr.length-1;i>=0;i--){
            rev[a++]=arr[i];
        }
        
        for(int i=0;i<a;i++){
            System.out.print(rev[i]+" ");
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