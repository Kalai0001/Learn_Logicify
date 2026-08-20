import java.util.Scanner;
public class Pattern06{
    void main(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern06 obj=new Pattern06();
        obj.main(n);

        sc.close();
    }
}
