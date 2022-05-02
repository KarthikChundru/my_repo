package com.zensar.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "stocks")
public class StockDocument {
	@Id
	private int id;
	
	private String name;
	
	private String marketName;
	
	private int price;

}
