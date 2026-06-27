// factorial can be solved by iteration using for loop

//and also by recursion method

public class factorial {
    public static int solution(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*solution(n-1);
    }
    public static void main(String[]args){
        System.out.println(solution(5));
    }
} 
