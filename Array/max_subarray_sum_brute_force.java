public class max_subarray_sum_brute_force {
    public static void max_sum_subarray(int[] array){
//        time complexity O(n2)
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=array[k];
                }
                if(max_sum<currsum){
                    max_sum=currsum;
                }
            }

        }
        System.out.print("max sum of subarrays is: "+max_sum);
    }
    public static void main(String[] args) {
        int[] array={3,6,1,8};
        max_sum_subarray(array);

    }
}
