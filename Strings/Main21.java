import java.util.Scanner;
public class Main21{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        String tmp = s1;
        s1 = s2;
        s2 = tmp;
        
        System.out.printf("%s\n",s1);
        System.out.printf("%s",s2);
        
        sc.close();
    }
}