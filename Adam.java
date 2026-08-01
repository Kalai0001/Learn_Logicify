import java.util.Scanner;
public class Adam{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        Adam obj=new Adam();
        obj.adam(n);
        sc.close();
    }
    
    void adam(long n){
        if(n%10==0){
            System.out.printf("No");
            return;
        }
        long sr=n*n;
        long reverse1=squarereverse(sr);
        long noreverse=numberreverse(n);
        long reverse2=noreverse*noreverse;
        if(reverse1==reverse2){
            System.out.printf("Yes");
        }else{
            System.out.printf("No");
        }
        
    }
    
    public static long squarereverse(long sr){
        long rev1=0;
        while(sr!=0){
            long a=sr%10;
            rev1=rev1*10+a;
            sr=sr/10;
        }
        return rev1;
    }
    
    public static long numberreverse(long n){
        long rev2=0;
        while(n!=0){
            long a=n%10;
            rev2=rev2*10+a;
            n=n/10;
        }
        return rev2;
    }
}
