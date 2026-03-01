public class btd {
    public static void btd1(int n) {
        int pow=0;
        int dec=0;
        while(n>0){
            int ld=n%10;
            dec=dec+(ld*(int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
       btd1(101) ;
    }
}
