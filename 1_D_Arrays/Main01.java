import java.util.Scanner;
public class Main01{
    public static int[] ans(int n,int arr[]){
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
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