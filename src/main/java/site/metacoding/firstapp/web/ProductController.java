package site.metacoding.firstapp.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.service.ProductService;
import site.metacoding.firstapp.web.dto.ProductListReqDto;
import site.metacoding.firstapp.web.dto.ProductSaveReqDto;
import site.metacoding.firstapp.web.dto.ProductUpdateReqDto;

@RequiredArgsConstructor
@RestController
public class ProductController {
	private final ProductService productService;
	
	@GetMapping("/product")
	public List<Product> product(ProductListReqDto productListReqDto){
		return productService.List(productListReqDto);
	}

	@PostMapping("/product/add")
	public String add(@RequestBody ProductSaveReqDto productSaveReqDto) {
		productService.ProductSave(productSaveReqDto);
		return "ok";
	}
	
	@GetMapping("/product/{productId}")
	public Product DetailId(@PathVariable Integer productId) {
		return productService.Detail(productId);
	}
	
	@DeleteMapping("/product/{productId}/delete")
	public String DeleteId(@PathVariable Integer productId) {
		productService.Delete(productId);
		return "ok";
	}
	
	@PutMapping("/product/{productId}/edit") 
		public String edit(@PathVariable Integer productId, @RequestBody ProductUpdateReqDto productUpdateReqDto) {
			productService.Update(productId, productUpdateReqDto);
			return "ok";
		}
	
}

