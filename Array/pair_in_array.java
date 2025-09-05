public class pair_in_array {
    public static void pair_in_Array(int[] array){
        System.out.print("pairs are: ");
        int tp=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+array[i]+","+array[j]+"),");
                tp++;
            }
        }
        System.out.println("");
        System.out.print("total pairs: "+tp);
    }
    public static void main(String[] args) {
        int[] array={3,6,1,7,8};
        pair_in_Array(array);
    }
}
