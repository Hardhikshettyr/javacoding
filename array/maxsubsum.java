package array;

public class maxsubsum {
    public static int bruteforce(int a[]){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int cursum=0;
                for(int k=i;k<=j;k++){
                    cursum+=a[k];
                }
                System.out.println(cursum);
                if(cursum>maxsum){
                    maxsum=cursum;
                }
            }
        }
        return maxsum;
    }
    public static int prefixsum(int a[]){
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        int prefix []=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                cursum=i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                maxsum=Math.max(cursum,maxsum);
            }
        }
        return maxsum;
    } 
    public static int kadanes(int a[]){
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            cursum=Math.max(cursum+a[i], a[i]);
            maxsum=Math.max(maxsum,cursum);
        }
        return maxsum;
    }
    public static void main(String[]args){
        int a[]={1,3,-1,5,5};
        int result=kadanes(a);
        System.out.println("Maxsum: "+result);
    }
}
