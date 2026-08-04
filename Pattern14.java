import java.util.Scanner;
public class Pattern14{
    void main(int n){
        int k=n+n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                System.out.print(j);
            }
            k-=2;
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern14 obj=new Pattern14();
        obj.main(n);
        sc.close();
    }
}