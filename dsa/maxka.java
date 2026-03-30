public class maxka {
    public static void kadanees(int arr[]){
        int cs = arr[0];  
        int ms = arr[0];   

        for(int i = 1; i < arr.length; i++){
            cs = Math.max(arr[i], cs + arr[i]); 
            ms = Math.max(ms, cs);
        }

        System.out.println(ms);
    }
    public static void kadanees1(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;

        int maxElement = Integer.MIN_VALUE; // ✅ added

        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];

            if(arr[i] > maxElement){   // ✅ added
                maxElement = arr[i];
            }

            if(cs<0){
                cs=0;
            }

            ms=Math.max(cs,ms);
        }

        if(ms == 0){   // ✅ added check
            ms = maxElement;
        }

        System.out.println(ms);
    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,-1,-2,-3};
        kadanees1(arr);
    }
}