import java.util.Scanner;
public class Main09{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        
        int i = 0;
        int j = arr.length - 1;
        
        boolean flag = true;
        while(i < j){
            if(arr[i] != arr[j]){
                System.out.printf("No");
                flag = false;
                return;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.printf("Yes");
        }
        sc.close();
    }
}