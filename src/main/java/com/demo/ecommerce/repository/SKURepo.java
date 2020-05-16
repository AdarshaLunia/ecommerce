package com.demo.ecommerce.repository;

import com.demo.ecommerce.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SKURepo extends JpaRepository<Items,Long> {
}
