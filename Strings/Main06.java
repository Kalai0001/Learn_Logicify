import java.util.Scanner;
public class Main06{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        
        int n = arr1.length;
        
        if(arr1.length != arr2.length){
            System.out.printf("Not the same");
        }
        else{
            boolean flag = true;
            for(int i = 0;i < n; i++){
                if(arr1[i] != arr2[i]){
                    flag = false;
                    System.out.printf("Not the same");
                    return;
                }
            }
            
            if(flag){
                System.out.printf("Same");
            }
        }
        sc.close();
    }
}