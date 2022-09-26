package com.example.demo2.consumer;

import com.example.demo2.Stock;
import com.example.demo2.RabbitMQ;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class StockConsumer {

    @RabbitListener(queues = RabbitMQ.QUEUE_NAME)
    public void listener(Stock stock) {
        System.out.println("ouvindo fila_estoque " + stock.id());
    }
}
