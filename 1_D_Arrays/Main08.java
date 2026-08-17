import java.util.Scanner;
public class Main08{
    void main(int n,int arr[]){
        
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count1++;
            }
            if(arr[i]==1){
                count2++;
            }
        }
        
        System.out.printf("0:%d 1:%d",count1,count2);
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        Main08 obj=new Main08();
        obj.main(n,arr);
        
        sc.close();
    }
}