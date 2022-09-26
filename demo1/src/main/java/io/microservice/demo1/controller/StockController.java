package io.microservice.demo1.controller;

import io.microservice.demo1.config.RabbitMQ;
import io.microservice.demo1.dto.Stock;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stock")
public class StockController {
    private final RabbitTemplate rabbitTemplate;

    public StockController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping
    public ResponseEntity<String> stock(@RequestBody Stock stock) {
        System.out.println(stock.id);
        rabbitTemplate.convertAndSend(RabbitMQ.EXCHANGE_NAME, RabbitMQ.ROUTING_KEY, stock);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
