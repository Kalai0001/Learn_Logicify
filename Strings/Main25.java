import java.util.*;
public class Main25{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           if(ch!=' ' && ch>='a' && ch<='z'){
               map.put(ch,map.getOrDefault(ch,0)+1);
           }
        }
        
        for(char ch : map.keySet()){
            // int count = 0;
            // for(char x : arr){
            //     if(ch == x ){
            //         count++;
            //     }
            // }
            System.out.println(ch+":"+map.get(ch));
        }
        sc.close();
    }
}