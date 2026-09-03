import java.util.Scanner;
public class Main12{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        long sum=0;
        for(int i=num1;i<=num2;i++){
            sum=sum+i;
        }
        System.out.printf("%d",sum);
        sc.close();
    }
}