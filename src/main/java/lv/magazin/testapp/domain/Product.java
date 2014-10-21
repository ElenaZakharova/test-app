package lv.magazin.testapp.domain;

/**
 * Доменные данные товара
 */
public class Product {

    private String productName;
    private long productId;
    private long productPrice;
    private long categoryId;

    public String getProductName() {
        return productName;
    }

    public long getProductId() { return productId; }

    public long getProductPrice() { return productPrice; }

    public long getCategoryId() { return categoryId; }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId (long productId) { this.productId = productId; }

    public void setProductPrice(long productPrice) {
        this.productPrice = productPrice;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public Product (String productName, long productId, long productPrice, long categoryId) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.categoryId = categoryId;
    }


}
