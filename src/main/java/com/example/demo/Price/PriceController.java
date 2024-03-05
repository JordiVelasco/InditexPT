package com.example.demo.Price;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PriceController {
    private final PriceService priceService;

    @Autowired
    public PriceController(PriceService priceService){
        this.priceService = priceService;
    }

    @GetMapping("/getPrice")
    public List<PriceEntity> getPrice() {
        return priceService.getPriceFromRepository();
    }

    @PostMapping("/postPrice")
    public PriceEntity postPrice(PriceEntity price){
        return priceService.postPrice(price);
    }
}
