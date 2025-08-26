public class buysellstock2 {
    public static int buy_sell_stock(int[] prices){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[]={4,8,3,2};
        System.out.println(buy_sell_stock(prices));
    }
}
