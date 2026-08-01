import java.util.Scanner;
public class Primefactor{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n1=sc.nextLong();
        long n2=sc.nextLong();
        Primefactor obj=new Primefactor();
        obj.primesum(n1,n2);
        sc.close();
    }
    void primesum(long n1,long n2){
        if(n1==1){
            n1=2;
        }
        for(long i=n1;i<=n2;i++){
            int flag=1;
            boolean z=true;
            for(long j=2;j*j<=i;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==0){
                long sum=0;
                for(long x=2;x<i;x++){
                    if(i%x==0){
                        sum=sum+x;
                    }
                }
                for(long k=2;k*k<=sum;k++){
                    if(sum%k==0){
                        z=false;
                        break;
                    }
                }
                if(z==true){
                    System.out.printf("%d ",i);
                }
            }
        }
    }
}