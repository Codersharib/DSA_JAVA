import java.util.*;
public class print_prime_in_range{
    public static boolean isPrime(int n){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a natural no to check for prime in a range : ");
        int num=sc.nextInt();
        System.out.println("prime numbers are: ");
        for(int i=2;i<=num;i++){
            if(isPrime(i)==true){
                System.out.println(i);
            }
        }
    }
}