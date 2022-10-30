package site.metacoding.firstapp.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.service.ProductService;
import site.metacoding.firstapp.web.dto.ProductListReqDto;
import site.metacoding.firstapp.web.dto.ProductSaveReqDto;
import site.metacoding.firstapp.web.dto.ProductUpdateReqDto;

@RequiredArgsConstructor
@Controller
public class ProductController {
	private final ProductService productService;
	
	// 상품등록하기
	@GetMapping("/product/add")
	public String saveForm() {
		return "product/saveForm";
	}
	
	@PostMapping("/product/add")
	public String add(ProductSaveReqDto productSaveReqDto) {
		productService.productSave(productSaveReqDto);
		return "redirect:/";
	}
	
	// 상품목록보기
	@GetMapping({"/product", "/"})
	public String product(Model model,ProductListReqDto productListReqDto){
		List<Product> productList = productService.list(productListReqDto);
		model.addAttribute("productList", productList);
		return "product/list";
	}
	
	// 상품상세보기
	@GetMapping("/product/{productId}")
	public String detailId(Model model, @PathVariable Integer productId) {
		Product product = productService.detail(productId);
		model.addAttribute("product", product);
		return "product/detail";
	}
	
	// 상품수정하기
	@GetMapping("/product/{productId}/edit")
	public String editForm(@PathVariable Integer productId, ProductUpdateReqDto productUpdateReqDto, Model model) {
		Product productPS = productService.detail(productId);
		//Product productPS = productService.update(productId, productUpdateReqDto);
		model.addAttribute("edit", productPS);
		return "product/edit";
	}
	
	@PostMapping("/product/{productId}/edit") 
		public String edit(@PathVariable Integer productId, ProductUpdateReqDto productUpdateReqDto, Model model) {
		Product productPS = productService.update(productId, productUpdateReqDto);
		model.addAttribute("edit", productPS);
		return "redirect:/";
		}
	
	// 상품삭제하기
	@DeleteMapping("/product/{productId}/delete")
	public String deleteId(@PathVariable Integer productId) {
		productService.delete(productId);
		return "ok";
	}
	
}

