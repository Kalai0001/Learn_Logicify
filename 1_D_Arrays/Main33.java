import java.util.Scanner;
public class Main33{
    static void main(int n,long arr[]){
        
        long newarr[] = new long[n];
        int a = 0;
        
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                newarr[a++] = arr[i];
            }
            else{
                count++;
            }
        }
        
        for(int i=0;i<count;i++){
            newarr[a + i] = 0;
        }
        
        
        long sum = 0;
        for(int i=1;i<newarr.length;i++){
            
            if(newarr[i] == newarr[i - 1]){
                sum = newarr[i] + newarr[i - 1];
                
                newarr[i - 1] = sum;
                
                newarr[i] = 0;
            }
            sum = 0;
        }
        
        
        
        long ans[] = new long[n];
        int a1 = 0;
        
        int count1=0;
        for(int i=0;i<newarr.length;i++){
            if(newarr[i]!=0){
                ans[a1++] = newarr[i];
            }
            else{
                count1++;
            }
        }
        
        for(int i=0;i<count1;i++){
            ans[a1 + i] = 0;
        }
    
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        
        main(n,arr);
        sc.close();
    }
}