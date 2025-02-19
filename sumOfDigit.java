import java.util.*;
public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to its digit's sum: " );
        int num=sc.nextInt();
        sc.close();
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("sum of its digits is: "+sum);
    }
}
