
package productsales;

import java.util.Scanner;

public class ProductSalesApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Single-dimensional array for product names
        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // Two-dimensional array for monthly sales
        int[][] sales = new int[3][3];

        // Enter sales figures for each product
        for (int i = 0; i < productNames.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + productNames[i]
                        + " mattress: ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        // Create Product object
        Product product = new Product(productNames, sales);

        // Create PrintProduct object
        PrintProduct printer = new PrintProduct();

        // Display sales report
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("****************************************");

        printer.printTotalProductSales(
                product.GetTotalProductsSold());

        printer.printAverageProductSales(
                product.GetAverageProductSold());

        printer.printMostPopularProduct(
                product.GetMostPopularProduct());

        input.close();
    }
}
