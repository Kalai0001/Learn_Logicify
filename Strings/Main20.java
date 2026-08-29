import java.util.Scanner;
public class Main20{
    public static String stringlength(String s){
        
        char arr[] = s.toCharArray();
        boolean flag = true;
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            if(arr[i] != arr[j]){
                flag = false;
                return "No";
            }
            i++;
            j--;
        }
        
        return "Yes";
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = stringlength(s);
        System.out.print(ans);
        sc.close();
    }
}