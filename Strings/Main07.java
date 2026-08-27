import java.util.Scanner;
public class Main07{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = "";
        for(int i = 0; i < s1.length(); i++){
            s2 = s2 + s1.charAt(i);
        }
        System.out.printf("%s",s2);
        sc.close();
    }
}