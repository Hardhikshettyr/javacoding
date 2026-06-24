
public class palindrome {
    public static boolean ispalindrome(int n){
        int original=n;
        int rev=0;
        int ld=0;
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=(rev*10)+ld;
        }
        return original==rev;

    }
    public static void main(String []args){
        boolean result=ispalindrome(-121);
        System.out.println(result);
    }
}
