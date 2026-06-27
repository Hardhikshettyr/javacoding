public class printnto1{

    public static void print(int current){
        if(current<1){
            return;
        }

        // print(current-1);//backtracking(print 1 to n)
        System.out.println(current);
        print(current-1);//forward recursion( prints n to 1)
    }
    public static void main(String[] args) {
        print(5);
    }
}