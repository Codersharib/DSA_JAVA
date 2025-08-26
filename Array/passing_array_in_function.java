import java.util.*;

public class passing_array_in_function {
    public static void passing_array(int[] arr,int n){
        for(int i=0;i<n;i++){
            arr[i]+=1;
        }
        System.out.print("now array is after modification: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
    }
        public static void main(String[] arg) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the size of array: ");
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                System.out.println("enter array element(integer) at index "+i);
                arr[i]=sc.nextInt();
            }
            passing_array(arr,n);


        }
}



