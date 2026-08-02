import java.util.Scanner;
public class Circularno{
    
    void main(long n1,long n2){
        int digit=0;
        long temp=n2;
        while(temp!=0){
            digit++;
            temp=temp/10;
        }
        
        long num=n2;
        
        for(int i=1;i<=digit;i++){
            long ld=num%10;
            num=num/10;
            int pow=1;
            for(int j=1;j<digit;j++){
                pow=pow*10;
            }
            
            num=ld*pow+num;
            
            if(num==n1){
                System.out.printf("Yes");
                return;
            }
        }
        System.out.printf("No");
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n1=sc.nextLong();
        long n2=sc.nextLong();
        Circularno obj=new Circularno();
        obj.main(n1,n2);
        sc.close();
    }
}