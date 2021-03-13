package ru.ermakovis.springcloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("happy")
public interface ProductClient {
    @GetMapping("/happy/products")
    List<ProductDto> getProducts();
}
