import java.util.Scanner;

public class number {

    public static void solution(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int bottom=(2*n-2)-i;
                int right=(2*n-2)-j;
                System.out.print(n-Math.min(Math.min(top,bottom), Math.min(left,right)));
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=Sc.nextInt();
        solution(n);
    }
}
 