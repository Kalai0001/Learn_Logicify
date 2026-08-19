import java.util.*;
public class Main36{
    static void main(int n,long arr[]){
        
        LinkedHashSet<Long> set = new LinkedHashSet<>();
        
        for(long num1 : arr){
            set.add(num1);
        }
        
        for(long num2 : set){
            int count = 0;
            
            for(long x : arr){
                
                if(num2 == x){
                    count++;
                }
            }
            System.out.printf("%d:%d\n",num2,count);
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