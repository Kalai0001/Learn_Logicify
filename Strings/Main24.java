import java.util.Scanner;
public class Main24{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        
        char arr[] = s.toCharArray();
        int max = 0;
        char ch = s.charAt(0);
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] && arr[j] != ' '){
                    count++;
                }
            }
            if(count > max){
                max = count;
                ch = arr[i];
            }
        }
        System.out.printf("%c:%d",ch,max);
        sc.close();
    }
}