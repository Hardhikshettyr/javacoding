
public class reversenumber {

    public static void reverse(int n){
        int reverse=0;
        int ld=0;

        while(n>0){
            ld=n%10;
            
            reverse=(reverse*10)+ld;
            n=n/10;
        }

        System.out.println(reverse);
    }
    public static void main(String[]args){
        reverse(12345);
    }
}
