import java.util.Scanner;
public class Good{
    public static boolean isGood(long num,long d){
        long temp=num;
        long right=0;
        
        int count=0;
        while(temp!=0){
            long a=temp%10;
            if(a==d){
                return false;
            }
            
            if(count!=0){
                if(a<=right){
                    return false;
                }
            }
            count++;
            right=right+a;
            temp=temp/10;
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n1=sc.nextLong();
        long n2=sc.nextLong();
        long d=sc.nextLong();
        
        for(long i=n1;i<=n2;i++){
            boolean result=isGood(i,d);
            
            if(result){
                System.out.printf("%d ",i);
            }
        }
        sc.close();
    }
}