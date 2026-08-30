import java.util.Scanner;
public class Main22{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String arr[] = s.split(" ");
        
        String tmp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = tmp;
        
        
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}