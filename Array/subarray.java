public class subarray {
    public static void subArray(int[] array){
        int ts=0;
        int index=0;
        int[] sum_array=new int[array.length*(array.length+1)/2];
        for(int i=0;i<array.length;i++){
                    int sum_subarray=0;
            for(int j=i;j<array.length;j++){
                    sum_subarray+=array[j];

                for(int k=i;k<=j;k++){
                    System.out.print(array[k]);
                }
                sum_array[index++]=sum_subarray;
                System.out.println();
                ts++;
            }
        }
        int smallest=Integer.MAX_VALUE;
        int greatest=Integer.MIN_VALUE;
        for(int i=0;i<ts;i++){
            if(smallest>sum_array[i]){
                smallest=sum_array[i];
            }
            if(greatest<sum_array[i]){
                greatest=sum_array[i];
            }
        }
        System.out.println("smallest subarray is: "+smallest);
        System.out.println("greatest subarray is: "+greatest);
        System.out.print("total subarray is: "+ts);
    }
    public static void main(String[] args) {
        int[] array={3,7,2,9};
        subArray(array);
    }
}
