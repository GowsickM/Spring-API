package com.spring.artgallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.artgallery.model.artgallery;

@Repository
public interface artgalleryRepository extends JpaRepository<artgallery, Integer>{

}
