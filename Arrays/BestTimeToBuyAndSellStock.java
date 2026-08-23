 import java.util.Scanner;
 public class BestTimeToBuyAndSellStock {
    public static int maxStockProfit(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }else{
                maxProfit=Math.max(maxProfit,price-minPrice);
            }
            }
            return maxProfit;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int n=sc.nextInt();
            int[] prices=new int[n];
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<n;i++){
                prices[i]=sc.nextInt();
            }
            int result=maxStockProfit(prices);
            System.out.println("Maximum profit: " + result);
        }
    }

