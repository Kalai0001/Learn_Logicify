import java.util.*;
public class Main37{
    static void main(int n,long arr[],int key){
        
        Arrays.sort(arr);
        
        long min = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        
        long max = Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        

        long missingarr[] = new long[(int)(max - min + 1)];
        int a = 0;
        
        for(long k=min;k<=max;k++){
            missingarr[a++] = k;
        }
        
        
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
        
        int flag=0;
        long missing=0;
        
        
        
        for(int i=0;i<b;i++){
            if(i == key - 1){
                missing = finalarr[i];
                flag=1;
                break;
            }
        }
        
        
        
        if(flag==1){
            System.out.printf("%d",missing);
        }
        else{
            System.out.print(-1);
        }
        
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        int key = sc.nextInt();
        main(n,arr,key);
        sc.close();
    }
}