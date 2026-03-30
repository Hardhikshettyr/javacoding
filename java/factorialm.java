public class factorialm {
    public static int facto(int n) {
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int facto=facto(0);
        System.out.println(facto);
    }
}
