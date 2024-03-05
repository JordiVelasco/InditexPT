package com.example.demo.Price;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {
    private final PriceRepository priceRepository;

    @Autowired
    public PriceService(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public List<PriceEntity> getPriceFromRepository() {
        return priceRepository.findAll();
    }

    public PriceEntity postPrice(PriceEntity price){
        return priceRepository.save(price);
    }
}