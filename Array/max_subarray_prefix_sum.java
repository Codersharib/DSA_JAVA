public class max_subarray_prefix_sum {
    public static void maxSumofSubarray(int[] array){
        int maxsum= Integer.MIN_VALUE;
        int[] prefix=new int[array.length];
        prefix[0]=array[0];
        for(int i=1;i<array.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        for(int i=0;i<array.length;i++){
            int start=i;
            int currsum=0;
            for(int j=i;j<array.length;j++){
                int end=j;

                currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.print("maxsum is: "+maxsum);
    }

    public static void main(String[] args) {
        int[] array= {4,8,2,9,2};
        maxSumofSubarray(array);

    }
}
