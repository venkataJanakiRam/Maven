package com.momgo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.beans.GroceryItem;
import com.mongo.service.GroceryService;

@RestController
@RequestMapping("/Item")
public class ItemController {
	
	@Autowired
	private GroceryService customService;
	
	@PostMapping("/Save")
	public GroceryItem  saveItem(@RequestBody GroceryItem groceryItem) {
		System.out.println("hello");
		return customService.saveItem(groceryItem);
	}
	
	@GetMapping("/list")
	public List<GroceryItem>  getItem(@RequestBody GroceryItem groceryItem) {
		
		return customService.getItem();
	}
	
	@PutMapping("/update/{gid}")
	public GroceryItem  updateItem(@RequestBody GroceryItem groceryItem,@PathVariable("gid") int id) {
		
		return customService.updateItem(id, groceryItem);
	}
	
	
	@PutMapping("/delete/{gid}")
	public String  deleteItem(@PathVariable("gid") int  id) {
		
		 customService.deleteItem(id);
		 
		 return "deleted sucessfully";
	}
	
	

}
