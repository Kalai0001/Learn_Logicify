import java.util.Scanner;
public class Circularprime{
    
    void main(long n){
        int digit=0;
        long temp=n;
        while(temp!=0){
            digit++;
            temp=temp/10;
        }
        
        long num=n;
        
        
        int flag=1;
        for(int i=1;i<=digit;i++){
            long ld=num%10;
            num=num/10;
            int pow=1;
            for(int j=1;j<digit;j++){
                pow=pow*10;
            }
            
            num=ld*pow+num;
            
            for(int k=2;k<num;k++){
                if(num%k==0){
                    flag=0;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.printf("CIRCULAR PRIME");
        }else{
            System.out.printf("NOT CIRCULAR PRIME");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        Circularprime obj=new Circularprime();
        obj.main(n);
        sc.close();
    }
}