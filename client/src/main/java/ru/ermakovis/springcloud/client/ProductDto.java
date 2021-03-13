package ru.ermakovis.springcloud.client;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String title;
    private int price;

}
