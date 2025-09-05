public class search_no_of_times_7_appearing {
    public static void count_7(int matrix[][]){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("7 appeared in the given matrix "+count+" times.");
    }

    public static void main(String[] args) {
        int matrix[][]={
                {7,1,2,3},
                {4,5,6,7},
                {8,9,7,11},
                {12,7,14,15}
        };
        count_7(matrix);
    }
}
