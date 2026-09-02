public class spiralmatrix{

    public static void spiral(int matrix[][]){
        int startrow=0,startcol=0;
        int endrow=matrix.length-1, endcol=matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            for(int i=startcol;i<=endcol;i++){
                System.out.println(matrix[startrow][i]+" ");
            }
            for(int i=startrow+1;i<=endrow;i++){
                System.out.println(matrix[i][endcol]+" ");
            }
            for(int i=endcol-1;i>=startcol;i--){
                System.out.println(matrix[endrow][i]+" ");
            }
            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.println(matrix[i][startcol]+" ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        
    }
    public static void main(String[]args){
        int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        spiral(arr);

    }
}