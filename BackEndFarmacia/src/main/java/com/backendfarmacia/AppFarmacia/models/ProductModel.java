package com.backendfarmacia.AppFarmacia.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author VITOR ALEX
 * @since 1.0
 */

@Entity
@Table(name = "tb_product")
public class ProductModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduct;
	
	@Size(min = 3, max = 100)
	@NotBlank
	private String name;
	
	@NotBlank
	private float price;
	
	@ManyToOne
	@JsonIgnoreProperties("product")
	private Category category;

	
	
	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
