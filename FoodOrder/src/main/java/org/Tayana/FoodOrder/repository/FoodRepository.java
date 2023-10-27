package org.Tayana.FoodOrder.repository;

import org.Tayana.FoodOrder.dto.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<FoodOrder, Integer>{

}
