import java.util.Scanner;
public class Main14{
    public static String stringlength(String s1,String s2){
        String s3 = "";
        s3= s3 + s1 + s2;
        
        return s3;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String ans = stringlength(s1,s2);
        System.out.print(ans);
        sc.close();
    }
}