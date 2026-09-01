import java.util.Scanner;
public class Main46{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        
        String res = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                res = res + ch;
            }
        }
        
        char arr[] = res.toCharArray();
        for(int i = 0; i < arr.length;i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}