
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        int sum=0;
        while(count<=n){
            sum=sum+count;
            count++;
        }
        System.out.println("the sum is"+sum);
    }
}
