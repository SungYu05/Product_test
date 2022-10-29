package site.metacoding.firstapp.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.service.ProductService;
import site.metacoding.firstapp.web.dto.CMRespDto;
import site.metacoding.firstapp.web.dto.ProductListReqDto;
import site.metacoding.firstapp.web.dto.ProductSaveReqDto;
import site.metacoding.firstapp.web.dto.ProductUpdateReqDto;

@RequiredArgsConstructor
@Controller
public class ProductController {
	private final ProductService productService;
	
	@GetMapping("/product/add")
	public String saveForm() {
		return "product/saveForm";
	}
	
	@PostMapping("/product/add")
	public String add(ProductSaveReqDto productSaveReqDto) {
		productService.productSave(productSaveReqDto);
		return "product/saveForm";
	}
	
	@GetMapping("/product")
	public List<Product> product(ProductListReqDto productListReqDto){
		return productService.list(productListReqDto);
	}
	
	@GetMapping("/product/{productId}")
	public Product detailId(@PathVariable Integer productId) {
		return productService.detail(productId);
	}
	
	@DeleteMapping("/product/{productId}/delete")
	public String deleteId(@PathVariable Integer productId) {
		productService.delete(productId);
		return "ok";
	}
	
	@PutMapping("/product/{productId}/edit") 
		public String edit(@PathVariable Integer productId, @RequestBody ProductUpdateReqDto productUpdateReqDto) {
			productService.update(productId, productUpdateReqDto);
			return "ok";
		}
	
}

