package com.demo.ecommerce.controller;

import com.demo.ecommerce.entity.SkuResponse;
import com.demo.ecommerce.service.SkuDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class SearchController {

    @Autowired
    SkuDataService skuDataService;

    @RequestMapping(value = "/sku", method = RequestMethod.GET)
    public SkuResponse getProductBySKU(@RequestParam String sku) {
        return skuDataService.getItemsBySku(sku);
    }
}
