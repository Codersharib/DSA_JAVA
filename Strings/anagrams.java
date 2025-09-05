import java.util.*;
public class anagrams {
    public static void Anagrams(String str1,String str2){
        if(str1.length()!=str2.length()){
            System.out.println("not anagram.");
            return;
        }
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String st1=String.valueOf(arr1);
        String st2=String.valueOf(arr2);
        if(st1.equals(st2)){
            System.out.println("its anagram.");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string: ");
        String str1=sc.next();
        System.out.println("Enter the 1st string: ");
        String str2=sc.next();
        Anagrams(str1,str2);
    }
}
