package com.zensar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//This entity class will communicate with database table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity//This will persist this class into the database
@Table(name = "STOCKS")//This will persist data into STOCKS table
public class StockEntity {
	
	@Id//Primary key
	@GeneratedValue
	private int id;
	
	private String name;
	private String marketName;
	
	@Column(name = "stock_price")//This will create a table in database according to the name
	private int price;
}
