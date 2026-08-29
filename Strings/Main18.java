import java.util.Scanner;
public class Main18{
    public static int stringlength(String s){
        
        String arr[] = s.split(" ");
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            count++;
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = stringlength(s);
        System.out.print(ans);
        sc.close();
    }
}