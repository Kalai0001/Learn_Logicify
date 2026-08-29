import java.util.Scanner;
public class Main17{
    public static int stringlength(String s){
        int count = 0;
        char arr[] = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            char ch = arr[i];
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
            ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != ' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = stringlength(s);
        System.out.print(ans);
        sc.close();
    }
}