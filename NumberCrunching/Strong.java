import java.util.Scanner;
public class Strong{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        Strong obj=new Strong();
        obj.strong(n);
        sc.close();
    }
    
    void strong(long n){
        long temp=n;
        long res=strongnumber(n);
        if(res==temp){
            System.out.printf("Yes");
        }
        else{
            System.out.printf("No");
        }
    }
    public static long strongnumber(long n){
        long ans=0;
        while(n!=0){
            long factor=1;
            long z=n%10;
            for(int i=1;i<=z;i++){
                factor=factor*i;
            }
            ans=ans+factor;
            n=n/10;
        }
        return ans;
    }
}
