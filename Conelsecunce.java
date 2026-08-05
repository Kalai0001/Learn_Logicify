import java.util.*;
public class Conelsecunce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int k = 1;
       int val = 0;
        while(count<=n){
             val++;
            if(val%2!=0){
                int temp = val;
                while(temp>0){
                    if(count >=n){
                        break;
                    }
                    if(k%2!=0){
                        System.out.print(k+" ");
                        temp--;
                        count++;
                        k++;
                        continue;
                    }k++;
                }
            }else{
                int temp = val;
                while (temp>0) {
                     if(count >=n){
                        break;
                    }
                    if(k%2==0){
                        System.out.print(k+" ");
                        temp--;
                        count++;
                        k++;
                        continue;
                    }
                    k++;
                }
            }
        }
        scan.close();
    }
}
