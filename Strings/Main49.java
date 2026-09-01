import java.util.*;
public class Main49{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        long product = 1;
        
        long MOD = 1000000007;
        
        for(long i = 1; i <= s.length(); i++){
            product = (product * i) % MOD;
        }
        
        System.out.print(product);
        sc.close();
    }
}