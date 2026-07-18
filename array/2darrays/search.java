
public class search {
    public static boolean linear(int matrix[][], int target){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    // if matrix is soreted you can use single bianrysearch but if only rows and cols are sorted you have to perform mutiple b search using for loop
    public static boolean binary(int matrix[][], int target){
        int m=matrix.length;
        int n=matrix[0].length;

        int start=0;
        int end=m*n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int row=mid/n;
            int col=mid%n;

            if(matrix[row][col]==target){
                return  true;
            }
            else if (matrix[row][col]<target) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }

    //using multiple binary search makes code lessefiicient so we use staircase method only when matrix is not sorted if matrix is sorted binary search is efficeient
    public static boolean staircase(int matrix[][], int target){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
   public static void main(String[] args) {
       int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.println(staircase(arr,30));
   } 
}
