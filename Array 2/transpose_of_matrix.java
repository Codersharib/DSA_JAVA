public class transpose_of_matrix {
    public static void transpose(int matrix[][]){
//        printing
        System.out.println("before transposing matrix is : ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
//        transposing
        int row=matrix.length;
        int col=matrix[0].length;
        int transpose[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
//        printing
        System.out.println("after transposing matrix is : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int matrix[][]={
                {7,1,2,3},
                {4,5,6,7},
                {8,9,7,11},
                {12,7,14,15}
        };
        transpose(matrix);
    }
}
