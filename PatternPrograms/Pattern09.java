import java.util.Scanner;
public class Pattern09{
    void main(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+'A'-1));
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern09 obj=new Pattern09();
        obj.main(n);
        sc.close();
    }
}
