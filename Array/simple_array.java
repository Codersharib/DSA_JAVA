import java.util.*;
public class simple_array {
    public static void main(String[] arg) {
        Scanner sc=new Scanner(System.in);
        // int marks=sc.nextInt();
        int[] arr =new int[4];
        System.out.println("Enter 4 integers:");
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}

