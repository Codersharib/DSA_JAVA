import java.util.Arrays;
import java.util.Collections;
public class inbuilt_sorting_java {
    public static void print(int arr[]){
        System.out.println("array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void print2(Integer arr[]){
        System.out.println("array is: ");
        for(Integer i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[]={3,7,5,8,3};
        Arrays.sort(arr,0,3);
        System.out.println("array after partly sorting: ");
        print(arr);
        Arrays.sort(arr);
        System.out.println("array after completley sorting: ");
        print(arr);
        Integer arr2[]={4,8,2,6,2,0,7,2};
        Arrays.sort(arr2,0,1,Collections.reverseOrder());
        System.out.println("array after partly sorting decresingly: ");
        print2(arr2);
        Arrays.sort(arr2,Collections.reverseOrder());
        System.out.println("array after completely sorting decresingly: ");
        print2(arr2);



    }
}
