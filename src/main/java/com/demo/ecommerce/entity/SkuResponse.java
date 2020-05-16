package com.demo.ecommerce.entity;

import java.util.List;

public class SkuResponse extends Response {

    private List<Items> itemsList;
    private Items items;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public SkuResponse(String message, String errorCode) {
        super(message, errorCode);
    }

    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public SkuResponse() {
        super();
    }
}
