import java.util.Scanner;

public class alpharamptriangle {
    public static void solution(int n){
        for(int i=0;i<n;i++){
            char ch=(char)('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
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
