package site.metacoding.firstapp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.service.ProductService;
import site.metacoding.firstapp.web.dto.ProductSaveReqDto;

@RequiredArgsConstructor
@RestController
public class ProductController {
	private final ProductService productService;
	

	
	@PostMapping("/product/add")
	public String add(@RequestBody ProductSaveReqDto productSaveReqDto) {
		productService.ProductSave(productSaveReqDto);
		return "ok";
	}


}
