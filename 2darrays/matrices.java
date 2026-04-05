import java.util.Scanner;
public class matrices{

    public static int largest(int matrix[][]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                large=Math.max(matrix[i][j], large);
            }
        }
        return large;
    }

    public static int smallest(int matrix[][]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                small=Math.min(matrix[i][j], small);
            }
        }
        return small;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        int large=largest(matrix);
        int small=smallest(matrix);
        System.out.println("smallest value: "+small);
        System.out.println("largest value: "+large);
    }
}