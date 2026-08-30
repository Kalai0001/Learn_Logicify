import java.util.*;
public class Main29{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        char arr1[] = s1.toCharArray();
        
        String s2 = sc.nextLine();
        char arr2[] = s2.toCharArray();
        
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        for(char ch : arr2){
            if(ch != ' '){
                set.add(ch);
            }
        }
        
        for(char x : arr1){
            int count = 0;
            for(char y : set){
                if(x == y){
                    count++;
                }
            }
            if(count == 0 && x != ' '){
                System.out.printf("%c",x);
            }
        }
        sc.close();
    }
}