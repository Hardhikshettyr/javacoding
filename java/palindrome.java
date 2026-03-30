public class palindrome {
    public static void pal(int n){
        int rev=0;
        int org=n;
        while(n>0){
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        if(org==rev){
            System.out.println("is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args) {
        pal(121);
    }
}
