import java.util.Scanner;
public class Main30{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = " ";
        
        for(int i = s.length()-1 ; i >= 0; i--){
            res = res + s.charAt(i);
        }
        
        String arr[] = res.split(" ");
        
        int x = 0;
        int y = arr.length - 1;
        
        while(x < y){
            String tmp = arr[x];
            arr[x] = arr[y];
            arr[y] = tmp;
            
            x++;
            y--;
        }
        
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        sc.close();
    }
}