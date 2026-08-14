import java.util.Scanner;
public class Pattern01{
    void main(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern01 obj=new Pattern01();
        obj.main(n);
        sc.close();
    }
}
