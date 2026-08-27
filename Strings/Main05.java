import java.util.Scanner;
public class Main05{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
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
        
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k]);
        }
        
        sc.close();
    }
}