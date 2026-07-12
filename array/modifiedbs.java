public class modifiedbs {
    public static int search(int num[], int target){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(num[mid]==target){
                return mid;
            }
            if(num[start]<=num[mid]){
                if(target>=num[start] && target<num[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>num[mid] && target<=num[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int a[]={4,5,6,7,0,1,2};
        int target=3;
        int result=search(a,target);
        System.out.println(result);
    }
}
