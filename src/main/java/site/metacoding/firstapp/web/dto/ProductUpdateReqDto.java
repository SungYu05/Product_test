package site.metacoding.firstapp.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.firstapp.domain.Product;

@Getter
@Setter
public class ProductUpdateReqDto {
	private Integer productPrice;
    private Integer productQty;
    
}
