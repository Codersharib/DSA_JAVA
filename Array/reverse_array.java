public class reverse_array {
    public static void reverseArray(int[] array){
        int start=0,end=array.length-1;
        //swapping
        while(start<=end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.print("reversed array is: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] array={4,7,2,8,1,6};
        reverseArray(array);
    }
}
