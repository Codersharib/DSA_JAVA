import java.util.*;
public class charPattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        for(int i=0;i<n;i++){
            
            for(int j=0;j<i+1;j++){
                System.out.print(ch);
                ch+=1;
            }
            System.out.println();
        }
    }
}