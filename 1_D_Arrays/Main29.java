import java.util.Scanner;
public class Main29{
    static void main(int n,long arr[]){
        long min=Long.MAX_VALUE;
        long secondmin=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]<secondmin && arr[i]!=min){
                secondmin=arr[i];
            }
        }
        
        System.out.print(secondmin);
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