import java.util.*;
public class Armstrong{
    void armstrong(long n){
        long result=cube(n);
        long tmp=n;
        if(result==tmp){
            System.out.printf("Yes");
        }else{
            System.out.printf("No");
        }
    }
    public static long cube(long n){
        long cuberoot=0;
        long tmp=n;
        long digit=0;
        while(n!=0){
            digit++;
            n=n/10;
        }
        while(tmp!=0){
            long ans=1;
            long z=tmp%10;
            // cuberoot=cuberoot + (long)Math.pow(z,digit);
            for(int i=1;i<=digit;i++){
                ans=ans*z;
            }
            cuberoot=cuberoot+ans;
            tmp=tmp/10;
        }
        return cuberoot;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        Armstrong obj=new Armstrong();
        obj.armstrong(n);
        sc.close();
    }
}