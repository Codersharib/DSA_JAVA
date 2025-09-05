public class staircase_search_from_bottom_left_corner {
    public static boolean staircase_search_bottom_left_corner(int matrix[][],int key){
        int col=0;
        int row=matrix.length-1;
        while(col<matrix[0].length && row>=0){
            if(matrix[row][col]==key){
                System.out.println(key+" found at index: ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else{
                col++;
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
        staircase_search_bottom_left_corner(matrix,key);
    }
}
