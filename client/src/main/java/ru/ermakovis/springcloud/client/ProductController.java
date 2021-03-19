package ru.ermakovis.springcloud.client;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@EnableFeignClients
public class ProductController {
    private final ProductClient client;

    @GetMapping("/products")
    public String getProducts(Model model) {
        model.addAttribute("products", client.getProducts());
        return "products";
    }
}
