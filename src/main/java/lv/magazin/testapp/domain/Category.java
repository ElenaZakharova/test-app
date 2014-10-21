package lv.magazin.testapp.domain;

/**
 * Доменное название категории товаров
 */
public class Category {

    private String categoryName;
    private long categoryId;

    public Category(String categoryName, long categoryId){
        this.categoryName = categoryName;
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public long getCategoryId() { return categoryId; }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryId (long categoryId) { this.categoryId = categoryId; }
}
