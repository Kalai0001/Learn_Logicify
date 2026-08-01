import java.util.Scanner;
public class Algorithm_196{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        Algorithm_196 obj=new Algorithm_196();
        obj.palindromic(n);
        sc.close();
    }
    void palindromic(long n){
        long rev=ans(n);
        System.out.print(rev);
    }
    public static long ans(long n){
        long temp=n;
        long rev1=0;
        while(n!=rev1){
            long sum=0;
            long rev2=0;
            while(temp!=0){
                long a=temp%10;
                rev1=rev1*10+a;
                temp=temp/10;
            }
            sum=rev1+n;
            long originalsum=sum;
            while(sum!=0){
                long a=sum%10;
                rev2=rev2*10+a;
                sum=sum/10;
            }
            n=originalsum;
            rev1=rev2;
        }
        return n;
    }
}
