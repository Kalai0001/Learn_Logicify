import java.util.Scanner;
public class Pattern18{
    void main(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            if(i>=1){
                for(int k=2;k<=n-i+1;k++){
                    System.out.print(k+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern18 obj=new Pattern18();
        obj.main(n);
        sc.close();
    }
}