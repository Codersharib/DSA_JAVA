public class search_in_sorted_matrix {
    //    brute_force method
    public static void bruteForce(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]) {
                    System.out.println(key + " found at index: (" + i + "," + j + ")");
                }
            }
        }
    }

    //    row wise using binary search
    public static int row_wise_binary_search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
//            binary search
            int l = 0;
            int r = matrix.length - 1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (matrix[i][mid] == key) {
                    System.out.println(key + " found at index: (" + i + "," + mid + ")");
                    return mid;
                } else if (matrix[i][mid] < key) {
                    l = mid + 1;
                } else if (matrix[i][mid] > key) {
                    r = mid - 1;
                }
            }
        }
                return -1;
    }
//    staircase search

    public static boolean staircase_search(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length&&col>=0){
            if(matrix[row][col]==key){
                System.out.println(key+" found at index: ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        int key=33;
        bruteForce(matrix,key);
        row_wise_binary_search(matrix,key);
        staircase_search(matrix,key);
    }
}
