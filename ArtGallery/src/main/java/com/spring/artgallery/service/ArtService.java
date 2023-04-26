package com.spring.artgallery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.artgallery.model.artgallery;
import com.spring.artgallery.repository.artgalleryRepository;

@Service
public class ArtService {
	
	@Autowired
	artgalleryRepository aRepo;

	public List<artgallery> get() {
		List<artgallery> aList=aRepo.findAll();
		return aList;
	}

	public artgallery save(artgallery a) {

		artgallery obj=aRepo.save(a);
		return obj;
	}
	
	public artgallery update(artgallery a) {
		artgallery obj=aRepo.save(a);
		return obj;
	}
	
	public void delete(int id) {
		aRepo.deleteById(id);
	}
	public artgallery get(int id) {
		artgallery obj=aRepo.findById(id).get();
		return obj;
	}
}
