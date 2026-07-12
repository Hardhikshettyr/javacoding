public class trappingwater{
    public static void main(String[] args) {
        int a[]={4,2,0,6,3,2,5};
        int trap=0;
        int left[]= new int[a.length];
        int right[]=new int[a.length];
        left[0]=a[0];
        right[right.length-1]=a[a.length-1];
        for(int i=1;i<a.length;i++){
            left[i]=Math.max(left[i-1],a[i]);
        }
        for(int i=a.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],a[i]);
        }
        for(int i=0;i<a.length;i++){
            trap+=((Math.min(left[i],right[i]))-a[i]);
        }
        System.out.println(trap);

    }
}