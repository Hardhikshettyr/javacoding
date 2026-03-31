public class sort{
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                return;
            }
        }
    }
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void dispaly(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[]args){
        int arr[]={5,4,1,3,2};
        insertionsort(arr);       
        dispaly(arr);
    }
}