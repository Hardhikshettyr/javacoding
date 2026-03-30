public class primem {
    public static boolean prime(int n){
        boolean isprime=true;
        // for(int i=2;i<=n-i;i++){
        //     if(n%i==0){
        //         isprime=false;
        //     }
        // }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        System.out.println(prime(2));
    }
}
