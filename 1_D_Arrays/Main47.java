import java.util.Scanner;
public class Main47{
    static void main(int n1,int n2,int n3,long arr1[],long arr2[],long arr3[],
    long target){
        int flag = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                for(int k = 0; k < arr3.length; k++){
                    if(arr1[i] + arr2[j] + arr3[k] == target){
                        flag = 1;
                        System.out.printf("%d %d %d",arr1[i],arr2[j],arr3[k]);
                        return;
                    }
                }
            }
        }
        if(flag == 0){
            System.out.printf("No such triplets");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        long arr1[] = new long[n1];
        long arr2[] = new long[n2];
        long arr3[] = new long[n3];
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextLong();
        }
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextLong();
        }
        for(int i = 0; i < n3; i++){
            arr3[i] = sc.nextLong();
        }
        long target = sc.nextLong();
        
        main(n1,n2,n3,arr1,arr2,arr3,target);
        sc.close();
    }
}