package site.metacoding.firstapp.web.dto.product;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.firstapp.domain.Product;

@NoArgsConstructor
@Getter
@Setter
public class ProductListReqDto {
	private String productName;
	private Integer productPrice;
    private Integer productQty;
    
    public Product toEntity() {
    	Product product = new Product(productName, productPrice, productQty);
		return product;
    }
    
}
