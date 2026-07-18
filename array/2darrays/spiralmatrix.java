public class spiralmatrix{

    public static void spiral(int matrix[][]){
        int sr=0,sc=0;
        int er=matrix.length-1, ec=matrix[0].length-1;
        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                System.out.print(matrix[sr][i]+" ");
            }
            for(int i=sr+1;i<=er;i++){
                System.out.print(matrix[i][ec]+" ");
            }
            for(int i=ec-1;i>=sc;i--){
                System.out.print(matrix[er][i]+" ");
            }
            for(int i=er-1;i>=sc+1;i--){
                System.out.print(matrix[i][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
    }
    public static void main(String[]args){
        int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        spiral(arr);

    }
}