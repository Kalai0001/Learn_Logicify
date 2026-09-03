import java.util.Scanner;
public class Main16{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1%num2==0){
            System.out.printf("Yes");
        }else{
            System.out.printf("No");
        }
        sc.close();
    }
}