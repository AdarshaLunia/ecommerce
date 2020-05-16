package com.demo.ecommerce.service;

import com.demo.ecommerce.entity.Items;
import com.demo.ecommerce.entity.SkuResponse;
import com.demo.ecommerce.repository.SKURepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SkuDataService {

    @Autowired
    SKURepo skuRepo;

    public SkuResponse getItemsBySku(String sku) {

        SkuResponse response = new SkuResponse();

        Optional<Items> itemById = skuRepo.findById(124L);
        if (itemById.isPresent()) {

            final Items items = itemById.get();
            Items itemsData = new Items();
            itemsData.setCatergory(items.getCatergory());
            itemsData.setItemName(items.getItemName());
            itemsData.setSkuNumber(items.getSkuNumber());

            response.setItems(itemsData);
            response.setHttpCode("200");
            response.setMessage("Data Found");

        } else
            return new SkuResponse("No Data Found", "200");

        return response;
    }

}
