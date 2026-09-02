package array;

public class maxsubsum {
    public static int bruteforce(int a[]){
        int maxsum=a[0];
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int cursum=0;
                for(int k=i ;k<=j;k++){
                    cursum+=a[k];

                }
                maxsum=Math.max(maxsum, cursum);
            }
        }
        return maxsum;
    }
    public static int prefixsum(int a[]){
        int maxsum=a[0];
        int cursum=0;
        int prefix[]=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                cursum=i==0? prefix[j]:prefix[j]-prefix[i-1];
                maxsum=Math.max(cursum,maxsum);
            }
        }
        return maxsum;
    } 
    public static int kadanes(int a[]){
       int cursum=a[0];
       int maxsum=a[0];
       for(int i=1;i<a.length;i++){
            cursum=Math.max(cursum+a[i], a[i]);
            maxsum=Math.max(cursum,maxsum);
       }
       return maxsum;
    }
    public static void main(String[]args){
        int a[]={-4,-1,-2};
        int result=kadanes(a);
        System.out.println("Maxsum: "+result);
    }
}
