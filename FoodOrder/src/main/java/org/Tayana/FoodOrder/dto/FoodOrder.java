package org.Tayana.FoodOrder.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class FoodOrder
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name ;
	@CreationTimestamp
	private LocalDateTime order_time;
	@UpdateTimestamp
	private LocalDateTime delivery_time;
	@Column(nullable = false)
	private double cost;
	@Column(nullable = false)
	private String food_item;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getOrder_time() {
		return order_time;
	}

	public void setOrder_time(LocalDateTime order_time) {
		this.order_time = order_time;
	}

	public LocalDateTime getDelivery_time() {
		return delivery_time;
	}

	public void setDelivery_time(LocalDateTime delivery_time) {
		this.delivery_time = delivery_time;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getFood_item() {
		return food_item;
	}

	public void setFood_item(String food_item) {
		this.food_item = food_item;
	}

	@Override
	public String toString() {
		return "FoodOrder [id=" + id + ", name=" + name + ", order_time=" + order_time + ", delivery_time="
				+ delivery_time + ", cost=" + cost + ", food_item=" + food_item + "]";
	}
	
	
	
	
	
}
