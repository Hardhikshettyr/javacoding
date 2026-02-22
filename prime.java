
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println("n is a prime number");
        }
        else{
        //     for(int i=2;i<=n-1;i++){
        //     if(i%n==0){
        //         System.out.println("n is a prime number");
        //         break;
        //     }
        //     else{
        //         System.out.println("n is not prime number");
        //         break;
        //     }
        //    }
            for(int i=2;i<=Math.sqrt(n);i++){
            if(i%n==0){
                System.out.println("n is a prime number");
                break;
            }
            else{
                System.out.println("n is not prime number");
                break;
            }
           }
        }   
    }
}
