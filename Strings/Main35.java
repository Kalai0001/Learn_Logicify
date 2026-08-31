import java.util.Scanner;
public class Main35{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String arr[] = s.split(" ");
        
        for(int i = 0; i < arr.length; i++){
            String sentence = arr[i];
            
            char word[] = sentence.toCharArray();
            if(word.length % 2 ==0){
                for(int j = 0; j < word.length; j++){
                    System.out.print(word[j]);
                }
                System.out.print(" ");
            }
            else{
                for(int j = word.length - 1; j >= 0; j--){
                    System.out.print(word[j]);
                }
                System.out.print(" ");
            }
                
        }
        sc.close();
    }
}
