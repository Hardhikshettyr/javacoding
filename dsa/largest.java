public class largest{
    public static int lg(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,5,4,7};
        System.out.println(lg(arr));
    }
}