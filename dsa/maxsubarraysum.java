public class maxsubarraysum {
    public static void bruteforce(int arr[]) {
        int currsum;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
            
        }
        System.out.println("maxsum:"+maxsum);
    }

    public static void prefixsum(int arr[]) {
        int currsum;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("maxsum:"+maxsum);
    }

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

        int maxElement = Integer.MIN_VALUE; 

        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];

            if(arr[i] > maxElement){
                maxElement = arr[i];
            }

            if(cs<0){
                cs=0;
            }

            ms=Math.max(cs,ms);
        }

        if(ms == 0){ 
            ms = maxElement;
        }

        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[]={1};
        kadanees(arr);
    }
}
