import java.util.*;
public class Main27{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        char arr[] = s.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        for(char x : arr){
            set.add(x);
        }
        
        for(char y : set){
            System.out.print(y);
        }
        sc.close();
    }
}