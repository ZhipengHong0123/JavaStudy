public class BestTimeStock121 {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int profit=prices[i]-prices[j];
                if (profit>maxprofit){
                    maxprofit=profit;
                }
            }
        }
        return maxprofit;
    }
    public int maxProfit1(int[] prices){
        int minprices=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int price : prices) {
            if (price<minprices){
                minprices=price;
            }
            if (price-minprices>maxprofit){
                maxprofit=price-minprices;
            }
        }
        return maxprofit;
    }
}
