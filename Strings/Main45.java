import java.util.Scanner;
public class Main45{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr1[] = s.split(" ");
        for(int i = 0; i < arr1.length; i++){
            String word = arr1[i];
            char arr2[] = word.toCharArray();
            int x = 1;
            int y = arr2.length - 2;
            
            while(x < y){
                char tmp = arr2[x];
                arr2[x] = arr2[y];
                arr2[y] = tmp;
                x++;
                y--;
            }
            if(i > 0){
                System.out.printf(" ");
            }
            for(int k = 0; k < arr2.length; k++){
                System.out.print(arr2[k]);
            }
        }
        sc.close();
    }
}