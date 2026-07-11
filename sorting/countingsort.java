package sorting;

public class countingsort {
    public static void sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(arr[i],largest);
        }
        int count[]=new int [largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
    public static void main(String[]args){
        int arr[]={7,7,2,3,2,4,1,1};
        sort(arr);
    }
    
}
