import java.util.Scanner;
public class Main15{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long product=0;
        int flag=0;
        for(long i=1;i*i<=n;i++){
            product=i*i;
            if(product==n){
                flag=1;
                System.out.printf("Yes");
                break;
            }
            else{
                product=0;
            }
        }
        if(flag!=1){
            System.out.printf("No");
        }
        sc.close();
    }
}