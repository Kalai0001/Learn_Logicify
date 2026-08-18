import java.util.Scanner;
public class Main28{
    static void main(int n,long arr[]){
        long max=Long.MIN_VALUE;
        long secondmax=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }
        }
        
        System.out.print(secondmax);
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