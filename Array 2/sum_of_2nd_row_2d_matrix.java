public class sum_of_2nd_row_2d_matrix {
    public static void sumOf2ndRow(int matrix[][]){
        int sum=0;
        for(int j=0;j<matrix[0].length;j++){
            sum+=matrix[1][j];
        }
        System.out.println("sum of all elements of 2nd row is: "+sum);
    }
    public static void main(String[] args) {
        int matrix[][]={
                {7,1,2,3},
                {4,5,6,7},
                {8,9,7,11},
                {12,7,14,15}
        };
        sumOf2ndRow(matrix);
    }
}
