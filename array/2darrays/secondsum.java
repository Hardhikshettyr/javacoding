
public class secondsum {
    public static void main(String[] args) {
        int sum=0;
        int[][] matrix = { {1,4,9},{11,4,3},{2,2,3} };
        for(int i=0;i<matrix[0].length;i++){
            sum+=matrix[1][i];
        }
        System.out.println(sum);
    }
}
