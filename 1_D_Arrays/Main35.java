import java.util.*;
public class Main35{
    static void main(int n,long arr[]){
        
        Arrays.sort(arr);
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        // System.out.println(min);
        // System.out.println(max);
        
        long missingarr[] = new long[(int)(max-min + 1)];
        int a = 0;
        
        for(long i=min;i<=max;i++){
            missingarr[a++] = i;
        }
        
        // for(int i=0;i<a;i++){
        //     System.out.print(missingarr[i]+" ");
        // }
        
        long finalarr[] = new long[(int)(max - min + 1)];
        int b=0;
        
        int i1=0;
        for(int j2=0;j2<a;j2++){
            if(i1 == arr.length){
                finalarr[b++]=missingarr[j2];
            }
            else if(arr[i1]==missingarr[j2]){
                i1++;
            }
            else{
                finalarr[b++]=missingarr[j2];
            }
        }
        
        // for(int i=0;i<b;i++){
        //     System.out.print(finalarr[i]+" ");
        // }
        
        
        long missing=0;
        long minmiss = Long.MAX_VALUE;
        
        
        for(int i=0;i<b;i++){
            if(finalarr[i] > 0 && finalarr[i]<minmiss){
                minmiss = finalarr[i];
                break;
            }
        }
        
        System.out.printf("%d",minmiss);
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        main(n,arr);
        sc.close();
    }
}