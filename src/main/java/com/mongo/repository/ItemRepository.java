package com.mongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.beans.GroceryItem;

@Repository
public interface ItemRepository extends MongoRepository<GroceryItem, Integer> {
    
    

}
