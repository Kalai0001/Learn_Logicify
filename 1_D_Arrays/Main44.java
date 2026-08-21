import java.util.*;
public class Main44{
    static void main(int n,long arr[]){
        long num = Long.MIN_VALUE;
        for(int i = 0; i < n ; i++){
            if(arr[i] > num){
                num = arr[i];
            }
        }
        
        ArrayList<Long> fibo = new ArrayList<>();
        
        long a = 0;
        long b = 1;
        while(a <= num){
            fibo.add(a);
            long tmp = a + b;
            a = b;
            b = tmp;
        }
       
        ArrayList<Long> fibonum = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < fibo.size() ; j++){
                if(arr[i] == fibo.get(j)){
                    fibonum.add(arr[i]);
                }
            }
        }
        
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        
        for(long x : fibonum){
            if(x < min){
                min = x;
            }
            if(x > max){
                max = x;
            }
        }

        System.out.printf("%d %d",min,max);
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        main(n,arr);
        sc.close();
    }
}