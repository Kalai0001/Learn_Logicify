import java.util.*;
public class Main10{
    void main(int n,int arr[]){
        
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j] && i!=j){
                    count++;
                }
            }
            if(count>=1){
                set.add(arr[i]);
            }
        }
        
        for(int nums:set){
            System.out.print(nums+" ");
        }
            
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Main10 obj=new Main10();
        obj.main(n,arr);
        sc.close();
    }
}