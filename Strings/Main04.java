
import java.util.Scanner;
public class Main04{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            char ch = arr[i];
            count++;
        }
        System.out.print(count);
        sc.close();
    }
}