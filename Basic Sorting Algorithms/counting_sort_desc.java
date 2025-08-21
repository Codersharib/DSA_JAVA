public class counting_sort_desc {
    public static void counting_sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
//        sorting
        int j=0;
        for(int i=largest;i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }

        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={2,8,6,9,3,2};
        counting_sort(arr);
        print(arr);
    }
}
