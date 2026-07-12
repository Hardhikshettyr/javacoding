public class majority {
    public static boolean majorityelement(int a[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest=Math.max(a[i],largest);
        }
        int count[]=new int [largest+1];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       int a[]={1,2,3,4};
       boolean result=majorityelement(a);
       System.out.println(result); 
    }
}
