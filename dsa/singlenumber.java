public class singlenumber{
    public static int sn(int arr[]){
        int index=0;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }

        int count[]=new int [largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]==1){
                index=i;
            }
        }
        return index;
    }
    public static void main(String []args){
        int arr[]={4,1,2,1,2};
        int index=sn(arr);
        System.out.println(index);
    }
}