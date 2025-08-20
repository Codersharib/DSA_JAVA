import java.util.*;
public class binary_search {
    public static int binarySearch(int[] sorted_array,int key){
        int start=0;
        int end=sorted_array.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(sorted_array[mid]==key){
                return mid;
            }
            if(sorted_array[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter key element to search in array: ");
        int key=sc.nextInt();
        int[] sorted_array={1,3,5,6,8,9};
        int result=binarySearch(sorted_array,key);
        if(result==-1){
            System.out.print("not found.");
        }
        else{
        System.out.print("yes found at index: "+result);
        }
    }
}
