import java.util.*;
public class Main39{
    static void main(int n,long arr[]){
        int flag=1;

        Arrays.sort(arr);
        
        for(int i=1;i<n;i+=2){
            
            long num = arr[i] - 1;
            
            if(arr[i - 1] != num){
                flag = 0;
                break;
            }
        }
        
        if(flag==1){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
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