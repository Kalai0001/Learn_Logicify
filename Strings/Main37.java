import java.util.Scanner;
public class Main37{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char arr1[] = s1.toCharArray();
        
        String s2 = sc.nextLine();
        char arr2[] = s2.toCharArray();
        
        if(arr1.length != arr2.length){
            System.out.printf("No");
            return;
        }
        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    arr2[j] = '#';
                    count++;
                    break;
                }
            }
        }
        if(count == arr1.length){
            System.out.printf("Yes");
        }
        else{
            System.out.printf("No");
        }
        sc.close();
    }
}