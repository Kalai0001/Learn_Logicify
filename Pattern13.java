import java.util.Scanner;
public class Pattern13{
    void main(int n){
        int k=n;
        for(int i=1;i<=n;i++){
            for(int j=k;j>=1;j--){
                System.out.print(i);
            }
            k--;
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern13 obj=new Pattern13();
        obj.main(n);
        sc.close();
    }
}