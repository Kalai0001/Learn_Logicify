import java.util.Scanner;
public class Main38{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u' &&
              arr[i] != 'A' && arr[i] != 'E' && arr[i] != 'I' && arr[i] != 'O' && arr[i] != 'U'){
                System.out.print(arr[i]);
            }
        }
        sc.close();
    }
}