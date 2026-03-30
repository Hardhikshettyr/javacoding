public class bc {
    public static int bic(int n,int r){
        int n1=1;
        int r1=1;
        int k=1;
        int c,i;
        for(i=1;i<=n;i++){
            n1=n1*i;
        }
        for(i=1;i<=r;i++){
            r1=r1*i;
        }
        for(i=1;i<=n-r;i++){
            k=k*i;
        }
        c=n1/(r1*k);
        return c;
    }
    public static void main(String[] args) {
        System.out.println(bic(5,2));
    }
}
