import java.util.Scanner;
public class Main13{
    public static String stringlength(String s1){
        String s2 = "";
        for(int i = 0; i < s1.length(); i++){
            s2 = s2 + s1.charAt(i);
        }
        return s2;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        String ans = stringlength(s1);
        System.out.print(ans);
        sc.close();
    }
}