import java.util.Scanner;
public class Main47{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        for(int i = 2; i < arr.length; i++){
            boolean flag = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}