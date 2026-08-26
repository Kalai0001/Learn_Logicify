import java.util.*;
public class Main27{
    static void main(int r,int c,long arr[][],int k){
        
        // long arr1[] = new long[r * c];
        
        ArrayList<Long> list = new ArrayList<>();
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                list.add(arr[i][j]);
            }
        }
        
        for(int i = 0; i < list.size();i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i) < list.get(j)){
                    long tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tmp);
                }
            }
        }
        System.out.println(list.get(k - 1));
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        long arr[][] = new long[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextLong();
            }
        }
        int k = sc.nextInt();
        main(r,c,arr,k);
        sc.close();
    }
}