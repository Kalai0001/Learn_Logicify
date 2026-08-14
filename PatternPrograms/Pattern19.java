
import java.util.Scanner;
public class Pattern19{
    void main(int n){
        int k=2*n-1;
        int a=1;
        for(int i=1;i<=n;i++){
            for(int space=n-i;space>=1;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=a;j++){
                System.out.print(j);
            }
            if(a==k){
                break;
            }
            a+=2;
            System.out.println();
        }
        
        System.out.println();
        
        int z=k-2;
        for(int i=2;i<=n;i++){
            for(int space=1;space<i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=z;j++){
                System.out.print(j);
            }
            z-=2;
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern19 obj=new Pattern19();
        obj.main(n);
        sc.close();
    }
}
