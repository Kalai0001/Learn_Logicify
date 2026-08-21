import java.util.Scanner;
public class Main43{
    static void main(long arr[]){
    
        int maxcount = 0;
        long num=0;
        for(int i=0;i<arr.length;i++){
            int count = 0;
            
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount = count;
                num = arr[i];
            }
        }
        System.out.print(num);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        main(arr);
        sc.close();
    }
}