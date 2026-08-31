import java.util.Scanner;
public class Main33{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        char arr[] = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            char ch = arr[i];
            for(int j = i; j < arr.length; j++){
                if(arr[i] != arr[j]){
                    i = j - 1;
                    break;
                }
                else{
                    count++;
                    if(j == arr.length - 1){
                        i = j;
                    }
                }
            }
            System.out.printf("%c%d",ch,count);
        }
    }
}