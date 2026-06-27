public class print1ton {
    public static void print(int current, int n){
        if (current>n){
            return;
        }
        //  print(current+1,n);(Backtracking prints n to 1)
        System.out.println(current);
        print(current+1,n); //(Forward recursion prints 1 to n)
    }
    public static void main(String[] args) {
        print(1,5);
    }
}
