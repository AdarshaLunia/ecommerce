package com.demo.ecommerce;

import com.demo.ecommerce.controller.SearchController;
import com.demo.ecommerce.entity.SkuResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {

    @Autowired
    private SearchController searchController;

    @Test
    public void getAllProductsTestCase() {
        SkuResponse products = searchController.getProductBySKU("123-abc");
        assertNotNull(products);
        assertNotNull(products.getItemsList());
        assertEquals(200, products.getHttpCode());
    }
}
