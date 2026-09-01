import java.util.Scanner;
public class Main50{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int n = s.length();
        
        int res = 1;
        for(int i = 0; i < n - 1; i++){
            res = res * 2;
        }
        
        System.out.print(res);
        sc.close();
    }
}