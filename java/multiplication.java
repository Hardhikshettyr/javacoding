
import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for multiplication1");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int multi=n*i;
            System.out.println(n+ " * " +i+ " = " +multi);
        }
    }
}
