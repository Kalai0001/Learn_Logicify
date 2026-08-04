import java.util.Scanner;
public class Pattern12{
    void main(int n){
        int k=1;
        for(int i=n;i>=1;i--){
            for(int j=n;j>=k;j--){
                System.out.print(j);
            }
            k++;
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern12 obj=new Pattern12();
        obj.main(n);
        sc.close();
    }
}