
public class search {


    public static int binarysearch(int num[],int key){
        int start=0,end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static int linearsearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
            
        }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int key=6;
        int index=linearsearch(arr, key);
        System.out.println(index);
    }
}
