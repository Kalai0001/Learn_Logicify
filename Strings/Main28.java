import java.util.Scanner;
public class Main28{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        
        if(arr1.length != arr2.length){
            System.out.print("No");
            return;
        }
        
        char ch = arr1[0];
        char min = Character.MAX_VALUE;
        int k = 0;
        for(int i = 0; i < arr2.length; i++){
            if(ch == arr2[i]){
                min = arr2[i];
                k = i;
                break;
            }
        }
        // for(int i = 0; i < arr2.length; i++){
        //     if(arr2[i] < min){
        //         min = arr2[i];
        //         k = i;
        //     }
        // }
        // System.out.print(min);
        
        char arr[] = new char[arr1.length];
        int a = 0;
        
        for(int i = k; i < arr2.length ; i++){
            arr[a++] = arr2[i];
        }
        for(int i = 0; i < k; i++){
            arr[a + i] = arr2[i];
        }
        
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr1[i]){
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
        sc.close();
    }
}