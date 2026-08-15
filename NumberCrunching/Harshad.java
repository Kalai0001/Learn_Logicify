import java.util.Scanner;
public class Harshad{
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        Harshad obj=new Harshad();
        obj.harshad(n);
        sc.close();
    }
    
    void harshad(long n){
        long temp=n;
        long res=harshadno(n);
        
        if(temp%res==0){
            System.out.printf("Yes");
        }else{
            System.out.printf("No");
        }
    }
    
    public static long harshadno(long n){
        long sum=0;
        while(n!=0){
            long z=n%10;
            sum=sum+z;
            n=n/10;
        }
        return sum;
    }
}
