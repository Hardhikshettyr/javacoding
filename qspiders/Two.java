public class Two{
    public static void main(String []args){
        int a[]={4,5,7,8,11,12};
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                sum+=a[i];
                count++;
            }
        }
        int avg=sum/count;
        System.out.println(avg);
    }
}