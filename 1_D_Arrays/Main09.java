import java.util.Scanner;
public class Main09{
    void ans(int arr[],int key){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] < key){
                System.out.print(arr[i]+" ");
            }
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        Main09 obj=new Main09();
        obj.ans(arr,key);
        sc.close();
    }
}