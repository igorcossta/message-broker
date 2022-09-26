package io.microservice.demo1.controller;

import io.microservice.demo1.dto.Price;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/price")
public class PriceController {

    @PostMapping
    public ResponseEntity<String> changePrice(@RequestBody Price priceDto) {
        System.out.println(priceDto.id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
