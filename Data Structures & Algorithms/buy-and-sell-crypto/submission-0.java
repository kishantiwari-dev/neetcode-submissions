class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        int profit=0;
        for(int i=0;i<prices.length-1;i++)
        {
            int j=i+1;
            if(prices[i]<min)
            {
            min=Math.min(prices[i],min);
            max=0;
            }
            max=Math.max(prices[j],max);
            profit=Math.max(max-min,profit);
        }
        return profit;
    }
}
