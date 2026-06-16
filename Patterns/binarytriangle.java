import java.util.Scanner;

public class binarytriangle {
    public static void solution(int n){
        int start;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                start=1;

            }else{
                start=0;
            }
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start=1-start;
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
