import java.util.Scanner;
public class Lucky{
    
    void lucky(String s){
        char arr[]=s.toCharArray();
        int flag=1;
        for(int i=0;i<arr.length;i++){
            char ch1=arr[i];
            int num1=ch1-'0';
            for(int j=0;j<arr.length;j++){
                char ch2=arr[j];
                int num2=ch2-'0';
                
                if(i!=j && num1==num2){
                    flag=0;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.printf("YES");
        }else{
            System.out.printf("NO");
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Lucky obj=new Lucky();
        obj.lucky(s);
        sc.close();
    }
}
