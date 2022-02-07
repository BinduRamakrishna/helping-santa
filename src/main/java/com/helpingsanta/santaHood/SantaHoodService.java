package com.helpingsanta.santaHood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

@Service
public class SantaHoodService {

	public List<Integer> findMinimumWeight(Hood hood){
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> finalPresentWeights = new ArrayList<>();
		Integer capacity = hood.getHood_capacity();
		int num=0;
		for(int i=hood.getPresent_weights().size()-1; i>=0; i--) {
			Integer presentWeight=hood.getPresent_weights().get(i);
			if(capacity >= presentWeight) {
				num= capacity/presentWeight;
				map.put(presentWeight,num);
				capacity = capacity - (num * presentWeight);
				if(capacity!=0) {
					map.put(presentWeight, num-1);
					capacity=capacity + presentWeight;
				}
			}
		}
		
		for(Entry<Integer, Integer> key: map.entrySet()) {
			for(int i=key.getValue(); i>0;i--) {
				finalPresentWeights.add(key.getKey());
			}
		}
		
		return finalPresentWeights;
	}
}
