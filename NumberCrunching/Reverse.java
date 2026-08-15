import java.util.Scanner;
public class Reverse{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        Reverse obj=new Reverse();
        obj.reverse(n);
        sc.close();
    }
    void reverse(long n){
        long rev=0;
        while(n!=0){
            long a=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        System.out.printf("%d",rev);
    }
}
