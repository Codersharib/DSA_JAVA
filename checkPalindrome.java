import java.util.*;
public class checkPalindrome {
    public static boolean isPalindrome(int n){
        int reverse=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            reverse=reverse*10+rem;
            n/=10;
        }
        if(temp==reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a integer to check plindrome: ");
        int n=sc.nextInt();
        sc.close();
        System.out.println(isPalindrome(n));
    }
}
