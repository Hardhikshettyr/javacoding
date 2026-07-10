public class largest {
    public static void main(String[] args) {
        int largest=Integer.MIN_VALUE;
        int a[]={3,9,10,4,2};
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println(largest);
    }
}
