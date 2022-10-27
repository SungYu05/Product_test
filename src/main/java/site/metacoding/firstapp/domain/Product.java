package site.metacoding.firstapp.domain;

import java.sql.Timestamp;

import lombok.Getter;

@Getter
public class Product {
    private Integer productId;
    private String productName;
    private Integer productPrice;
    private Integer productQty;
    private Timestamp createdAt;
    
    // 상품삭제..?
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
    public void update(Product product) {
        this.productName = product.getProductName();
        this.productPrice = product.getProductPrice();
        this.productQty = product.getProductQty();
    }

}
