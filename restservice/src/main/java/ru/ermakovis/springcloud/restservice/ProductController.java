package ru.ermakovis.springcloud.restservice;

import java.util.List;

public interface ProductController {
    List<ProductDto> getProducts();
}
