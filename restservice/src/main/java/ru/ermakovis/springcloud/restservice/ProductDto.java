package ru.ermakovis.springcloud.restservice;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String title;
    private int price;

    public static ProductDto mapEntity(ProductEntity entity) {
        ProductDto dto = new ProductDto();
        dto.setId(entity.getId());
        dto.setPrice(entity.getPrice());
        dto.setTitle(entity.getTitle());
        return dto;
    }
}
