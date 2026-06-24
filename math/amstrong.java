
public class amstrong {

    public static boolean solution(int n){
        int k=String.valueOf(n).length();
        int sum=0;
        int num=n;
        while(n>0){
            int ld=n%10;
            sum+=Math.pow(ld,k);
            n=n/10;

        }
        return num==sum;
    }
    public static void main(String [] args){
        int number=143;
        boolean result=solution(number);
        System.out.println(result);
    }
}
