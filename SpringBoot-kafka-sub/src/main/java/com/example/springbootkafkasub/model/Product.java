package com.example.springbootkafkasub.model;

import lombok.Data;

@Data
public class Product {
    private String name;
    private String description;
    private int price;
}