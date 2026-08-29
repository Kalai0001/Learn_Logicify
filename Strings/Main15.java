import java.util.Scanner;
public class Main15{
    public static String stringlength(String s1,String s2){
        
        
        int n = s1.length();
        if(s1.length() != s2.length()){
            return "No";
        }
        else{
            for(int i = 0; i < n; i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    return "No";
                }
            }
            return "Yes";
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