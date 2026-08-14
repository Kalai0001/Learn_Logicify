import java.util.Scanner;
public class Pattern20{
    void main(String s){
        char arr[]=s.toCharArray();
        
        int k=0;
        for(int i=arr.length;i>=1;i--){
            for(int j=k;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
            k++;
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Pattern20 obj=new Pattern20();
        obj.main(s);
        sc.close();
    }
}
