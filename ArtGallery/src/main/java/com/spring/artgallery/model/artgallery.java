package com.spring.artgallery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "artgallery")
public class artgallery {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int artid;
	private String title;
	private String artistname;
	private String yom;
	private String artstyle;
	private String price;
	private String rating;
	private String rental;
	public int getArtid() {
		return artid;
	}
	public void setArtid(int artid) {
		this.artid = artid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtistname() {
		return artistname;
	}
	public void setArtistname(String artistname) {
		this.artistname = artistname;
	}
	public String getYom() {
		return yom;
	}
	public void setYom(String yom) {
		this.yom = yom;
	}
	public String getArtstyle() {
		return artstyle;
	}
	public void setArtstyle(String artstyle) {
		this.artstyle = artstyle;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getRental() {
		return rental;
	}
	public void setRental(String rental) {
		this.rental = rental;
	}

}
