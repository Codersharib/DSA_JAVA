import java.util.*;
public class largest_value {
    public static int largest_no(int[] array){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(largest<array[i]){
                largest=array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element at index: "+i);
            array[i]=sc.nextInt();
        }
        int largest=largest_no(array);
        System.out.print("largest element is :"+largest);
    }
}
