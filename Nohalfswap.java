import java.util.Scanner;
public class Nohalfswap{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Nohalfswap obj=new Nohalfswap();
        obj.swaphalves(s);
        sc.close();
    }
    void swaphalves(String s){
        String res=ans(s);
        System.out.printf(res);
    }
    public static String ans(String s){
        char arr1[]=s.toCharArray();
        String finalswap="";
        if(arr1.length==12){
            String newans="";
            for(int i=2;i<arr1.length;i++){
                char ch=arr1[i];
                newans=newans+ch;
            }
            String firsthalf="";
            char arr2[]=newans.toCharArray();
            for(int i=0;i<arr2.length/2;i++){
               char ch=arr2[i];
               firsthalf=firsthalf+ch;
            }
            String secondhalf="";
            for(int i=5;i<arr2.length;i++){
                char ch=arr2[i];
                secondhalf=secondhalf+ch;
            }
            finalswap=secondhalf+firsthalf;
        }
        if(arr1.length==10){
            String newans="";
            for(int i=0;i<arr1.length;i++){
                char ch=arr1[i];
                newans=newans+ch;
            }
            String firsthalf="";
            char arr2[]=newans.toCharArray();
            for(int i=0;i<arr2.length/2;i++){
               char ch=arr2[i];
               firsthalf=firsthalf+ch;
            }
            String secondhalf="";
            for(int i=5;i<arr2.length;i++){
                char ch=arr2[i];
                secondhalf=secondhalf+ch;
            }
            finalswap=secondhalf+firsthalf;
        }
        return finalswap;
    }
}