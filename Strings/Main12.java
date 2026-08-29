import java.util.Scanner;
public class Main12{
    public static String stringlength(String s1,String s2){
        if(s1.contains(s2)){
            return "Yes";
        }
        else{
            return "No";
        }
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