import java.util.Scanner;
public class Pattern07{
    void main(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern07 obj=new Pattern07();
        obj.main(n);
        sc.close();
    }
}