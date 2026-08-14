import java.util.Scanner;
public class Pattern05{
    void main(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern05 obj=new Pattern05();
        obj.main(n);
        sc.close();
    }
}
