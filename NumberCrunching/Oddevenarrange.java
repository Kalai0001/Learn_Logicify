import java.util.*;
public class Oddevenarrange{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        Oddevenarrange obj=new Oddevenarrange();
        obj.oddeven(n);
        sc.close();
    }
    void oddeven(String n){
        String res=num(n);
        System.out.printf(res);
    }
    public static String num(String n){
        String odd="";
        String even="";
        char arr[]=n.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            int num=ch-'0';
            if(num%2==0){
                even=even+num;
            }else{
                odd=odd+num;
            }
        }
        String res=odd;
        res=res+even;
        
        return res;
    }
}
