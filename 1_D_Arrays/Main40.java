import java.util.Scanner;
public class Main40{
    static void main(int n,long arr[],long num){
        long res=0;
        for(int i=0;i<n;i++){
            if((arr[i]==num)||(arr[i]>num)){
                res=arr[i];
                break;
            }
        }
        System.out.print(res);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long num=sc.nextLong();
        main(n,arr,num);
        sc.close();
    }
}