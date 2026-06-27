// we can solve this by 3 approches 
//1. traditional by adding value at every iteration at for loop
//2 using formula n*(n+1)/2


//3 recurive method

public class sum {
    public static int solution(int n){
        if(n==1) 
            return 1;

        return n+solution(n-1);
    }
    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
