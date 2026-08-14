import java.util.Scanner;
public class Pattern16{
    void main(int n){
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n){
                    System.out.print(a);
                }
                else if(j==1 || j==n){
                    System.out.print(a);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern16 obj=new Pattern16();
        obj.main(n);
        sc.close();
    }
}
