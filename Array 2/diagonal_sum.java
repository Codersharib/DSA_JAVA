public class diagonal_sum {
    public static void diagonalSum_bruteForce(int matrix[][]){
        System.out.println("using bruteforce time complexity of O(n2).");
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1 && i!=j){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("sum of diagonal elements is: "+sum);
    }
    public static void diagonalSum_On(int matrix[][]){
        System.out.println("using time complexity of O(n).");
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("sum of diagonal elements is: "+sum);

    }

    public static void main(String[] args) {
        int matrix[][]={
                {0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}
        };
        diagonalSum_bruteForce(matrix);
        diagonalSum_On(matrix);
    }
}
