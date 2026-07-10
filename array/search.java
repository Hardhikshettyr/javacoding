package array;

public class search {

    public static int linear(int a[],int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static int binary(int a[],int target){
        int start=0, end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==target){
                return mid;
            }else if(target>a[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int target=1;
        int result=binary(a, target);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at indes:"+result);
        }
    }
}
