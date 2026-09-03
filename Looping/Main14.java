import java.util.Scanner;
public class Main14{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();
        long ans=1;
        for(int i=1;i<=power;i++){
            ans=ans*base;
        }
        System.out.printf("%d",ans);
        sc.close();
    }
}