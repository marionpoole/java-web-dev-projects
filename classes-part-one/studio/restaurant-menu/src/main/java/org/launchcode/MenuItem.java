package org.launchcode;

public class MenuItem {
    private String itemName;
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;

    public MenuItem(String itemName, Double price, String description, String category, Boolean isNew) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    private String getItemName() {
        return itemName;
    }

    private Double getPrice() {
        return price;
    }

    private String getDescription() {
        return description;
    }

    private String getCategory() {
        return category;
    }

    private Boolean getIsNew() {
        return isNew;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }



}
