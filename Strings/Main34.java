import java.util.Scanner;
public class Main34{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        
        for(int i = 0; i < arr.length; i+=2){
            char ch = arr[i + 1];
            int num = ch - '0';
            
            for(int j = 0; j < num; j++){
                System.out.print(arr[i]);
            }
        }
        sc.close();
    }
}