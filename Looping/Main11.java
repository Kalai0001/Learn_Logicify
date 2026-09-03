import java.util.Scanner;
public class Main11{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=3;i<=n;i+=3){
            System.out.printf("%d ",i);
        }
        sc.close();
    }
}