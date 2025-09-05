import java.util.*;
public class decToBin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter decimal no:  ");
        int n=sc.nextInt();
        int pow=0;
        int binaryNo=0;
        while(n>0){
            int rem=n%2;
            binaryNo+=rem*(int)Math.pow(10,pow);
            pow+=1;
            n/=2;
        }
        System.out.println("binary no is: "+binaryNo);
    }
}
