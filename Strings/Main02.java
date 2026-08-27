import java.util.Scanner;
public class Main02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        char arr[] = s.toCharArray();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            char ch = arr[i];
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'||
            ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U'){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}