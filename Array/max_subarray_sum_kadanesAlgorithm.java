public class max_subarray_sum_kadanesAlgorithm {
    public static void subarraySum(int[] array){
        int currsum=0;
        int maxsum= Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            currsum+=array[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(currsum,maxsum);
        }
        System.out.print("max sum is: "+maxsum);
    }

    public static void main(String[] args) {
        int[] array={-2,-3,4,-1,-2,1,5,-3};
        subarraySum(array);
    }
}
