package com.springdatajpa.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Sid;

    private String description;
    public Sale(int Sid, String description, Double total, Set<Product> products) {
		super();
		this.Sid = Sid;
		this.description = description;
		this.total = total;
		this.products = products;
	}

	public int getId() {
		return Sid;
	}

	public void setId(int id) {
		this.Sid = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	private Double total;

    @OneToMany(mappedBy = "sale", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Product> products;

}
