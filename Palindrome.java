import java.util.Scanner;
public class Palindrome{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        Palindrome obj=new Palindrome();
        obj.palindrome(n);
        sc.close();
    }
    void palindrome(long n){
        long tmp=n;
        long rev=0;
        while(n!=0){
            long a=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        if(tmp==rev){
            System.out.printf("Yes");
        }
        else{
            System.out.printf("No");
        }
    }
}
