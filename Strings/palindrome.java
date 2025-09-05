public class palindrome {
    public static boolean Palindrome(String str){
        boolean palindrome1=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                palindrome1=false;
                System.out.print("its not an palinrome!!");
                break;
            }
        }
        if(palindrome1==true){
            System.out.print("its an palindrome!!");
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome("aba");
    }
}
