import java.util.*;
public class bin_to_dec{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter binary no:  ");
        int n=sc.nextInt();
        int pow=0;
        double dec=0;
        while(n>0){
            int rem=n%10;
            dec+=rem*Math.pow(2,pow);
            pow++;
            n/=10;
        }
        System.out.println(dec);
    }
}