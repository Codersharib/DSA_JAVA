public class hollow_rhombus {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=n;j>0;j--){
                if(i==1||i==n||j==n||j==1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
