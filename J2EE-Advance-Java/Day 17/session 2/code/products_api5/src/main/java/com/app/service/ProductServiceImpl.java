package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ApiException;
import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dto.ApiResponse;
import com.app.dto.ProductDTO;
import com.app.entities.Product;
import com.app.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public ApiResponse addProduct(ProductDTO dto) {
		Product product = mapper.map(dto, Product.class);
		productRepository.save(product);
		return new ApiResponse("Added new product with ID " + product.getId());
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public ApiResponse purchase(Long productId, int qty) {
		Product product = productRepository.findById(productId)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid product id !!!!"));
		product.setQuantity(product.getQuantity() - qty);
		return new ApiResponse("Purchased product ");
	}

	@Override
	public ApiResponse deleteProductDetails(Long id) {
		if (productRepository.existsById(id)) {
			productRepository.deleteById(id);
			return new ApiResponse("deleted product");
		}
		throw  new ApiException("product deletion failed: Invalid Product Id");
	}

}
