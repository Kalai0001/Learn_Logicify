import java.util.*;
public class Main44{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        for(String x : arr){
            set.add(x);
        }
        
        for(String a : set){
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(a.equals(arr[i])){
                    count++;
                }
            }
            System.out.printf("frequency of %s is : %d\n",a,count);
        }
        sc.close();
    }
}