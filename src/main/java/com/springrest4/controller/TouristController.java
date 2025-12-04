package com.springrest4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest4.handleexception.TouristNotFoundException;
import com.springrest4.model.Tourist;
import com.springrest4.service.TouristService;

@RestController
public class TouristController {
	
	@Autowired
	private TouristService service;
	@PostMapping("/register")
	public ResponseEntity<String> regsiterTourists(@RequestBody Tourist tourist){
		String registerTourist = service.registerTourist(tourist);
		return new ResponseEntity<String>(registerTourist,HttpStatus.CREATED);
	}
	
	@GetMapping("/getTourist/{id}")
	public ResponseEntity<?> getTouristById(@PathVariable("id")int id){
		Tourist touristById = service.getTouristById(id);
		return new ResponseEntity<Tourist>(touristById,HttpStatus.OK);
	}
	
	@GetMapping("/getAllTourist")
	public ResponseEntity<?> getAllTourist(){
		List<Tourist> allTourist = service.getAllTourist();
		return new ResponseEntity<List<Tourist>>(allTourist,HttpStatus.OK);
	}
	
	@PutMapping("/updateTourist")
	public ResponseEntity<String> updateTourist(@RequestBody Tourist tourist){
		String updateTourist = service.updateTourist(tourist);
		return new ResponseEntity<String>(updateTourist,HttpStatus.OK);
	} 
	
	@PatchMapping("/updateNation/{id}/{nationality}")
	public ResponseEntity<String> updateNation(@PathVariable("id")int id,@PathVariable("nationality")String nationality){
		String updateTouristNation = service.updateTouristNation(id, nationality);
		return new ResponseEntity<String>(updateTouristNation,HttpStatus.OK);
	}
	
	@PostMapping("/registerAll")
	public ResponseEntity<String> regsiterAllTourists(@RequestBody List<Tourist> tourist){
		String registerAllTourist = service.registerAllTourist(tourist);
		return new ResponseEntity<String>(registerAllTourist,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteByTouristId(@PathVariable("id") int id){
		String deleteTouristById = service.deleteTouristById(id);
		return new ResponseEntity<String>(deleteTouristById,HttpStatus.OK);
	}
	
}
