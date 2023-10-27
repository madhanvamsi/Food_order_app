package org.Tayana.FoodOrder.controller;

import org.Tayana.FoodOrder.dto.FoodOrder;
import org.Tayana.FoodOrder.dto.ResponseStructure;
import org.Tayana.FoodOrder.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

	@Autowired
	private FoodService service;
	
	@PostMapping("/food")
	public ResponseEntity<ResponseStructure<FoodOrder>> saveFoodOrder(@RequestBody FoodOrder order)
	{
		return service.saveFoodOrder(order);
	}
	
	@PutMapping("/food/{food_id}")
	public ResponseEntity<ResponseStructure<FoodOrder>> updateFoodOrder(@RequestBody FoodOrder order,@PathVariable int food_id)
	{
		return service.updateFoodOrder(order, food_id);
	}
	
	@DeleteMapping("/food/{id}")
	public ResponseEntity<ResponseStructure<String>> cancelOrder(@PathVariable int id)
	{
		return service.cancelOrder(id);
	}
}
