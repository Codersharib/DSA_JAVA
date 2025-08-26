public class insertion_Sort {
    public static void insertion_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
//            insertion
            arr[prev+1]=curr;
        }

    }
    public static void print(int arr[]){
        System.out.println("array after sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={5,2,4,3,1,6,9,3,6,3,8};
        insertion_sort(arr);
        print(arr);

    }
}
