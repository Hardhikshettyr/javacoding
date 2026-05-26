

public class search {
    public static boolean bruteforce(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    return true;
                }
            }
            
        }
        return false;
    }
    
    public static boolean binarySearch(int matrix[][], int key){
        int n=matrix.length;
        int m=matrix[0].length;

        int start=0;
        int end=n*m-1;

        while(start<=end){
            int mid=(start+end)/2;
            int row=mid/m;
            int col=mid%m;

            if(matrix[row][col]==key){
                System.out.println("Key foun at index ( "+row+","+col+")");
                return true;
            }else if(matrix[row][col]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println("Key not found");
        return  false;
    }

    public static boolean staircase(int matrix[][], int key){
        int row=0;
        int col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key foun at index ( "+row+","+col+")");
                return true;
            }else if(matrix[row][col]>key){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }

    public static boolean staircase1(int matrix[][], int key){
        int row=matrix.length-1;
        int col=0;

        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==key){
                System.out.println("Key foun at index ( "+row+","+col+")");
                return true;
            }else if(key>matrix[row][col]){
                col++;
            }else{
                row--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        boolean index=staircase1(matrix,10);
        System.out.println(index);
    }
}





