import java.util.Scanner;
public class Pattern04{
    void main(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.printf(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern04 obj=new Pattern04();
        obj.main(n);
        sc.close();
    }
}