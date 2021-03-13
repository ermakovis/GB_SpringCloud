package ru.ermakovis.springcloud.restservice;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ProductControllerImpl implements ProductController {
    private final ProductsRepository repository;

    @GetMapping("/products")
    public List<ProductDto> getProducts() {
        return repository.findAll()
                .stream()
                .map(ProductDto::mapEntity)
                .collect(Collectors.toList());
    }
}
