public class invertedRotatedHalfPyramid {
    public static void main(String[] args){
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=i+1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
