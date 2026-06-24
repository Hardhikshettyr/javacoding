import java.util.Scanner;

public class numbercrown {

    public static void solution(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("");
        }

    }
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=Sc.nextInt();
        solution(n);
    }
}
 