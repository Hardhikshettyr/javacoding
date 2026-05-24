
public class sort{
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            //i means number of turn
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
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int cur=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;
            } 
            arr[prev+1]=cur;
        }
    }
    
    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest =Math.max(largest,arr[i]);
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
        
    }
    public static void dispaly(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[]args){
        int arr[]={1,4,1,2,3,4,3,7};
        // bubblesort(arr);  
        // selectionsort(arr);
        // insertionsort(arr);
        // Arrays.sort(arr);     
        // Arrays.sort(arr,0,2);
        // Arrays.sort(arr,Collections.reverseOrder());
        countingsort(arr);
        dispaly(arr);
    }
}