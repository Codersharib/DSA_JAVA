public class largest_string {
    public static void main(String[] args) {
        String games[]={"Cricket","Football","hockey","chess","Khokho"};
        String largest=games[0];
        for(int i=0;i<games.length;i++){
            if(largest.compareTo(games[i])<0){
                largest=games[i];
            }
        }
//        ignoring lowercase and uppercase
        String largest2=games[0];
        for(int i=0;i<games.length;i++){
            if(largest2.compareToIgnoreCase(games[i])<0){
                largest2=games[i];
            }
        }
        System.out.println("largest string is (after using compareTo) :"+largest);
        System.out.println("largest string is (after using compareToIgnoreCase) :"+largest2);
    }
}
