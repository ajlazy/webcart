package com.capgemini.website.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.website.entity.Order;

public interface OrderRepository extends MongoRepository<Order, Integer> {

}
