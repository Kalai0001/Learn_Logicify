import java.util.*;
public class Main41{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        if(s1.contains(s2)){
            System.out.printf("Yes");
        }
        else{
            System.out.printf("No");
        }
        sc.close();
    }
}