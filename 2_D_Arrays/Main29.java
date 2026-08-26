import java.util.*;
public class Main29{
    static void main(int r,int c,long arr[][]){
        
        LinkedHashSet<ArrayList<Long>> set = new LinkedHashSet<>();
        
        for(int i = 0; i< r; i++){
            ArrayList<Long> list = new ArrayList<>();
            for(int j = 0; j < c; j++){
                list.add(arr[i][j]);
            }
            if(!set.contains(list)){
                set.add(list);
                
                for(long x : list){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            else{
                System.out.println();
            }
        }
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
        main(r,c,arr);
        sc.close();
    }
}