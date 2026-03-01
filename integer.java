public class integer {
    public static void sum(int n){
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        sum(561);
    }
}
