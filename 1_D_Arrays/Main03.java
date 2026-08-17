import java.util.Scanner;
public class Main03{
    public static int[] ans(int n,int arr[]){
        int arr1[]=new int[n];
        int a=0;
        for(int i=arr.length-1;i>=0;i--){
            arr1[a++]=arr[i];
        }
        return arr1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res[]=ans(n,arr);
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
}