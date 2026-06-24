import java.util.Scanner;

public class aphatri {
    public static void solution(int n){
        for(int i=0;i<n;i++){
            
            for(char ch=(char)('A'+n-i-1);ch<='A'+n-1;ch++){
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
