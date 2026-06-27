public class fib {
    public static int[] bruteforce(int n){
        if (n == 0) {
            return new int[]{0};
        }

        if (n == 1) {
             return new int[]{0, 1};
        }
        int fibo[]=new int[n+1];
        fibo[0]=0;
        fibo[1]=1;
        for(int i=2;i<=n;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        return fibo;
    }

    public static void optimal(int n){
        if (n==0) {
            System.out.println(n);
        }


        int firstterm=0;
        int secondterm=1;

        System.out.println(0);
        System.out.println(1);

        int thirdterm=0;
        for(int i=2;i<=n;i++){
            thirdterm=firstterm+secondterm;
            firstterm=secondterm;
            secondterm=thirdterm;
            System.out.println(thirdterm);
        }
    }

    public static int recursion(int n){
        if(n<=1){
            return n;
        }
        return recursion(n-1)+recursion(n-2);
    }

    public static void print(int current,int n){
        if (current>n){
            return;
        }
        System.out.println(recursion(current));
        print(current+1,n);
    }
    public static void main(String[]args){
        int n=6;
        int fibo[]=bruteforce(n);
        print(0,n);
        // System.out.println(recursion(n));
        // for(int num:fibo){
        //     System.out.println(num);
        // }

    }
}
