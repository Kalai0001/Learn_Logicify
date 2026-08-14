import java.util.Scanner;
public class Pattern10{
    void main(int n){
        int ch=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern10 obj=new Pattern10();
        obj.main(n);
        sc.close();
    }
}
