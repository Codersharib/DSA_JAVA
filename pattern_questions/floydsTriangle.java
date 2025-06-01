public class floydsTriangle {
    public static void main(){
        int n=5;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
