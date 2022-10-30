package site.metacoding.firstapp.domain;

import java.sql.Timestamp;

import lombok.Getter;
import site.metacoding.firstapp.web.dto.product.ProductUpdateReqDto;

@Getter
public class Product {
    private Integer productId;
    private String productName;
    private Integer productPrice;
    private Integer productQty;
    private Timestamp createdAt;
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    
    private Product() {
    } // MyBatis에게 필요한 것

    // 상품 등록
    public Product(String productName, Integer productPrice, Integer productQty) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQty = productQty;
    }
    
    // 상품 수정
    public void update(ProductUpdateReqDto productUpdateReqDto) {
    	this.productName = productUpdateReqDto.getProductName();
        this.productPrice = productUpdateReqDto.getProductPrice();
        this.productQty = productUpdateReqDto.getProductQty();
    }

}
