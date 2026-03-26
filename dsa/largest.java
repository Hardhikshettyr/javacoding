
public class largest {
    public static int largestarray(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(largest<=arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,3};
        int result=largestarray(arr);
        System.out.println(result);
    }
}
