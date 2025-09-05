import java.util.*;
public class Strings_simple_operation {
    public static void main(String[] args) {
        char str[]={'a','b','c','d'};
        System.out.println(str);
        String str1="sharib";
        System.out.println(str1);
        String str2=new String("kausar");
        System.out.println(str2);
        String st="sharib kausar";
        System.out.println(st);
        System.out.println(st.length());
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("enter string without space: ");
        name=sc.next();
        System.out.println(name);
        sc.nextLine();
        String name2;
        System.out.print("enter string: ");
        name2=sc.nextLine();
        System.out.println(name2);
//        concatenation
        String firstname="sharib";
        String surname="kausar";
        String name3=firstname+" "+surname;
        System.out.println(name3);
    }
}
