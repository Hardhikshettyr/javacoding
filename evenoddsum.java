
import java.util.Scanner;

public class evenoddsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter set of integers:");
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        System.out.println("enter"+n+ "integer");
        for(int i=1;i<=n;i++){
            int num=sc.nextInt();
            if(num%2==0){
                evensum+=num;
            }else{
                oddsum+=num;
            }
        }
        System.out.println("the sum of even integer is" +evensum);
        System.out.println("the Sum of odd integer is"+oddsum);
    }
}
