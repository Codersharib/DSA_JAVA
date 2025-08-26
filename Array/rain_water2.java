public class rain_water2 {
    public static int trapped_water(int[] height){
//        leftmax
        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
//        rightmax
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
//        trapped water
        int trapped_water=0;
        for(int i=0;i<n;i++){
            int water_level=Math.min(leftmax[i],rightmax[i]);
            trapped_water+=water_level-height[i];
        }
        return trapped_water;
    }

    public static void main(String[] args) {
        int height[]={1,6,2,5};
        System.out.println(trapped_water(height));
    }
}
