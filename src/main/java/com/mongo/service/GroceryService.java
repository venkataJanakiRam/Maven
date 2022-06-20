package com.mongo.service;

import java.util.List;

import com.mongo.beans.GroceryItem;

public interface GroceryService {
	
	public GroceryItem saveItem(GroceryItem groceryItem);
	public List<GroceryItem> getItem();
	public GroceryItem updateItem(int id,GroceryItem groceryItem);
	public void deleteItem(int id);

}
