import java.util.Scanner;
public class Pattern15{
    void main(int n){
        int k=2*n-1;
        for(int i=1;i<=k;i+=2){
            int a=i;
            for(int j=i;j<=k;j+=2){
                System.out.print(a);
                a+=2;
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern15 obj=new Pattern15();
        obj.main(n);
        sc.close();
    }
}
