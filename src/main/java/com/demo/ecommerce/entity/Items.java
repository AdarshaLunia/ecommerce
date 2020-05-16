package com.demo.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String itemName;

    @Enumerated(EnumType.STRING)
    private Catergory catergory;

    private String skuNumber;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Catergory getCatergory() {
        return catergory;
    }

    public void setCatergory(Catergory catergory) {
        this.catergory = catergory;
    }

    public String getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemName='" + itemName + '\'' +
                ", catergory=" + catergory +
                ", skuNumber='" + skuNumber + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
