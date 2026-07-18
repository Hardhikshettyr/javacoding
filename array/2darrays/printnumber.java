
public class printnumber {
    public static int linear(int matrix[][], int n){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==n){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] array = { {4,7,8},{8,8,7} };
        System.out.println(linear(array, 7));
    }
}
