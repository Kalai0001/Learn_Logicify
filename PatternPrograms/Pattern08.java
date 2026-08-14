import java.util.Scanner;
public class Pattern08{
    void main(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern08 obj=new Pattern08();
        obj.main(n);
        sc.close();
    }
}
