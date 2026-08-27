import java.util.Scanner;
public class Main08{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        String s3 = "";
        s3 = s1 + s2;
    
        System.out.printf("%s",s3);
        sc.close();
    }
}