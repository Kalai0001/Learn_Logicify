import java.util.Scanner;
public class Main42{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        
        for(int i = 0; i < arr.length; i++){
            String word = arr[i];
            char str[] = word.toCharArray();
            if(i > 0){
                System.out.print(" ");
            }
            for(int j = 1; j < str.length - 1; j++){
                System.out.print(str[j]);
            }
        }
        sc.close();
    }
}