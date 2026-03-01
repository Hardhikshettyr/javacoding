
import java.util.Scanner;

public class even {
    public static boolean isEven(int n){
        if(n%2==0){
            return true; 
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean even1=isEven(n);
        System.out.println(even1);
    }
}
