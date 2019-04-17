/* PROBLEM STATEMENT
Stock prices from yesterday and put them in an array called stockPrices, where:

The indices are the time (in minutes) past trade opening time, which was 9:30am local time.
The values are the price (in US dollars) of one share of Apple stock at that time.
So if the stock cost $500 at 10:30am, that means stockPrices[60] = 500.

Write an efficient method that takes stockPrices and returns the best profit 
I could have made from one purchase and one sale of one share of Apple stock yesterday.

For example:
int[] stockPrices = new int[] {10, 7, 5, 8, 11, 9};
getMaxProfit(stockPrices);
-> returns 6 (buying for $5 and selling for $11)
*/

public class StockProfit{

     public static void main(String []args){
        int[] stocks = new int[] { 2, 5, 7, 9, 11, 3, 4 };
        System.out.println("Max Profit of the Stocks [O(n)] : " + getMaxStockProfitGreedy(stocks));
        System.out.println("Max Profit of the Stocks [O(n^2)]: " + getMaxStockProfitONN(stocks));
     }
     
     //O(n*n) Approach
     public static int getMaxStockProfitONN(int[] stocks){
         
         if(stocks.length < 2){
             System.out.println("Getting a Profits need two prices");
         }
         
         int maxProfit = 0;
         
         for (int i=0; i < stocks.length; i++) {
             int buyPrice = stocks[i];
             for (int j=i+1; j < stocks.length; j++) {
                 int sellPrice = stocks[j];
                 int potentialProfit = sellPrice - buyPrice;
                 maxProfit = Math.max(maxProfit, potentialProfit);
             }
         }
         return maxProfit;
     }
     
     //Greedy Approach
     public static int getMaxStockProfitGreedy(int[] stocks){
         
         if(stocks.length < 2){
             System.out.println("Getting a Profits need two prices");
         }
         
         int minPrice = stocks[0];
         int maxProfit = stocks[1] - stocks[0];
         
         for (int i=1; i < stocks.length; i++) {
             int currentPrice = stocks[i];
             int potentialProfit = currentPrice - minPrice;
             maxProfit = Math.max(maxProfit, potentialProfit);
             minPrice = Math.min(currentPrice, minPrice);
         }
         return maxProfit;
     }
}
