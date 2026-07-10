public class smallest {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int a[]={3,9,10,4,2};
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
