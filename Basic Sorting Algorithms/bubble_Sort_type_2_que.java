public class bubble_Sort_type_2_que {
    public static void bubblesort2(int arr[]){
       for(int i=0;i<arr.length-1;i++){
           int swap=0;
           for(int j=0;j<arr.length-1-i;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   swap++;
               }
           }
           if(swap==0){
               System.out.println("array is already sorted.");
               break;
           }
       }

    }
    public static void print(int arr[]){
        System.out.println("array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        bubblesort2(arr);
        print(arr);

    }
}
