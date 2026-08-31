import java.util.Scanner;
public class Main32{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        char arr[] = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] && arr[i] != ' '){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(arr[i]);
                return;
            }
        }
        sc.close();
    }
}