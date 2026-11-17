
package Question2;


public class ProductsSaleQ2 implements IProductSales{

 
    private final int[][] productSales;
    private final int salesLimit;

    // Data and limit are passed in so the class is easy to unit test
    public ProductSalesQ2(int[][] productSales, int salesLimit) {
        this.productSales = productSales;
        this.salesLimit = salesLimit;
    }

    @Override
    public int[][] GetProductSales() {
        return productSales;
    }

    @Override
    public int GetTotalSales() {
        int total = 0;
        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
            }
        }
        return total;
    }

    // Counts sales strictly above the limit
    @Override
    public int GetSalesOverLimit() {
        int count = 0;
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale > salesLimit) {
                    count++;
                }
            }
        }
        return count;
    }

    // Counts sales strictly below the limit
    @Override
    public int GetSalesUnderLimit() {
        int count = 0;
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale < salesLimit) {
                    count++;
                }
            }
        }
        return count;
    }

    // Each row is one year, so rows = years processed
    @Override
    public int GetProductsProcessed() {
        return productSales.length;
    }

    @Override
    public double GetAverageSales() {
        int count = 0;
        for (int[] year : productSales) {
            count += year.length;
        }
        return (double) GetTotalSales() / count;
    }
}  

