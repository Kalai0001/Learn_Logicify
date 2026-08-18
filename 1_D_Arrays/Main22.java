import java.util.Scanner;
public class Main22{
    static void main(int n,long arr[]){
       
        long sumarr[]=new long[n];
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    sum=sum+arr[j];
                }
            }
            sumarr[i]=sum;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(sumarr[i]+" ");
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