public class shortest_path {
    public static float displacement(String path){
        float x=0;
        float y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        float x2=x*x;
        float y2=y*y;
        float shortest_path=(float)Math.sqrt(x2+y2);
        return shortest_path;
    }

    public static void main(String[] args) {
        float shortest_path=displacement("WWWEEESSSNNN");
        System.out.println("Shortest distance is: "+shortest_path);
    }
}
