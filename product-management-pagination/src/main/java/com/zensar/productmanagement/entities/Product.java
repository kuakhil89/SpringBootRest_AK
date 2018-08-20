package com.zensar.productmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Product")
/*@NamedQueries(value = { @NamedQuery(name = "Product.test", query = "SELECT p from Product p where p.productName=?1"),
						@NamedQuery(name = "Product.searchByNameAndPrice", query = "SELECT p from Product p where p.productName=?1 and p.productPrice=?2")})*/

/*@NamedNativeQueries(value = { @NamedNativeQuery(name = "", query = "") },
								@NamedNativeQuery(name = "", query = ""))*/


public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pid",nullable=false)
	private int productId;
	@Column(name="pname")
	private String productName;
	@Column(name="pprice")
	private int productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public Product(int productId, String productName, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [productId=");
		builder.append(productId);
		builder.append(", productName=");
		builder.append(productName);
		builder.append(", productPrice=");
		builder.append(productPrice);
		builder.append("]");
		return builder.toString();
	}
	
	public Product()
	{
		
	}

}
