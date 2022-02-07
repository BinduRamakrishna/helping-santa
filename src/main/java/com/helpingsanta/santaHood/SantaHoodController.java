package com.helpingsanta.santaHood;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SantaHoodController {

	@Autowired
	private SantaHoodService santaHoodService;
	
	@PostMapping("/hoodfiller")
	public List<Integer> hoodFiller(@RequestBody Hood hood){
		return santaHoodService.findMinimumWeight(hood);
	}
	
	
}
