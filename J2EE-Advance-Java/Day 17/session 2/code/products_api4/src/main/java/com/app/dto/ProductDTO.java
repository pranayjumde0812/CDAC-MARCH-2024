package com.app.dto;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.app.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO extends BaseDTO {
	@NotEmpty
	private String name;	
	@NotNull
	private Category category;
	private double price;
	private int quantity;
}
