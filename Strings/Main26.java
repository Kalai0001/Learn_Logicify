import java.util.*;
public class Main26{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine().toLowerCase();
        char arr[] = s.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char ch : arr){
            if(ch != ' ' && ch >= 'a' && ch <='z'){
                set.add(ch);
            }
        }
        
        for(char ch : set){
            int count = 0;
            for(char x : arr){
                if(ch == x){
                    count++;
                }
            }
            if(count >=2){
                System.out.printf("%c ",ch);
            }
        }
        sc.close();
    }
}