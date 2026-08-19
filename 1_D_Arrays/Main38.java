import java.util.Scanner;
public class Main38{
    static void main(int n,long arr[]){
        
        long sum=0;
    
        long prefix[]=new long[n];
        
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            prefix[i] = sum;
        }
        
        int count=0;
        for(int i=0;i<prefix.length;i++){
            long num = prefix[i];
            int flag = 0;
            if(num < 2){
                continue;
            }
            for(long j=2;j<num;j++){
                if(num % j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                count++;
            }
        }
        
        System.out.print(count);
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long arr[] = new long[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        
        main(n,arr);
        sc.close();
    }
}