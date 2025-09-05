public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Sharib_");
        String str="Kausar";
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
