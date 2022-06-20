package com.mongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.beans.GroceryItem;
import com.mongo.repository.ItemRepository;

@Service
public class GroceryServiceImpl implements GroceryService {
	
	@Autowired
	private ItemRepository itemRepository;

	@Override
	public GroceryItem saveItem(GroceryItem groceryItem) {
		// TODO Auto-generated method stub
		return itemRepository.save(groceryItem);
	}

	@Override
	public List<GroceryItem> getItem() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	
	public GroceryItem updateItem(int id, GroceryItem groceryItem) {
		
		Optional<GroceryItem> findById=itemRepository.findById(id);
		if(findById.isPresent()) {
			GroceryItem ObjItem=findById.get();
			if(groceryItem.getName() != null && !groceryItem.getName().isEmpty());
			ObjItem.setName(groceryItem.getName());
					}
		
		return null;
	}

	@Override
	public void deleteItem(int id) {
		// TODO Auto-generated method stub
		itemRepository.deleteById(id);
	}

	
	
	

	

}
