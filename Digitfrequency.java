import java.util.Scanner;
public class Digitfrequency{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        Digitfrequency obj=new Digitfrequency();
        obj.res(n);
        sc.close();
    }
    void res(long n){
        long zero=0;long one=0;long two=0;long three=0;long four=0;
        long five=0;long six=0;long seven=0;long eight=0;long nine=0;
        while(n!=0){
            long a=n%10;
            if(a==0){
                zero++;
            }
            else if(a==1){
                one++;
            }
            else if(a==2){
                two++;
            }
            else if(a==3){
                three++;
            }
            else if(a==4){
                four++;
            }
            else if(a==5){
                five++;
            }
            else if(a==6){
                six++;
            }
            else if(a==7){
                seven++;
            }
            else if(a==8){
                eight++;
            }
            else if(a==9){
                nine++;
            }
            n=n/10;
        }
        System.out.printf("0 : %d \n",zero);
        System.out.printf("1 : %d \n",one);
        System.out.printf("2 : %d \n",two);
        System.out.printf("3 : %d \n",three);
        System.out.printf("4 : %d \n",four);
        System.out.printf("5 : %d \n",five);
        System.out.printf("6 : %d \n",six);
        System.out.printf("7 : %d \n",seven);
        System.out.printf("8 : %d \n",eight);
        System.out.printf("9 : %d \n",nine);
    }
}