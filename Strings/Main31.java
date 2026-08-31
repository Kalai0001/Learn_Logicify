import java.util.Scanner;
public class Main31{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        
        int i = 0;
        int j = arr.length - 1;
        
        while(i < j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
        
        for(int k = 0; k < arr.length; k++){
            System.out.println(arr[k] + " ");
        }
        sc.close();
    }
}