
package productsales;

public class Product implements IProduct {

    // Single-dimensional array for product names
    private String[] productNames;

    // Two-dimensional array for monthly sales
    private int[][] sales;

    // Constructor
    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    // Calculate total products sold
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }

        return total;
    }

    // Calculate average products sold
    @Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();
        int numberOfSales = 0;

        for (int i = 0; i < sales.length; i++) {
            numberOfSales += sales[i].length;
        }

        return (double) total / numberOfSales;
    }

    // Determine the most popular product
    @Override
    public String GetMostPopularProduct() {

        int highestSales = 0;
        int popularIndex = 0;

        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }

            if (productTotal > highestSales) {
                highestSales = productTotal;
                popularIndex = i;
            }
        }

        return productNames[popularIndex];
    }
}
