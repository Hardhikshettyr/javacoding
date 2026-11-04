public class ispalindromearray {
    public static boolean isplaindrome(int n){
        int temp=n;
        int rev=0;
        while(temp!=0){
            int digit=temp%10;
            rev=(rev*10)+digit;
            temp/=10;
        }
        if(rev==n) 
            return true;
        return false;
    }
    public static void main(String[] args) {
        int arr[]={123,121,454,321};
        for(int i=0;i<arr.length;i++){
            if(isplaindrome(arr[i])){
                System.err.println(arr[i]);
            }
        }
    }
}
