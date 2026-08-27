import java.util.Scanner;
public class Main03{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        char arr[] = s.toCharArray();
        int ccount = 0;
       
        for(int i = 0; i < arr.length; i++){
            char ch = Character.toLowerCase(arr[i]);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch !='o' && ch != 'u' && ch != ' '){
                ccount++;
            }
        }
        System.out.println(ccount);
        sc.close();
    }
}