package org.Tayana.FoodOrder.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.Tayana.FoodOrder.dao.FoodDao;
import org.Tayana.FoodOrder.dto.FoodOrder;
import org.Tayana.FoodOrder.dto.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class FoodService {

	
	@Autowired
	private FoodDao fdao;
	
	public ResponseEntity<ResponseStructure<FoodOrder>>  saveFoodOrder(FoodOrder order)
	{
		ResponseStructure<FoodOrder>structure=new ResponseStructure<FoodOrder>();
		structure.setData(fdao.saveFoodOrder(order));
		structure.setMessage("food order received by the user");
		structure.setStatusCode(HttpStatus.ACCEPTED.value());
		return new ResponseEntity<ResponseStructure<FoodOrder>>(structure, HttpStatus.ACCEPTED);
	}
	
	
	public ResponseEntity<ResponseStructure<FoodOrder>>  updateFoodOrder(FoodOrder order,int food_id)
	{
		Optional<FoodOrder> f=fdao.FindById(food_id);
		if(f.isPresent())
		{
			
	
		ResponseStructure<FoodOrder>structure=new ResponseStructure<FoodOrder>();
		structure.setData(fdao.updateFoodOrder(order));
		structure.setMessage("food order updated by the user");
		structure.setStatusCode(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<FoodOrder>>(structure, HttpStatus.CREATED);
		}
		else 
		{
			return null;
		}
	}
	
	public ResponseEntity<ResponseStructure<String>> cancelOrder(int id)
	{
		ResponseStructure<String> structure=new ResponseStructure<String>();
		boolean f=fdao.cancelOrder(id);
		structure.setData("data deleted successfully");
		structure.setMessage("deletd the data ");
		structure.setStatusCode(HttpStatus.OK.value());
		return new  ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.OK);
	}
}
