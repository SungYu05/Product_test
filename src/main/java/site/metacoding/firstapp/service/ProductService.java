package site.metacoding.firstapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.domain.ProductDao;
import site.metacoding.firstapp.web.dto.product.ProductListReqDto;
import site.metacoding.firstapp.web.dto.product.ProductSaveReqDto;
import site.metacoding.firstapp.web.dto.product.ProductUpdateReqDto;

@RequiredArgsConstructor
@Service
public class ProductService {
	private final ProductDao productDao;
	
	public boolean checkProductName(String productName) {
		Product productPS = productDao.findByProductName(productName);
		if(productPS == null) { // 상품명이 중복 안됨
			return false;
		}else { // 상품명이 중복됨
			return true;
		}
	}
	
	public void productSave(ProductSaveReqDto saveReqDto) {
		productDao.insert(saveReqDto.toEntity());	
	}
	
	public List<Product> list(ProductListReqDto productListReqDto){
		return productDao.findAll();
	}
	
	public Product detail(Integer productId) {
		Product productPs = productDao.findById(productId);
		return productPs;
	}
	
	public void delete(Integer productId) {
		Product productPs = productDao.findById(productId);
		productDao.deleteById(productId);
	}
	
	public Product update(Integer productId, ProductUpdateReqDto productUpdateReqDto) {
		// 영속화
		Product productPs = productDao.findById(productId);
		// 객체 변경
		productPs.update(productUpdateReqDto);
		// 디비 변경
		productDao.update(productPs);


		return productPs;
	}
	

}
