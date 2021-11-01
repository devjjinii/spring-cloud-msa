package com.yujin.catalogservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // null 값 데이터는 반환되지 않음.
public class ResponseCatalog {

    private String productId;
    private String productName;
    private Integer unitPrice;
    private Integer totalPrice;
    private Date createdAt;
}
