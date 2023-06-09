package com.spring.artgallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.artgallery.model.artgallery;
import com.spring.artgallery.service.ArtService;

@RestController
public class ArtController {
	@Autowired
	ArtService aService;
	
	@GetMapping("/fetch")
	public List<artgallery> get(){
		List<artgallery> aList=aService.get();
		return aList;
	}
	
	@PostMapping("/save")
	public artgallery save(@RequestBody artgallery a)
	{
		return aService.save(a);
	}
	@PutMapping("/update")
	public artgallery update(@RequestBody artgallery a)
	{
		return aService.update(a);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		aService.delete(id);
	}
	@GetMapping("/get/{id}")
	public artgallery get(@PathVariable("id") int id) {
		return aService.get(id);
	}
	
}
