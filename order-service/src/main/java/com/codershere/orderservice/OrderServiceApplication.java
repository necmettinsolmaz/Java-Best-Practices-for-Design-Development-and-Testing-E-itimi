package com.codershere.orderservice;

import com.codershere.orderservice.entity.Order;
import com.codershere.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class OrderServiceApplication implements CommandLineRunner {
    @Autowired
    private OrderRepository orderRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order1 = new Order();
        order1.setTitle("Market Alışverişi");
        order1.setAmount(BigDecimal.valueOf(2500));


        System.out.println(orderRepository.getClass());
        orderRepository.save(order1);

        Order order2 = new Order();
        order2.setTitle("Manav Alışverişi");
        order2.setAmount(BigDecimal.valueOf(500));
        orderRepository.save(order2);

    }
}
