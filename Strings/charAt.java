public class charAt {
    public static void charAt(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        charAt("Sharib Kausar");
        String name="sharib";
        System.out.println("");
        System.out.print(name.charAt(4));
    }
}
