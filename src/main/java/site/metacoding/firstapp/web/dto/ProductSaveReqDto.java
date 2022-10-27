package site.metacoding.firstapp.web.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.firstapp.domain.Product;

@NoArgsConstructor
@Getter
@Setter
public class ProductSaveReqDto {
	private String productName;
	private Integer productPrice;
    private Integer productQty;
    
    public Product toEntity() {
    	Product product = new Product(productName, productPrice, productQty);
		return product;
    }
    
}
