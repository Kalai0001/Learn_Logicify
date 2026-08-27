import java.util.*;
public class Main10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String arr1[] = s1.split(" ");
        
        String s2 = sc.nextLine();
        String arr2[] = s2.split(" ");
        
        
        if(s1.contains(s2)){
            System.out.printf("Yes");
        }
        else{
            System.out.printf("NO");
        }
        // boolean flag = true;
        // for(int i = 0; i < arr1.length; i++){
        //     for(int j = 0; j < arr2.length; j++){
        //         if(arr1[i].equals(arr2[j])){
        //             flag = false;
        //             System.out.printf("Yes");
        //             return;
        //         }
        //     }
        // }
        // if(flag){
        //     System.out.printf("NO");
        // }
        sc.close();
    }
}