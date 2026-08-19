import java.util.Scanner;
public class Main32{
    static void main(int n,long arr[]){
        int count=1;
        long max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                count++;
                max=arr[i];
            }
        }
        System.out.print(count);
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