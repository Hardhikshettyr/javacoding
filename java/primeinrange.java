public class primeinrange {
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
    public static void pir(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.print(i+",");
            }
        }
    }
    public static void main(String[] args) {
        pir(10);
    }
}
