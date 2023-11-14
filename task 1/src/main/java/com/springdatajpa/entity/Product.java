package com.springdatajpa.entity;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private Double price;

    public Product(int id, String name, String description, Double price, Sale sale) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.sale = sale;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Sid")
    private Sale sale;
	   @Column(name = "Sid")
	    private int SId;

    
}
