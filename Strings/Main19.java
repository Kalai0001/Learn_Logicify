import java.util.Scanner;
public class Main19{
    public static String stringlength(String s){
        char arr[] = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        
        while(i < j){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            
            i++;
            j--;
        }
        String res = "";
        for(int k = 0; k < arr.length; k++){
            char ch = arr[k];
            res = res + ch;
        }
        
        return res;
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = stringlength(s);
        System.out.print(ans);
        sc.close();
    }
}