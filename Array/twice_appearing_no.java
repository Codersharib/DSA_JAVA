public class twice_appearing_no {
    public static boolean no_appears_twice(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    return true;
                }
            }
        }
        return false;
    }
// O(n2)
    public static void main(String[] args) {
        int array[]={3,2,8,1,2};
        System.out.println(no_appears_twice(array));
    }
}
