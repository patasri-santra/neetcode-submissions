class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;

        for(int i=0; i<prices.length-1; i++){
            int buy = prices[i];
            int j=i+1;
            while(j<prices.length){
                int sell = prices[j];

                profit = Math.max(profit, sell-buy);
                j++;
            }
        }

        return profit;
        
    }
}
