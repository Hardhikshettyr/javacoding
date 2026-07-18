
public interface transpose {
    public static void main(String[] args) {
        int row=2, col=3;
        int[][] array = { {4,7,8},{8,8,7} };
        printmatrix(array);

        int [][] transpose=new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=array[i][j];
            }
        }
        printmatrix(transpose);
    }

    public static void printmatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
