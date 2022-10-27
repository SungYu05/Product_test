package site.metacoding.firstapp.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.ProductDao;
import site.metacoding.firstapp.web.dto.ProductSaveReqDto;

@RequiredArgsConstructor
@Service
public class ProductService {
	private final ProductDao productDao;
	
	public void ProductSave(ProductSaveReqDto saveReqDto) {
		productDao.insert(saveReqDto.toEntity());
	}
}
