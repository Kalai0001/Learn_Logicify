import java.util.Scanner;
public class Targetcount{
    public static long count(long n,long target){
        int count=0;
        while(n!=0){
            long a=n%10;
            if(a==target){
                count++;
            }
            n=n/10;
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long target=sc.nextLong();
        long ans=count(n,target);
        System.out.println(ans);
        sc.close();
    }
}
