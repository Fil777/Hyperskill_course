public class Main {
    public static void main(String[] args) {
        double[] prices = {123.44, 768.93};
        int[] quantities = {2, 1};
        double total = -1.1;
        total = calculateTotalCost(prices, quantities);
        System.out.println(total);
    }

    public static class ShoppingCart {

        public double calculateTotalCost(double[] itemPrices, int[] itemQuantities) {
            double totalCost = 0.0;
            for (int i = 0; i < itemPrices.length; i++) {
                totalCost += itemPrices[i] * itemQuantities[i];
            }
            return totalCost;
        }
    }
}