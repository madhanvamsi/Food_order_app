package org.Tayana.FoodOrder.dao;

import java.time.LocalDateTime;
import java.util.Optional;

import org.Tayana.FoodOrder.dto.FoodOrder;
import org.Tayana.FoodOrder.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FoodDao {
 
	@Autowired
	private FoodRepository repository;
	
	public FoodOrder saveFoodOrder(FoodOrder order)
	{
		return repository.save(order);
	}
	

	public FoodOrder updateFoodOrder(FoodOrder order)
	{
		return repository.save(order);
	}
	
	public Optional<FoodOrder> FindById(int food_id)
	{
		return repository.findById(food_id);
	}
	
	
	public boolean cancelOrder(int id)
	{
		 repository.deleteById(id);
		return true;		
	}

}
