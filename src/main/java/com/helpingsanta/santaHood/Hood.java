package com.helpingsanta.santaHood;

import java.util.List;

public class Hood {

	private Integer hood_capacity;
	private List<Integer> present_weights;
	
	public Hood(Integer hood_capacity, List<Integer> present_weights) {
		super();
		this.hood_capacity = hood_capacity;
		this.present_weights = present_weights;
	}

	public Hood() {
		super();
	}

	public Integer getHood_capacity() {
		return hood_capacity;
	}

	public void setHood_capacity(Integer hood_capacity) {
		this.hood_capacity = hood_capacity;
	}

	public List<Integer> getPresent_weights() {
		return present_weights;
	}

	public void setPresent_weights(List<Integer> present_weights) {
		this.present_weights = present_weights;
	}
	
	
	
}
