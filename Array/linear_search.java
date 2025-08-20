import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element to search in array: ");
        int element=sc.nextInt();
        int[] arr={4,8,2,6,9,4,3};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.print("found at index: "+i);
            } else{
                System.out.print("not found!");
                break;
            }
        }
    }
}
